package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ListeChangement{
    private JPanel panel2;
    private PageEtu page;
    private int longueurFixe;
    private int hauteurFixe;
    private final int limite=10;
    private int seuil;
    public void ajouter(PageEtu fenetre,int l,int h){
        this.page=fenetre;
        this.longueurFixe=l;
        this.hauteurFixe=h;
        this.panel2=this.page.getPanel();
        this.ajoutTitre();
        this.ajoutCorps();
        this.ajoutLien();
        this.ajoutEntete();
        this.page.setPanel(this.panel2);
    }
    public void ajoutEntete(){
        final int longueurEntete = 8;
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,longueurEntete));
        for (int j=0;j<longueurEntete;j++){
            String matricule="";
            switch(j){
                case 0:
                matricule = "Id :";
                break;
                case 1:
                matricule = "NomEtu :";
                break;
                case 2:
                matricule = "PrénomEtu :";
                break;
                case 3:
                matricule = "NomGroupeA :";
                break;
                case 4:
                matricule = "NomGroupeB :";
                break;
                case 5:
                matricule = "Lien Etudiant:";
                break;
                case 6:
                matricule = "Lien GroupeA:";
                break;
                case 7:
                matricule = "Lien GroupeB:";
                break;
            }
            JLabel champ = new JLabel (matricule);
            champ.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
            champ.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            p.add(champ);
        }
        VueEtu.absoluteSize(p,this.longueurFixe*longueurEntete,this.hauteurFixe);
        this.page.layoutOptions(0, 1, longueurEntete, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel2.add(p,this.page.getGbc());
    }
    public void ajoutCorps(){
        final int longueurCorps = 5;
        ArrayDeque<ChangementNP> liste = this.page.recupTableau2();
        this.seuil=liste.size();
        int max=0;
        if(this.limite>this.seuil){
            max=this.limite;
        }else{
            max=this.seuil;
        }
        for(int i=1;i<=max;i++){
            if(!liste.isEmpty()){
                ChangementNP changement0 = liste.remove();
                JPanel p = new JPanel();
                p.setLayout(new GridLayout(1,longueurCorps));
                for (int j=0;j<longueurCorps;j++){
                    String matricule="";
                    switch(j){
                        case 0:
                        matricule = Integer.toString(changement0.getId());
                        break;
                        case 1:
                        matricule = changement0.getEtu().getNom();
                        break;
                        case 2:
                        matricule = changement0.getEtu().getPrenom();
                        break;
                        case 3:
                        matricule = changement0.getA().getName();
                        break;
                        case 4:
                        matricule = changement0.getB().getName();
                        break;
                    }
                    JLabel champ = new JLabel (matricule);
                    champ.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
                    champ.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    p.add(champ);
                }
                VueEtu.absoluteSize(p,longueurFixe*longueurCorps,hauteurFixe);
                this.page.layoutOptions(0, i+1, longueurCorps, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
                this.panel2.add(p,this.page.getGbc());
            }else{
                this.page.creerVide(0,i);
            }
        }
    }
    public void ajoutTitre(){
        String texte="Voir les demandes de changements de groupes";
        JLabel titre = new JLabel(texte);
        titre.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        titre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.page.layoutOptions(0, 0, 8, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel2.add(titre,this.page.getGbc());
    } 
     public void ajoutLien(){
        for(int j=0;j<3;j++){
            for(int i=1;i<=this.seuil;i++){
                String texte=" ";
                JButton lien = new JButton(texte);
                lien.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
                lien.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                VueEtu.absoluteSize(lien,this.longueurFixe,this.hauteurFixe);
                this.page.layoutOptions(j+5, i+1, 1, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
                this.panel2.add(lien,this.page.getGbc());
            }
        }
    }
    /*private final int longueurFixe=100;
    private final int hauteurFixe=90;
    private JPanel panel2;
    public void ajouter(PageEtu page){
        final int limite=9;
        this.panel2=page.getPanel();
        ArrayDeque<ChangementNP> liste = page.recupTableau2();
        int seuil;
        String texte="Voir les demandes de changements de groupes";
        JButton titre = new JButton(texte);
        titre.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        page.layoutOptions(0, 0, 7, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel2.add(titre,page.getGbc());
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
                JButton champ = new JButton (matricule);
                champ.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
                p.add(champ);
                VueEtu.absoluteSize(p,this.longueurFixe*7,this.hauteurFixe);
                page.layoutOptions(0, i, 7, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
                this.panel2.add(p,page.getGbc());
            }else{
                page.creerVide(0,i);
            }
        }
        page.setPanel(this.panel2);
    }*/
}