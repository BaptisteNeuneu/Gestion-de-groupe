package fr.iutfbleau.projetIHM2022FI2.Admin.Controleur;

import java.awt.event.*;
import java.util.Set;

import javax.swing.*;
import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;


public class ActionAdminInstru implements ActionListener {
   boolean a;
   AbstractGroupeFactory gestiongroupe;
   String nometudiant, sousgroupe, newgroupe,nummintext,nummaxtext,nbrpartitiontext;
   JButton valaddetu,valcreegroup,valsupgroup,valrengroup,valdepetu;
   public ActionAdminInstru(JTextField nummin,JTextField nummax,JTextField nbrpartition,JCheckBox partition,JLabel nom,JLabel sous,JLabel newg,JButton valaddetu,JButton valcreegroup,JButton valsupgroup,JButton valrengroup,JButton valdepetu,AbstractGroupeFactory gestiongroupe){
    this.nometudiant = nom.getText();
    this.sousgroupe = sous.getText();
    this.newgroupe = newg.getText();
    this.nummintext = nummin.getText();
    this.nummaxtext = nummax.getText();
    this.nbrpartitiontext = nbrpartition.getText();
    this.a = partition.isSelected();
    this.valaddetu = valaddetu;
    this.valcreegroup = valcreegroup;
    this.valsupgroup = valsupgroup;
    this.valrengroup = valrengroup;
    this.valdepetu = valdepetu;
    this.gestiongroupe = gestiongroupe;
   }
    

   public void actionPerformed(ActionEvent e){
      

      if(e.getSource() == valaddetu){
         Set<Etudiant> listeetu = gestiongroupe.getEtudiants(nometudiant);
         for (Etudiant a : listeetu) {
            if (a.getNom() == nometudiant) {
               break;
            }
         }
         Groupe pere = gestiongroupe.getGroupeByName(sousgroupe);
         gestiongroupe.addToGroupe(pere,a);
      }

      if(e.getSource() == valcreegroup){
         if(a== true){
            int nbrpartition = Integer.parseInt(nbrpartitiontext);
            Groupe pere = gestiongroupe.getGroupeByName(sousgroupe);
            gestiongroupe.createPartition(pere,newgroupe,nbrpartition);
         } else {
         Groupe pere = gestiongroupe.getGroupeByName(sousgroupe);
         int nbrmin = Integer.parseInt(nummintext);
         int nbrmax = Integer.parseInt(nummaxtext);
         gestiongroupe.createGroupe(pere,newgroupe,15,60);
         }
      }

      if(e.getSource() == valrengroup){
         Groupe pere = gestiongroupe.getGroupeByName(sousgroupe);
         pere.setName(newgroupe);
      }

      if(e.getSource() == valsupgroup){
         Groupe pere = gestiongroupe.getGroupeByName(sousgroupe);
         gestiongroupe.deleteGroupe(pere);
      }

      if(e.getSource() == valdepetu){
         Groupe pere = gestiongroupe.getGroupeByName(sousgroupe);
         Groupe fils = gestiongroupe.getGroupeByName(newgroupe);
         Set<Etudiant> listeetu = pere.getEtudiants(nometudiant);
         for (Etudiant a : listeetu) {
            if (a.getNom() == nometudiant) {
               break;
            }
         }
         gestiongroupe.dropFromGroupe(pere,a);
         gestiongroupe.addToGroupe(fils,a);
      }

}
}
