package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ListeEtudiant{
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
        final int longueurEntete = 4;
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,longueurEntete));
        for (int j=0;j<longueurEntete;j++){
            String matricule="";
            switch(j){
                case 0:
                matricule = "Id :";
                break;
                case 1:
                matricule = "Nom :";
                break;
                case 2:
                matricule = "Prénom :";
                break;
                case 3:
                matricule = "Lien :";
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
        final int longueurCorps = 3;
        ArrayDeque<EtudiantNP> liste = this.page.recupTableau1();
        this.seuil=liste.size();
        int max=0;
        if(this.limite>this.seuil){
            max=this.limite;
        }else{
            max=this.seuil;
        }
        for(int i=1;i<=max;i++){
            if(!liste.isEmpty()){
                EtudiantNP etudiant0 = liste.remove();
                JPanel p = new JPanel();
                p.setLayout(new GridLayout(1,longueurCorps));
                for (int j=0;j<longueurCorps;j++){
                    String matricule="";
                    switch(j){
                        case 0:
                        matricule = Integer.toString(etudiant0.getId());
                        break;
                        case 1:
                        matricule = etudiant0.getNom();
                        break;
                        case 2:
                        matricule = etudiant0.getPrenom();
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
        String texte="Affichage des étudiants dans un groupe :";
        JLabel titre = new JLabel(texte);
        titre.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        titre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.page.layoutOptions(0, 0, 4, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel2.add(titre,this.page.getGbc());
    } 
     public void ajoutLien(){
        for(int i=1;i<=this.seuil;i++){
            String texte=" ";
            JButton lien = new JButton(texte);
            lien.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
            lien.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            VueEtu.absoluteSize(lien,this.longueurFixe,this.hauteurFixe);
            this.page.layoutOptions(3, i+1, 1, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
            this.panel2.add(lien,this.page.getGbc());
        }
    }
}