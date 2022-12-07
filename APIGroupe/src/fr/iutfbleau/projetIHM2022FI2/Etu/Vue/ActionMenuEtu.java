package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionMenuEtu implements ActionListener{
    CardLayout layout;
    JButton bouton1;
    JButton bouton2;
    JButton bouton3;
    JButton bouton4;
    JPanel panneau;
    public ActionMenuEtu(CardLayout l,JButton b1, JButton b2, JButton b3, JButton b4, JPanel p){
        this.layout=l;
        this.bouton1=b1;
        this.bouton2=b2;
        this.bouton3=b3;
        this.bouton4=b4;
        this.panneau=p;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.bouton1){
            this.layout.first(this.panneau);
        }
        if(e.getSource()==this.bouton2){
            this.layout.first(this.panneau);
            this.layout.next(this.panneau);
        }
        if(e.getSource()==this.bouton3){
            this.layout.last(this.panneau);
            this.layout.previous(this.panneau);
            this.layout.previous(this.panneau);
        }
        if(e.getSource()==this.bouton4){
            this.layout.last(this.panneau);
            this.layout.previous(this.panneau);
        }
    }
}