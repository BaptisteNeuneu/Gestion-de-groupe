package fr.iutfbleau.projetIHM2022FI2.Admin.Controleur;

import java.awt.event.*;
import java.util.Set;

import javax.swing.*;
import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;
import fr.iutfbleau.projetIHM2022FI2.MP.*;


public class ActionAdminInstru implements ActionListener {

   AbstractGroupeFactory gestiongroupe;
   AbstractChangementFactory gestionchangement;
   String nometudiant, sousgroupe, newgroupe;
   JButton valaddetu,valcreegroup,valsupgroup,valrengroup,valdepetu;
   public ActionAdminInstru(JLabel nom,JLabel sous,JLabel newg,JButton valaddetu,JButton valcreegroup,JButton valsupgroup,JButton valrengroup,JButton valdepetu,AbstractGroupeFactory gestiongroupe){
    this.nometudiant = nom.getText();
    this.sousgroupe = sous.getText();
    this.newgroupe = newg.getText();
    this.valaddetu = valaddetu;
    this.valcreegroup = valcreegroup;
    this.valsupgroup = valsupgroup;
    this.valrengroup = valrengroup;
    this.valdepetu = valdepetu;
    this.gestiongroupe = gestiongroupe;
   } 

   public void actionPerformed(ActionEvent e){
      gestionchangement = new AbstractChangementFactoryNP(gestiongroupe) ;
      
      Set<Etudiant> listeetu = gestiongroupe.getEtudiants(nometudiant);
      for(Etudiant a : gestiongroupe.getPromotion().getEtudiants()){
         if(a.getNom() == nometudiant){
            break;
         }
      }

      Groupe pere = gestiongroupe.getGroupebyName();
      

      if(e.getSource() == valaddetu){
         gestiongroupe.addToGroupe(pere,a);
      }

      if(e.getSource() == valcreegroup){
         gestiongroupe.createGroupe(pere,newgroupe,15,60);
      }

      if(e.getSource() == valrengroup){
         gestiongroupe.
      }

      if(e.getSource() == valsupgroup){
         gestiongroupe.deleteGroupe(pere);
      }

      if(e.getSource() == valdepetu){
         gestionchangement.applyChangement(null);
      }

}
}
