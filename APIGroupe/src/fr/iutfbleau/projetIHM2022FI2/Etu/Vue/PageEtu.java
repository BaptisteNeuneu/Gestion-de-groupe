package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PageEtu{
    //JPanel panneau;
    private GridBagLayout layout;
    private GridBagConstraints gbc;
    private JScrollPane scroll;
    private JPanel panel;
    private int dif;
    private final int longueurFixe=100;
    private final int hauteurFixe=90;
    public PageEtu(JPanel panneau,int d){
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
            this.listeChangement();
        }
        if(this.dif==3){
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
        espace.setPreferredSize(new Dimension(this.longueurFixe,this.hauteurFixe));
        espace.setBackground(Color.BLACK);
        this.layoutOptions(x, y, 1, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0,new Insets(0, 0, 0, 0));
        this.panel.add(espace, this.gbc);
    }

    public JScrollPane getPanel(){
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
    public ArrayDeque<ChangementNP> recupTableau2(){
            GroupeNP groupe1 = new GroupeNP("Groupe1",0,10);
            GroupeNP groupe2 = new GroupeNP("Groupe2",0,10);
            GroupeNP groupe3 = new GroupeNP("Groupe3",0,10);
            GroupeNP groupe4 = new GroupeNP("Groupe4",0,10);
            GroupeNP groupe5 = new GroupeNP("Groupe5",0,10);
            GroupeNP groupe6 = new GroupeNP("Groupe6",0,10);
            EtudiantNP etudiant1 = new EtudiantNP("nom1","prenom1");
            EtudiantNP etudiant2 = new EtudiantNP("nom2","prenom2");
            EtudiantNP etudiant3 = new EtudiantNP("nom3","prenom3");
            EtudiantNP etudiant4 = new EtudiantNP("nom4","prenom4");
            EtudiantNP etudiant5 = new EtudiantNP("nom5","prenom5");
            EtudiantNP etudiant6 = new EtudiantNP("nom6","prenom6");
            ChangementNP changement1 = new ChangementNP(groupe1,etudiant1,groupe2);
            ChangementNP changement2 = new ChangementNP(groupe2,etudiant2,groupe3);
            ChangementNP changement3 = new ChangementNP(groupe3,etudiant3,groupe4);
            ChangementNP changement4 = new ChangementNP(groupe4,etudiant4,groupe5);
            ChangementNP changement5 = new ChangementNP(groupe5,etudiant5,groupe6);
            ChangementNP changement6 = new ChangementNP(groupe6,etudiant6,groupe1);
        if(this.dif==2){
            ArrayDeque<ChangementNP> liste = new ArrayDeque<ChangementNP>();
            liste.add(changement1);
            liste.add(changement2);
            liste.add(changement3);
            liste.add(changement4);
            liste.add(changement5);
            liste.add(changement6);
            return liste;
        }
        return null;
    }
    public void listeGroupe(){
        final int limite=9;
        ArrayDeque<GroupeNP> liste = this.recupTableau0();
        int seuil;
        String texte="Affichage des groupes";
        JButton titre = new JButton(texte);
        titre.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        this.layoutOptions(0, 0, 7, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel.add(titre,this.gbc);
        seuil=liste.size();
        int max=0;
        if(limite>seuil){
            max=limite;
        }else{
            max=seuil;
        }
        for(int i=1;i<=max;i++){
            if(!liste.isEmpty()){
                GroupeNP groupe0 = liste.remove();
                JPanel p = new JPanel();
                p.setLayout(new GridLayout(1,1));
                String matricule = groupe0.getId()+" Name : "+groupe0.getName() + " Type : " + groupe0.getType() + " GroupePere : " +groupe0.getPointPoint().getName() + " Size : " + groupe0.getSize() + " Min : " + groupe0.getMin() + " Max : " + groupe0.getMax();
                JButton champ = new JButton (matricule);
                champ.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
                p.add(champ);
                VueEtu.absoluteSize(p,this.longueurFixe*7,this.hauteurFixe);
                this.layoutOptions(0, i, 7, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
                this.panel.add(p,this.gbc);
            }else{
                this.creerVide(0,i);
            }
        }
    }  
    public void listeEtudiant(){
        final int limite=9;
        ArrayDeque<EtudiantNP> liste = this.recupTableau1();
        int seuil;
        String texte="Affichage des étudiants dans un groupe :";
        JButton titre = new JButton(texte);
        titre.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        this.layoutOptions(0, 0, 7, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel.add(titre,this.gbc);
        seuil=liste.size();
        int max=0;
        if(limite>seuil){
            max=limite;
        }else{
            max=seuil;
        }
        for(int i=1;i<=max;i++){
            if(!liste.isEmpty()){
                EtudiantNP etudiant0 = liste.remove();
                JPanel p = new JPanel();
                p.setLayout(new GridLayout(1,1));
                String matricule = +etudiant0.getId()+" "+etudiant0.getNom() + " " + etudiant0.getPrenom();
                JButton champ = new JButton(matricule);
                champ.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
                p.add(champ);
                VueEtu.absoluteSize(p,this.longueurFixe*7,this.hauteurFixe);
                this.layoutOptions(0, i, 7, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
                this.panel.add(p,this.gbc);
            }else{
                this.creerVide(0,i);
            }
        }
    }
    public void listeChangement(){
        final int limite=9;
        ArrayDeque<ChangementNP> liste = this.recupTableau2();
        int seuil;
        String texte="Voir les demandes de changements de groupes";
        JButton titre = new JButton(texte);
        titre.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        this.layoutOptions(0, 0, 7, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel.add(titre,this.gbc);
        seuil=liste.size();
        int max=0;
        if(limite>seuil){
            max=limite;
        }else{
            max=seuil;
        }
        for(int i=1;i<=max;i++){
            if(!liste.isEmpty()){
                ChangementNP changement0 = liste.remove();
                JPanel p = new JPanel();
                p.setLayout(new GridLayout(1,1));
                String matricule = +changement0.getId()+" "+changement0.getEtu().getNom() + " " + changement0.getEtu().getPrenom() + " " + changement0.getA().getName() + " " + changement0.getB().getName();
                JButton champ = new JButton(matricule);
                champ.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
                p.add(champ);
                VueEtu.absoluteSize(p,this.longueurFixe*7,this.hauteurFixe);
                this.layoutOptions(0, i, 7, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
                this.panel.add(p,this.gbc);
            }else{
                this.creerVide(0,i);
            }
        }
    }
    public void changement(){
       //DemandeEtu demande = new DemandeEtu();
    }        
}
