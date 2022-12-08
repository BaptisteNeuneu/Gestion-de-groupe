package fr.iutfbleau.projetIHM2022FI2.Admin.Vue;

import java.util.Set;

import javax.swing.*;
import javax.swing.event.*;

import javax.swing.tree.DefaultMutableTreeNode;


import fr.iutfbleau.projetIHM2022FI2.MNP.*;
import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MP.*;

public class PanTree implements TreeSelectionListener {

    private JScrollPane affgroup;
    private Groupe pere;
    AbstractGroupeFactory agf;
    String sousgroupe;

    public PanTree(JScrollPane affgroup,AbstractGroupeFactory agf){
        this.affgroup = affgroup;
        this.agf = agf;

    }

    public void AddPantree(){
        pere = agf.getPromotion();
        String perename = pere.getName();
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode(perename);
        JTree arbre = new JTree(racine);
        affgroup.add(arbre);
        Set<Groupe> allgroupe = pere.getSousGroupes();
        for (Groupe a : allgroupe) {
            sousgroupe = a.getName();
            DefaultMutableTreeNode sousGroupe = new DefaultMutableTreeNode(sousgroupe);
            racine.add(sousGroupe);
            if(a.getSousGroupes != null){
                allgroupe = a.getSousGroupes;
                for (Groupe b  : allgroupe) {
            sousgroupe = b.getName();
            sousGroupe = new DefaultMutableTreeNode(sousgroupe);
            a.add(sousGroupe);
            if(b.)
            }
        }
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {


        
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
