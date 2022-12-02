package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanneauEtu{
    JPanel panneau;
    CardLayout layout;
    public PanneauEtu(){
        this.panneau = new JPanel
        
        ();
        this.panneau.setPreferredSize(new Dimension(700,900));
        this.layout = new CardLayout();
        this.panneau.setLayout(this.layout);

        createPanel(0);
        createPanel(1);
        createPanel(2);
        createPanel(3);
        //this.panneau.add(new JLabel("1"),"1");
        //this.panneau.add(new JLabel("2"),"2");
        //this.panneau.addMouseListener();
    }
    public void createPanel(int dif) {
        PageEtu p= new PageEtu(this.panneau,dif);
        this.panneau.add(p.getPanel());
        //System.out.println(p.getPanel());
        //this.panneau.add(new JLabel(texte));
    }
    public JPanel getPanneau(){
        //Page p= new Page(this.panneau,"1");
        //return p.getPanel();
        return this.panneau;
    }
    public CardLayout getLayout(){
        return this.layout;
    }
}
