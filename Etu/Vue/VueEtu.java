package FIprojetIHM2022.Etu.Vue;


import javax.swing.*;
import java.awt.*;

public class VueEtu {
    public void Vue2() {

        JFrame WindowsAdmin = new JFrame();
        WindowsAdmin.setSize(1000, 1000);

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
        JPanel affichage = new JPanel();
        affichage.add(aff);
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
        c.ipady = 900;
        WindowsAdmin.add(Menu, c);
        affichage.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 1;
        c.gridy = 1;
        c.ipady = 900;
        c.ipadx = 900;
        WindowsAdmin.add(affichage, c);
        Menu.add(AffGroup);
        Menu.add(AffEtu);
        Menu.add(Chang);
        WindowsAdmin.setVisible(true);
        WindowsAdmin.setResizable(false);
        WindowsAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
