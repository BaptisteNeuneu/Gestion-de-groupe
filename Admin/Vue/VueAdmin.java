package FIprojetIHM2022.Admin.Vue;


import javax.swing.*;
import java.awt.*;

public class VueAdmin {

    public void Vue1() {

        JFrame WindowsAdmin = new JFrame();
        WindowsAdmin.setSize(1000, 1000);
        GridLayout h = new GridLayout(5,1);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        JButton AddEtu = new JButton("Ajout d'etudiant");
        JButton CreeGroup = new JButton("Cree Groupe");
        JButton SupGroup = new JButton("Supprimée groupe");
        JButton RenGroup = new JButton("renplacer groupe");
        JButton DepEtu = new JButton("deplacer etudiant");
        JPanel Titre = new JPanel();
        JLabel titre = new JLabel("Admnistrateur");
        JLabel aff = new JLabel("affichage");
        Titre.add(titre);
        JPanel Menu = new JPanel();
        Menu.setLayout(h);
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
        Menu.add(AddEtu);
        Menu.add(CreeGroup);
        Menu.add(SupGroup);
        Menu.add(RenGroup);
        Menu.add(DepEtu);
        WindowsAdmin.setVisible(true);
        WindowsAdmin.setResizable(false);
        WindowsAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}