package FIprojetIHM2022.Admin.Panaff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pancardlayout {
    
    CardLayout card;
    JPanel c,addetu,creegroup,supgroup,rengroup,depetu;
    JLabel nometudiant,sousgroupe,newgroupe;
    JTextField etud,groupe,ngroupe;
    GridLayout j,g,h;
    JButton valider;

    public Pancardlayout(JPanel a){
        this.c = a;
        
        addetu = new JPanel();
        creegroup = new JPanel();
        supgroup = new JPanel();
        rengroup = new JPanel();
        depetu = new JPanel();
        card = new CardLayout();
        c.setLayout(card);
        j = new GridLayout(2,1);
        addetu.setLayout(j);
        nometudiant = new JLabel("Nom d'etudiant : ");
        addetu.add(nometudiant);
        etud = new JTextField(10);
        addetu.add(etud);
        sousgroupe = new JLabel("numero du groupe");
        addetu.add(sousgroupe);
        groupe = new JTextField(10);
        addetu.add(groupe);
        c.add("addetu",addetu);
        g = new GridLayout(1,1);
        creegroup.setLayout(g);
        creegroup.add(sousgroupe);
        creegroup.add(groupe);
        c.add("creegroup",creegroup);
        supgroup.setLayout(1,1);
        supgroup.add(sousgroupe);
        supgroup.add(groupe);
        c.add("supgroup",supgroup);



        
        





        
    }

}
