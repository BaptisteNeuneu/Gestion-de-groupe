package FIprojetIHM2022.Etu.Vue;


import javax.swing.*;
import java.awt.*;

public class VueEtu {
    public void Vue2() {

        JFrame WindowsAdmin = new JFrame();
        WindowsAdmin.setSize(1900, 1000);

        PanneauEtu p = new PanneauEtu();

        /* */ GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        JButton AffGroup = new JButton("Afficher groupes");
        JButton AffEtu = new JButton("afficher étudiant");
        JButton Chang = new JButton("changement groupe");
        JPanel Titre = new JPanel();
        JLabel titre = new JLabel("Etudiant");
        JLabel aff = new JLabel("affichage");
        Titre.add(titre);
        JPanel Menu = new JPanel();
        this.absoluteSize(Menu,100,500);
        this.absoluteSize(AffGroup,100,500/3);
        this.absoluteSize(AffEtu,100,500/3);
        this.absoluteSize(Chang,100,500/3);
        Menu.setLayout(new GridLayout(3,1));
        System.out.println(Menu);
        JPanel affichage = p.getPanneau();
        WindowsAdmin.setLayout(new GridBagLayout());
        Titre.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.ipadx = 1000;
        c.ipady = 100;
        WindowsAdmin.add(Titre, c);
        Menu.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.ipadx = 100;
        c.ipady = 100;
        WindowsAdmin.add(Menu, c);
        affichage.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 100;
        c.ipady = 100;
        WindowsAdmin.add(affichage, c);
        Menu.add(AffGroup);
        Menu.add(AffEtu);
        Menu.add(Chang);
        WindowsAdmin.setVisible(true);
        WindowsAdmin.setResizable(false);
        WindowsAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void absoluteSize(Component comp,int x,int y){
        comp.setSize(new Dimension(x,y));
        comp.setMinimumSize(new Dimension(x,y));
        comp.setPreferredSize(new Dimension(x,y));
        comp.setMaximumSize(new Dimension(x,y));
    }
}
