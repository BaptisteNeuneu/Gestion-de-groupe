package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ActionListeEtu implements ActionListener{
    CardLayout layout;
    JPanel panneau;
    int dif;
    ArrayList<JButton> listeBouton;
    public ActionListeEtu(CardLayout l,JPanel p,int d, ArrayList<JButton> b){
        this.layout=l;
        this.panneau=p;
        this.dif=d;
        this.listeBouton=b;
    }
    public void actionPerformed(ActionEvent e){
        if(this.dif==0){
            this.cas0(e);
        }
        if(this.dif==1){
            this.cas1(e);
        }
        if(this.dif==2){
            this.cas2(e);
        }
    }
    public void cas0(ActionEvent e){
        this.layout.first(this.panneau);
        this.layout.next(this.panneau);
    }
    public void cas1(ActionEvent e){
        this.layout.first(this.panneau);
    }
    public void cas2(ActionEvent e){
        this.layout.first(this.panneau);
        for(int i=0;i<this.listeBouton.size()/3;i++){
            if(e.getSource()==this.listeBouton.get(i)){
            this.layout.next(this.panneau);
            }
        }
    }
}