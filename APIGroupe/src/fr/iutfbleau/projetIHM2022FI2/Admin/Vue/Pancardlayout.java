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

    public JPanel adPanel(){
        textaddetu = "texaddetu";
        textcreegroup = "textcreegroup";
        textsupgroup = "textsupgroup";
        textrengroup = "textrnegroup";
        textdepetu = "textdepetu";
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
        instru.add(textaddetu,addetu);
        g = new GridLayout(2,1);
        creegroup.setLayout(g);
        creegroup.add(sousgroupe);
        creegroup.add(groupe);
        creegroup.add(valcreegroup);
        instru.add(textcreegroup,creegroup);
        supgroup.setLayout(g);
        supgroup.add(sousgroupe);
        supgroup.add(groupe);
        supgroup.add(valsupgroup);
        instru.add(textsupgroup,supgroup);
        rengroup.setLayout(j);
        rengroup.add(sousgroupe);
        rengroup.add(groupe);
        newgroupe = new JLabel("numero du nouveau groupe :");
        ngroupe = new JTextField(10);
        rengroup.add(newgroupe);
        rengroup.add(ngroupe);
        rengroup.add(valrengroup);
        instru.add(textrengroup,rengroup);
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
        instru.add(textdepetu,depetu);
        return instru;
    }

    public JPanel getPanel(){
        return this.instru;
    }

    public JPanel getaddetu(){
        card.show(instru, textaddetu);
        return instru;
    }

    public JPanel getcreegroup(){
        card.show(instru, textcreegroup);
        return instru;
    }

    public JPanel getsupgroup(){
        card.show(instru,textsupgroup);
        return instru;
    }

    public JPanel getrengroup(){
        card.show(instru,textrengroup);
        return instru;
    }

    public JPanel getdepetu(){
        card.show(instru,textdepetu);
        return instru;
    }
}
