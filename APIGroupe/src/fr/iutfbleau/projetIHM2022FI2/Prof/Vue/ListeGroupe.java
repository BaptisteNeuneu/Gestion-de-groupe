package fr.iutfbleau.projetIHM2022FI2.Prof.Vue;

import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ListeGroupe{
    private JPanel panel2;
    private PageProf page;
    private int longueurFixe;
    private int hauteurFixe;
    private final int limite=10;
    private int seuil;
    private ArrayList<JButton> listeBouton;
    public void ajouter(PageProf fenetre,int l,int h){
        this.listeBouton = new ArrayList<JButton>();
        this.page=fenetre;
        this.longueurFixe=l;
        this.hauteurFixe=h;
        this.panel2=this.page.getPanel();
        this.ajoutTitre();
        this.ajoutCorps();
        this.ajoutLien();
        this.ajoutEntete();
        this.page.setPanel(this.panel2);
        this.ajoutListener();
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
                matricule = "Name :";
                break;
                case 2:
                matricule = "Type :";
                break;
                case 3:
                matricule = "Pere :";
                break;
                case 4:
                matricule = "Size :";
                break;
                case 5:
                matricule = "Min :";
                break;
                case 6:
                matricule = "Max :";
                break;
                case 7:
                matricule = "Lien :";
                break;
            }
            JLabel champ = new JLabel (matricule);
            champ.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
            champ.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            p.add(champ);
        }
        StaticMethodeProf.absoluteSize(p,this.longueurFixe*longueurEntete,this.hauteurFixe);
        this.page.layoutOptions(0, 1, longueurEntete, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel2.add(p,this.page.getGbc());
    }

    public void ajoutCorps(){
        final int longueurCorps = 7;
        ArrayDeque<GroupeNP> liste = this.page.recupTableau0();
        this.seuil=liste.size();
        int max=0;
        if(this.limite>this.seuil){
            max=this.limite;
        }else{
            max=this.seuil;
        }
        for(int i=1;i<=max;i++){
            if(!liste.isEmpty()){
                GroupeNP groupe0 = liste.remove();
                JPanel p = new JPanel();
                p.setLayout(new GridLayout(1,longueurCorps));
                for (int j=0;j<longueurCorps;j++){
                    String matricule="";
                    switch(j){
                        case 0:
                        matricule = Integer.toString(groupe0.getId());
                        break;
                        case 1:
                        matricule = groupe0.getName();
                        break;
                        case 2:
                        matricule = groupe0.getType().toString();
                        break;
                        case 3:
                        matricule = groupe0.getPointPoint().getName();
                        break;
                        case 4:
                        matricule = Integer.toString(groupe0.getSize());
                        break;
                        case 5:
                        matricule = Integer.toString(groupe0.getMin());
                        break;
                        case 6:
                        matricule = Integer.toString(groupe0.getMax());
                        break;
                    }
                    JLabel champ = new JLabel (matricule);
                    champ.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
                    champ.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    p.add(champ);
                }
                StaticMethodeProf.absoluteSize(p,longueurFixe*longueurCorps,hauteurFixe);
                this.page.layoutOptions(0, i+1, longueurCorps, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
                this.panel2.add(p,this.page.getGbc());
            }else{
                this.page.creerVide(0,i);
            }
        }
    }
    public void ajoutTitre(){
        String texte="Affichage des groupes";
        JLabel titre = new JLabel(texte);
        titre.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        titre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.page.layoutOptions(0, 0, 8, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel2.add(titre,this.page.getGbc());
    }
    public void ajoutLien(){
        for(int i=1;i<=this.seuil;i++){
            String texte=" ";
            JButton lien = new JButton(texte);
            lien.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
            lien.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            StaticMethodeProf.absoluteSize(lien,this.longueurFixe,this.hauteurFixe);
            this.page.layoutOptions(7, i+1, 1, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
            this.panel2.add(lien,this.page.getGbc());
            this.listeBouton.add(lien);
        }
    }
    public void ajoutListener(){
        for(int i=0;i<this.listeBouton.size();i++){
            this.listeBouton.get(i).addActionListener(new ActionListeProf(this.page.getPremierPanneau().getLayout(),this.page.getPremierPanneau().getPanneau(),this.page.getDif(),this.listeBouton));
        }
    }
}