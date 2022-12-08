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
    private String nompere;
    private String nomfils;
    private Set<Groupe> allgroupe;
    AbstractGroupeFactory agf;
    String sousgroupe;

    public PanTree(JScrollPane affgroup,AbstractGroupeFactory agf){
        this.affgroup = affgroup;
        this.agf = agf;
    }

    public JTree baseJTree(){
        pere = agf.getPromotion();
        nompere = pere.getName();
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode(nompere);
        JTree arbre = new JTree(racine);
        this.addJtree(pere,racine);
        return arbre;

    }


    public void addJtree(Groupe pere,DefaultMutableTreeNode racine){
        allgroupe = pere.getSousGroupes();
        for(Groupe fils : allgroupe){
            nomfils = fils.getName();
            DefaultMutableTreeNode branche = new DefaultMutableTreeNode(nomfils);
            racine.add(branche);
            if(fils.getSousGroupes() != null){
                racine = branche;
                pere=fils;
                this.addJtree(pere, racine);
            }
        }
    }


    public void AffJTree(JScrollPane affgroup){
        JTree a =this.baseJTree();
        affgroup.add(a);
    }

    public void refreshTree(){

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {


        
    }

}
