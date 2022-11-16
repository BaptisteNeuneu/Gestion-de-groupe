package FIprojetIHM2022.Admin.Panaff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pancardlayout {
    
    CardLayout card;
    JPanel c,addetu,creegroup,supgroup,rengroup,depetu;
    JLabel nometudiant,sousgroupe;
    JTextField etud,groupe;
    GridLayout j,g,h;
    JButton valider;
    GridLayout aff;

    public Pancardlayout(JPanel a){
        this.c = a;
        
        addetu = new JPanel();
        creegroup = new JPanel();
        supgroup = new JPanel();
        rengroup = new JPanel();
        depetu = new JPanel();
        card = new CardLayout();
        c.setLayout(card);




        
    }

}
