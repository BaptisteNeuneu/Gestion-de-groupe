package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import fr.iutfbleau.projetIHM2022FI2.API.*;
import fr.iutfbleau.projetIHM2022FI2.MNP.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class StaticMethodeEtu{
    public static int retour=0;
    public static AbstractChangementFactoryNP factory=null;
    public static void absoluteSize(Component comp, int x, int y) {
        comp.setSize(new Dimension(x, y));
        comp.setMinimumSize(new Dimension(x, y));
        comp.setPreferredSize(new Dimension(x, y));
        comp.setMaximumSize(new Dimension(x, y));
    }
    public static AbstractChangementFactoryNP getFactory(){
        if(retour==0){
            factory=MainTest.main();
            retour++;
        }
        return factory;
    }
    public static ArrayDeque<Groupe> recupTableau0(AbstractChangementFactoryNP factory){
            LinkedList<Groupe> pile = new LinkedList<Groupe>();
            ArrayDeque<Groupe> arbre = new ArrayDeque<Groupe>();
            AbstractGroupeFactory factory2=factory.getGroupeFactory();
            Groupe g=factory2.getPromotion();
            pile.addFirst(g);
            for(;!pile.isEmpty();){
                Groupe promotion = pile.remove();
                arbre.add(promotion);
                Iterator<Groupe> tab = promotion.getSousGroupes().iterator();
                for(;tab.hasNext();){
                    pile.add(tab.next());
                }
            }
            /*GroupeNP groupe1 = new GroupeNP("Groupe1",0,10);
            GroupeNP groupe2 = new GroupeNP("Groupe2",0,10);
            GroupeNP groupe3 = new GroupeNP("Groupe3",0,10);
            GroupeNP groupe4 = new GroupeNP("Groupe4",0,10);
            GroupeNP groupe5 = new GroupeNP("Groupe5",0,10);
            GroupeNP groupe6 = new GroupeNP("Groupe6",0,10);
        if(this.dif==0){
            ArrayDeque<GroupeNP> liste = new ArrayDeque<GroupeNP>();
            liste.add(groupe1);
            liste.add(groupe2);
            liste.add(groupe3);
            liste.add(groupe4);
            liste.add(groupe5);
            liste.add(groupe6);
            return liste;
        }*/
        return arbre;
    }
    public static ArrayDeque<Etudiant> recupTableau1(AbstractChangementFactoryNP factory){
        ArrayDeque<Etudiant> arbre = new ArrayDeque<Etudiant>();
        AbstractGroupeFactory factory2=factory.getGroupeFactory();
        Groupe g=factory2.getPromotion();
        Iterator<Etudiant> tab = g.getEtudiants().iterator();
        for(;tab.hasNext();){
                arbre.add(tab.next());
        }
            /*EtudiantNP etudiant1 = new EtudiantNP("nom1","prenom1");
            EtudiantNP etudiant2 = new EtudiantNP("nom2","prenom2");
            EtudiantNP etudiant3 = new EtudiantNP("nom3","prenom3");
            EtudiantNP etudiant4 = new EtudiantNP("nom4","prenom4");
            EtudiantNP etudiant5 = new EtudiantNP("nom5","prenom5");
            EtudiantNP etudiant6 = new EtudiantNP("nom6","prenom6");
            EtudiantNP etudiant7 = new EtudiantNP("nom1","prenom1");
            EtudiantNP etudiant8 = new EtudiantNP("nom2","prenom2");
            EtudiantNP etudiant9 = new EtudiantNP("nom3","prenom3");
            EtudiantNP etudiant10 = new EtudiantNP("nom4","prenom4");
            EtudiantNP etudiant11 = new EtudiantNP("nom5","prenom5");
            EtudiantNP etudiant12 = new EtudiantNP("nom6","prenom6");
        if(this.dif==1){
            ArrayDeque<EtudiantNP> liste = new ArrayDeque<EtudiantNP>();
            liste.add(etudiant1);
            liste.add(etudiant2);
            liste.add(etudiant3);
            liste.add(etudiant4);
            liste.add(etudiant5);
            //liste.add(etudiant6);
            //liste.add(etudiant7);
            //liste.add(etudiant8);
            //liste.add(etudiant9);
            //liste.add(etudiant10);
            //liste.add(etudiant11);
            //liste.add(etudiant12);
            return liste;
        }*/
        return arbre;
    }
    public static ArrayDeque<Changement> recupTableau2(AbstractChangementFactoryNP factory){
        ArrayDeque<Changement> arbre = new ArrayDeque<Changement>();
        Iterator<Changement> tab = factory.getAllChangements().iterator();
        for(;tab.hasNext();){
                arbre.add(tab.next());
        }
            /*GroupeNP groupe1 = new GroupeNP("Groupe1",0,10);
            GroupeNP groupe2 = new GroupeNP("Groupe2",0,10);
            GroupeNP groupe3 = new GroupeNP("Groupe3",0,10);
            GroupeNP groupe4 = new GroupeNP("Groupe4",0,10);
            GroupeNP groupe5 = new GroupeNP("Groupe5",0,10);
            GroupeNP groupe6 = new GroupeNP("Groupe6",0,10);
            EtudiantNP etudiant1 = new EtudiantNP("nom1","prenom1");
            EtudiantNP etudiant2 = new EtudiantNP("nom2","prenom2");
            EtudiantNP etudiant3 = new EtudiantNP("nom3","prenom3");
            EtudiantNP etudiant4 = new EtudiantNP("nom4","prenom4");
            EtudiantNP etudiant5 = new EtudiantNP("nom5","prenom5");
            EtudiantNP etudiant6 = new EtudiantNP("nom6"StaticMethodeEtu,"prenom6");
            ChangementNP changement1 = new ChangementNP(groupe1,etudiant1,groupe2);
            ChangementNP changement2 = new ChangementNP(groupe2,etudiant2,groupe3);
            ChangementNP changement3 = new ChangementNP(groupe3,etudiant3,groupe4);
            ChangementNP changement4 = new ChangementNP(groupe4,etudiant4,groupe5);
            ChangementNP changement5 = new ChangementNP(groupe5,etudiant5,groupe6);
            ChangementNP changement6 = new ChangementNP(groupe6,etudiant6,groupe1);
        if(this.dif==2){
            ArrayDeque<ChangementNP> liste = new ArrayDeque<ChangementNP>();
            liste.add(changement1);
            liste.add(changement2);
            liste.add(changement3);
            liste.add(changement4);
            liste.add(changement5);
            liste.add(changement6);
            return liste;
        }*/
        return arbre;
    }
}