package fr.iutfbleau.projetIHM2022FI2.Admin.Vue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;
import fr.iutfbleau.projetIHM2022FI2.API.*;

public class Pancardlayout extends JPanel {
    
    CardLayout card;
    JPanel instru,addetu,creegroup,supgroup,rengroup,depetu;
    String textaddetu,textcreegroup,textsupgroup,textrengroup,textdepetu;
    JLabel nometudiant,sousgroupe,newgroupe;
    JTextField etud,groupe,ngroupe;
    GridLayout j,g,h;
    JButton valaddetu,valcreegroup,valsupgroup,valrengroup,valdepetu;
    AbstractGroupeFactory agf;


/**
 * @param panel TODO
 * @param affichage
 */
public Pancardlayout(JPanel instru,AbstractGroupeFactory agf){
    this.instru = instru;
    this.agf = agf;
}

    public void adPanel(){

        /**
         * initialistion des objets
         */
        valaddetu = new JButton("valider");
        valcreegroup = new JButton("valider");
        valsupgroup = new JButton("valider");
        valrengroup = new JButton("valider");
        valdepetu = new JButton("valider");
        addetu = new JPanel();
        creegroup = new JPanel();
        supgroup = new JPanel();
        rengroup = new JPanel();
        depetu = new JPanel();
        card = new CardLayout();
        instru.setLayout(card);

        /**
         * mise en place du panneau addetu
         */
        
        j = new GridLayout(5,1);
        addetu.setLayout(j);
        nometudiant = new JLabel("Nom d'etudiant : ");
        addetu.add(nometudiant);
        etud = new JTextField();
        addetu.add(etud);
        sousgroupe = new JLabel("numero du groupe :");
        addetu.add(sousgroupe);
        groupe = new JTextField();
        addetu.add(groupe);
        addetu.add(valaddetu);
        instru.add(addetu,"texaddetu");

        /**
         * Mise en place dupanneau sous groupe
         */

        g = new GridLayout(3,1);
        creegroup.setLayout(g);
        sousgroupe = new JLabel("numero du groupe :");
        creegroup.add(sousgroupe);
        groupe = new JTextField();
        creegroup.add(groupe);
        creegroup.add(valcreegroup);
        instru.add(creegroup, "textcreegroup");
        supgroup.setLayout(g);
        sousgroupe = new JLabel("numero du groupe :");
        supgroup.add(sousgroupe);
        groupe = new JTextField();
        supgroup.add(groupe);
        supgroup.add(valsupgroup);
        instru.add(supgroup,"textsupgroup");
        rengroup.setLayout(j);
        sousgroupe = new JLabel("numero du groupe :");
        rengroup.add(sousgroupe);
        groupe = new JTextField();
        rengroup.add(groupe);
        newgroupe = new JLabel("numero du nouveau groupe :");
        rengroup.add(newgroupe);
        ngroupe = new JTextField();
        rengroup.add(ngroupe);
        rengroup.add(valrengroup);
        instru.add(rengroup,"textrengroup");
        h =  new GridLayout(7,1);
        depetu.setLayout(h);
        sousgroupe = new JLabel("numero du groupe actuel");
        depetu.add(sousgroupe);
        groupe = new JTextField();
        depetu.add(groupe);
        nometudiant = new JLabel("Nom d'etudiant : ");
        depetu.add(nometudiant);
        etud = new JTextField();
        depetu.add(etud);
        newgroupe = new JLabel("numero du nouveau groupe :");
        depetu.add(newgroupe);
        ngroupe = new JTextField();
        depetu.add(ngroupe);
        depetu.add(valdepetu);
        instru.add(depetu, "textdepetu");
        
    }

    public JPanel getPanel(){
        return this.instru;
    }

    public void getaddetu(){
        card.show(instru,"texaddetu");

    }

    public void getcreegroup(){
        card.show(instru,"textcreegroup");

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

    public Pancardlayout getPancardlayout(){
        return this;
    }
}
