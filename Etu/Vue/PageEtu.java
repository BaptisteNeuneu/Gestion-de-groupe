package FIprojetIHM2022.Etu.Vue;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PageEtu{
    //JPanel panneau;
    private GridBagLayout layout;
    private GridBagConstraints gbc;
    private JScrollPane scroll;
    private JPanel panel; 
    public PageEtu(JPanel panneau,String texte){
        this.layout = new GridBagLayout();
        this.gbc = new GridBagConstraints();
        this.panel = new JPanel();
        this.panel.setBackground(Color.GRAY);
        this.panel.setLocation(0,0);
        this.panel.setLayout(layout);
        //ScrollPaneLayout layout2 = new ScrollPaneLayout();
        //JScrollBar barreH = panel.createHorizontalScrollBar();
        //JScrollBar barreV = panel.createVerticalScrollBar();
        //panel.setRowHeaderView(barreH);
        //panel.setColumnHeaderView(barreV);

        this.scroll = new JScrollPane(this.panel);

        //FenetreEtu f = new FenetreEtu(this.panel,texte);
        //JViewport vue = f.getViewport();
        //this.panel.setViewport(vue);


        ArrayDeque<String> liste = this.recupTableau();
        int seuil;
        /*seuil=liste.size();
        for(int i=1;i<=seuil;i++){
            if(!liste.isEmpty()){
                JButton b = new JButton(liste.remove());
                //System.out.println();
                vue.add(b);
            }
        }*/
        this.layoutOptions(1, 0, 2, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
        this.panel.add(new JLabel(texte),this.gbc);
        seuil=liste.size();
        for(int i=1;i<=seuil;i++){
            if(!liste.isEmpty()){
                JButton b = new JButton(liste.remove());
                this.layoutOptions(0, i*2, 5, 1, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 0.0, 0.0, new Insets(0, 0, 0, 0));
                this.panel.add(b,this.gbc);
                for(int j=0;j<=5;j++){
                    this.creerVide(j,i*2-1);
                }
                this.creerVide(6,i*2);
            }
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
        final int longueurVide=100;
        final int hauteurVide=100;
        JPanel espace = new JPanel();
        espace.setPreferredSize(new Dimension(longueurVide,hauteurVide));
        espace.setBackground(Color.BLACK);
        this.layoutOptions(x, y, 1, 1, GridBagConstraints.NONE, GridBagConstraints.CENTER, 0.0, 0.0,new Insets(0, 0, 0, 0));
        this.panel.add(espace, this.gbc);
    }

    public JScrollPane getPanel(){
        return this.scroll;
    }
    public ArrayDeque<String> recupTableau(){
        ArrayDeque<String> liste = new ArrayDeque<String>();
        liste.add("groupe1");
        liste.add("groupe2");
        liste.add("groupe3");
        liste.add("groupe4");
        liste.add("groupe5");
        liste.add("groupe6");
        return liste;
    }
}
