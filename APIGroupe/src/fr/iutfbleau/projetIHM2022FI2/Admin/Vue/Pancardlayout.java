package fr.iutfbleau.projetIHM2022FI2.Admin.Vue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pancardlayout extends JPanel {
    
    CardLayout card;
    JPanel instru,addetu,creegroup,supgroup,rengroup,depetu;
    String textaddetu,textcreegroup,textsupgroup,textrengroup,textdepetu;
    JLabel nometudiant,sousgroupe,newgroupe;
    JTextField etud,groupe,ngroupe;
    GridLayout j,g,h;
    JButton valaddetu,valcreegroup,valsupgroup,valrengroup,valdepetu;


/**
 * @param panel TODO
 * @param affichage
 */
public Pancardlayout(JPanel instru){
    this.instru = instru;
}

    public void adPanel(){

        addetu = new JPanel();
        creegroup = new JPanel();
        supgroup = new JPanel();
        rengroup = new JPanel();
        depetu = new JPanel();
        card = new CardLayout();
        instru.setLayout(card);
        j = new GridLayout(3,1);
        addetu.setLayout(j);
        nometudiant = new JLabel("Nom d'etudiant : ");
        addetu.add(nometudiant);
        etud = new JTextField(10);
        addetu.add(etud);
        sousgroupe = new JLabel("numero du groupe :");
        addetu.add(sousgroupe);
        groupe = new JTextField(10);
        addetu.add(groupe);
        addetu.add(valaddetu);
        instru.add(addetu, "texaddetu");
        g = new GridLayout(2,1);
        creegroup.setLayout(g);
        creegroup.add(sousgroupe);
        creegroup.add(groupe);
        creegroup.add(valcreegroup);
        instru.add(creegroup, "textcreegroup");
        supgroup.setLayout(g);
        supgroup.add(sousgroupe);
        supgroup.add(groupe);
        supgroup.add(valsupgroup);
        instru.add(supgroup,"textsupgroup");
        rengroup.setLayout(j);
        rengroup.add(sousgroupe);
        rengroup.add(groupe);
        newgroupe = new JLabel("numero du nouveau groupe :");
        ngroupe = new JTextField(10);
        rengroup.add(newgroupe);
        rengroup.add(ngroupe);
        rengroup.add(valrengroup);
        instru.add(rengroup,"textrengroup");
        h =  new GridLayout(3,1);
        depetu.setLayout(h);
        sousgroupe = new JLabel("numero du groupe actuel");
        depetu.add(sousgroupe);
        depetu.add(groupe);
        depetu.add(nometudiant);
        depetu.add(etud);
        depetu.add(newgroupe);
        depetu.add(ngroupe);
        depetu.add(valdepetu);
        instru.add(depetu, "textdepetu");
        
    }

    public JPanel getPanel(){
        return this.instru;
    }

    public void getaddetu(){
        card.show(instru, "textaddetu");

    }

    public void getcreegroup(){
        card.show(instru, "textcreegroup");

    }

    public void getsupgroup(){
        card.show(instru,"textsupgroup");

    }

    public void getrengroup(){
        card.show(instru,"textrengroup");

    }

    public void getdepetu(){
        card.show(instru,"textdepetu");
    }

    public Pancardlayout gePancardlayout(){
        return this;
    }
}
