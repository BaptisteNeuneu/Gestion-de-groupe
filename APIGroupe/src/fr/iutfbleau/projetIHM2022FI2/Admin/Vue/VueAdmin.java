package fr.iutfbleau.projetIHM2022FI2.Admin.Vue;


import javax.swing.*;
import java.awt.*;
import fr.iutfbleau.projetIHM2022FI2.Admin.Controleur.*;

public class VueAdmin {

    public void Vue1() {

        JFrame WindowsAdmin = new JFrame();
        this.absoluteSize(WindowsAdmin, 1000, 1000);
        GridLayout h = new GridLayout(5,1);
        GridLayout j = new GridLayout(2,1);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        JButton AddEtu = new JButton("Ajout d'etudiant");
        JButton CreeGroup = new JButton("Cree Groupe");
        JButton SupGroup = new JButton("Supprime groupe");
        JButton RenGroup = new JButton("renplacer groupe");
        JButton DepEtu = new JButton("deplacer etudiant");
        JPanel Titre = new JPanel();
        JLabel titre = new JLabel("Admnistrateur");
        Titre.add(titre,BorderLayout.CENTER);
        this.absoluteSize(Titre, 1000, 200);
        WindowsAdmin.setLayout(new GridBagLayout());
        Titre.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 0;
        c.ipady =0;
        c.gridwidth = 2;
        WindowsAdmin.add(Titre, c);
        JPanel Menu = new JPanel();
        this.absoluteSize(Menu, 300, 800);
        Menu.setLayout(h);
        Menu.add(AddEtu);
        Menu.add(CreeGroup);
        Menu.add(SupGroup);
        Menu.add(RenGroup);
        Menu.add(DepEtu);
        Menu.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady =0;
        c.gridwidth = 1;
        WindowsAdmin.add(Menu, c);
        JPanel affichage = new JPanel();
        this.absoluteSize(affichage, 700,700);
        affichage.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady =0;
        affichage.setLayout(j);
        JPanel instru = new JPanel();
        Pancardlayout l = new Pancardlayout(instru);
        instru = l.adPanel();
        l.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        affichage.add(instru);
        JScrollPane affgroup = new JScrollPane();
        affgroup.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        affichage.add(affgroup);
        WindowsAdmin.add(affichage, c);
        //Pancardlayout l = new Pancardlayout(affichage);
        //l.adPanel();
        //affichage.add(l);
        ActionMenuAdmin i = new ActionMenuAdmin(AddEtu,CreeGroup,SupGroup,RenGroup,DepEtu,l);
        AddEtu.addActionListener(i);
        CreeGroup.addActionListener(i);
        SupGroup.addActionListener(i);
        RenGroup.addActionListener(i);
        DepEtu.addActionListener(i);
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