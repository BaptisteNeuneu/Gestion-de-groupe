package FIprojetIHM2022.Etu.Vue;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Page{
    //JPanel panneau;
    private GridBagLayout layout;
    private GridBagConstraints gbc;
    private JPanel panel; 
    public Page(JPanel panneau,String texte){
        this.layout = new GridBagLayout();
        this.gbc = new GridBagConstraints();
        this.panel = new JPanel();
        this.panel.setBackground(Color.GRAY);
        this.panel.setLocation(0,0);
        this.panel.setPreferredSize(new Dimension(700,700));
        this.panel.setLayout(this.layout);
        ArrayDeque<String> liste = this.recupTableau();
        int seuil;
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

    public JPanel getPanel(){
        return this.panel;
    }
    public ArrayDeque<String> recupTableau(){
        ArrayDeque<String> liste = new ArrayDeque<String>();
        liste.add("groupe1");
        liste.add("groupe2");
        liste.add("groupe3");
        return liste;
    }
}
