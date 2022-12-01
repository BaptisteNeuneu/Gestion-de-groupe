package FIprojetIHM2022.Etu.Vue;


import javax.swing.*;
import java.awt.*;

public class VueEtu {
    public void Vue2() {
        final int menuHorizontal=300;
        final int menuVertical=800;
        JFrame WindowsAdmin = new JFrame();
        WindowsAdmin.setSize(1000, 1000);

        PanneauEtu p = new PanneauEtu();

        /* */ GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        JButton AffGroup = new JButton("Afficher groupes");
        JButton AffEtu = new JButton("afficher étudiant");
        JButton AffChang = new JButton("afficher changement groupe");
        JButton Chang = new JButton("faire changement groupe");
        JPanel Titre = new JPanel();
        //Titre.setLayout(new BorderLayout());
        JLabel titre = new JLabel("Etudiant");
        //JLabel aff = new JLabel("affichage");
        Titre.add(titre,BorderLayout.CENTER);
        JPanel Menu = new JPanel();
        this.absoluteSize(Menu,menuHorizontal,menuVertical);
        this.absoluteSize(AffGroup,menuHorizontal,menuVertical/4);
        this.absoluteSize(AffEtu,menuHorizontal,menuVertical/4);
        this.absoluteSize(AffChang,menuHorizontal,menuVertical/4);
        this.absoluteSize(Chang,menuHorizontal,menuVertical/4);
        Menu.setLayout(new GridLayout(4,1));
        //System.out.println(Menu);
        JPanel affichage = p.getPanneau();
        this.absoluteSize(affichage,700,900);
        this.absoluteSize(Titre,1000,100);
        WindowsAdmin.setLayout(new GridBagLayout());
        Titre.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.ipadx = 0;
        c.ipady = 0;
        WindowsAdmin.add(Titre, c);
        Menu.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.ipadx = 0;
        c.ipady = 0;
        WindowsAdmin.add(Menu, c);
        affichage.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady = 0;
        WindowsAdmin.add(affichage, c);
        Menu.add(AffGroup);
        Menu.add(AffEtu);
        Menu.add(AffChang);
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
