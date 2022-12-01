package fr.iutfbleau.projetIHM2022FI2.Admin.Controleur;

import java.awt.event.*;
import javax.swing.*;
import fr.iutfbleau.projetIHM2022FI2.API.*;

public class ActionAdminInstru implements ActionListener {

   JLabel nometudiant, sousgroupe, newgroupe;
   JButton valaddetu,valcreegroup,valsupgroup,valrengroup,valdepetu;
   public ActionAdminInstru(JLabel nometudiant,JLabel sousgroupe,JLabel newgroupe,JButton valaddetu,JButton valcreegroup,JButton valsupgroup,JButton valrengroup,JButton valdepetu){
    this.nometudiant = nometudiant;
    this.sousgroupe = sousgroupe;
    this.newgroupe = newgroupe;
    this.valaddetu = valaddetu;
    this.valcreegroup = valcreegroup;
    this.valsupgroup = valsupgroup;
    this.valrengroup = valrengroup;
    this.valdepetu = valdepetu;
   } 

   public void actionPerformed(ActionEvent e){
      if(e.getSource() == valaddetu){

      }

      if(e.getSource() == valcreegroup){
         
      }

      if(e.getSource() == valrengroup){
         
      }

      if(e.getSource() == valsupgroup){
         
      }

      if(e.getSource() == valdepetu){
         
      }

}
}
