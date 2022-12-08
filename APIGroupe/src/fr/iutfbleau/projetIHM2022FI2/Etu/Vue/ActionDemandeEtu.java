package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ActionDemandeEtu implements ActionListener{
    CardLayout layout;
    JPanel panneau;
    int dif;
    JButton valider;
    JComboBox box1;
    JComboBox box2;
    JComboBox box3;
    String etu;
    String A;
    String B;
    ListeChangement liste;
    public ActionDemandeEtu(CardLayout l,JPanel p,int d,JButton v,JComboBox b1,JComboBox b2,JComboBox b3,ListeChangement t){
        this.liste=t;
        this.layout=l;
        this.panneau=p;
        this.dif=d;
        this.valider=v;
        this.box1=b1;
        this.box2=b2;
        this.box3=b3;
    }
    public ActionDemandeEtu(CardLayout l,JPanel p,int d,JButton v){
        this.layout=l;
        this.panneau=p;
        this.dif=d;
        this.valider=v;
        this.box1=null;
        this.box2=null;
        this.box3=null;
    }
    public void actionPerformed(ActionEvent e){
        if(this.dif==3){
            if(e.getSource()==this.valider){
                this.cas0(e);
            }
            if(e.getSource()==this.box1){
                this.cas2(e);
            }
            if(e.getSource()==this.box2){
                this.cas3(e);
            }
            if(e.getSource()==this.box3){
                this.cas4(e);
            }
        }
        if(this.dif==4){
            if(e.getSource()==this.valider){
                this.cas1(e);
            }
        }
    }
    public void cas0(ActionEvent e){
        System.out.println(this.etu);
        System.out.println(this.A);
        System.out.println(this.B);

        Set<Etudiant> setter =StaticMethodeEtu.getFactory().getGroupeFactory().getEtudiants(this.etu);
        Etudiant etudiant=null;
        Groupe gA=null;
        Groupe gB=null;
        ArrayDeque<Groupe> file = StaticMethodeEtu.recupTableau0(StaticMethodeEtu.getFactory());
        Iterator<Etudiant> ite =setter.iterator();
        if(ite.hasNext()){
            etudiant=ite.next();
        }
        for(int i=0;!file.isEmpty();i++){
            Groupe temp = file.remove();
            //System.out.println(temp.getName());
            if(temp.getName()==this.A){
                gA = temp;
            }
            if(temp.getName()==this.B){
                gB = temp;
            }
        }
        System.out.println(gA.getName());
        System.out.println(gB.getName());
        StaticMethodeEtu.getFactory().createChangement(gA,etudiant,gB);
        this.liste.reafficher();
        this.layout.last(this.panneau);

    }
    public void cas1(ActionEvent e){
        this.layout.last(this.panneau);
        this.layout.previous(this.panneau);
    }

    public void cas2(ActionEvent e){
        String chaine=this.box1.getSelectedItem().toString();
        String[] mot = chaine.split(" ");
        this.etu=mot[1];
    }
    public void cas3(ActionEvent e){
        this.A=this.box2.getSelectedItem().toString();
    }
    public void cas4(ActionEvent e){
        this.B=this.box3.getSelectedItem().toString();
    }
}