package fr.iutfbleau.projetIHM2022FI2.Prof.Vue;

import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PageProf{
    //JPanel panneau;
    private GridBagLayout layout;
    private GridBagConstraints gbc;
    private JScrollPane scroll;
    private JPanel panel;
    private int dif;
    private int longueurFixe;
    private int hauteurFixe;
    private PanneauProf premierPanneau;
    public PageProf(PanneauProf panel,JPanel panneau,int d,int l,int h){
        this.premierPanneau=panel;
        this.longueurFixe=l;
        this.hauteurFixe=h;
        this.dif = d;
        this.layout = new GridBagLayout();
        this.gbc = new GridBagConstraints();
        this.panel = new JPanel();
        this.panel.setBackground(Color.GRAY);
        this.panel.setLayout(layout);
        this.scroll = new JScrollPane(this.panel);
        this.panel.setLocation(0,0);
        this.panel.setSize(this.scroll.getX(),this.scroll.getY());

        if(this.dif==0){
            this.listeGroupe();
        }
        if(this.dif==1){
            this.listeEtudiant();
        }
        if(this.dif==2){
            this.changement();
        }
    }


    public void layoutOptions(int x, int y, int width, int height, int fill, int anchor, double weightx, double weighty,Insets insets) {
        this.gbc.gridx = x;
        this.gbc.gridy = y;
        this.gbc.gridwidth = width;
        this.gbc.gridheight = height;
        this.gbc.fill = fill;
        this.gbc.anchor = anchor;
        this.gbc.weightx = weightx;
        this.gbc.weighty = weighty;
        this.gbc.insets = insets;
    }

    public void creerVide(int x, int y) {
        JPanel espace = new JPanel();
        espace.setPreferredSize(new Dimension(this.longueurFixe/11,this.hauteurFixe/11));
        espace.setBackground(Color.BLACK);
        this.layoutOptions(x, y, 1, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0,new Insets(0, 0, 0, 0));
        this.panel.add(espace, this.gbc);
    }

    public JScrollPane getScroll(){
        return this.scroll;
    }
    public ArrayDeque<GroupeNP> recupTableau0(){
            GroupeNP groupe1 = new GroupeNP("Groupe1",0,10);
            GroupeNP groupe2 = new GroupeNP("Groupe2",0,10);
            GroupeNP groupe3 = new GroupeNP("Groupe3",0,10);
            GroupeNP groupe4 = new GroupeNP("Groupe4",0,10);
            GroupeNP groupe5 = new GroupeNP("Groupe5",0,10);
            GroupeNP groupe6 = new GroupeNP("Groupe6",0,10);
        if(this.dif==0){
            ArrayDeque<GroupeNP> liste = new ArrayDeque<GroupeNP>();
            liste.add(groupe1);
            liste.add(groupe2);
            liste.add(groupe3);
            liste.add(groupe4);
            liste.add(groupe5);
            liste.add(groupe6);
            return liste;
        }
        return null;
    }
    public ArrayDeque<EtudiantNP> recupTableau1(){
            EtudiantNP etudiant1 = new EtudiantNP("nom1","prenom1");
            EtudiantNP etudiant2 = new EtudiantNP("nom2","prenom2");
            EtudiantNP etudiant3 = new EtudiantNP("nom3","prenom3");
            EtudiantNP etudiant4 = new EtudiantNP("nom4","prenom4");
            EtudiantNP etudiant5 = new EtudiantNP("nom5","prenom5");
            EtudiantNP etudiant6 = new EtudiantNP("nom6","prenom6");
            EtudiantNP etudiant7 = new EtudiantNP("nom1","prenom1");
            EtudiantNP etudiant8 = new EtudiantNP("nom2","prenom2");
            EtudiantNP etudiant9 = new EtudiantNP("nom3","prenom3");
            EtudiantNP etudiant10 = new EtudiantNP("nom4","prenom4");
            EtudiantNP etudiant11 = new EtudiantNP("nom5","prenom5");
            EtudiantNP etudiant12 = new EtudiantNP("nom6","prenom6");
        if(this.dif==1){
            ArrayDeque<EtudiantNP> liste = new ArrayDeque<EtudiantNP>();
            liste.add(etudiant1);
            liste.add(etudiant2);
            liste.add(etudiant3);
            liste.add(etudiant4);
            liste.add(etudiant5);
            //liste.add(etudiant6);
            //liste.add(etudiant7);
            //liste.add(etudiant8);
            //liste.add(etudiant9);
            //liste.add(etudiant10);
            //liste.add(etudiant11);
            //liste.add(etudiant12);
            return liste;
        }
        return null;
    }
    public void listeGroupe(){
        ListeGroupe liste = new ListeGroupe();
        liste.ajouter(this,this.longueurFixe/8,this.hauteurFixe/11);
    }  
    public void listeEtudiant(){
        ListeEtudiant liste = new ListeEtudiant();
        liste.ajouter(this,this.longueurFixe/4,this.hauteurFixe/11);
    }
    public void changement(){
       //DemandeEtu demande = new DemandeEtu();
    } 
    public GridBagConstraints getGbc(){
        return this.gbc;
    }
    public JPanel getPanel(){
        return this.panel;
    }
    public void setPanel(JPanel p){
        this.panel=p;
    }
    public int getDif(){
        return this.dif;
    }
    public PanneauProf getPremierPanneau(){
        return this.premierPanneau;
    }
}
