package fr.iutfbleau.projetIHM2022FI2.Test;
import fr.iutfbleau.projetIHM2022FI2.MP.*;
import fr.iutfbleau.projetIHM2022FI2.API.*;

public class Testtkt {
    public static void main(String[] args) {
        Etudiant e51=new EtudiantMP("prosper","marzio");
        Etudiant e52=new EtudiantMP("mirabelle","massimiliano");
        Etudiant e53=new EtudiantMP("carine","matteo");
        Etudiant e54=new EtudiantMP("jeannine","melchiorre");
        Etudiant e55=new EtudiantMP("dianne","micaela");
        Etudiant e56=new EtudiantMP("evette","michela");
        Etudiant e57=new EtudiantMP("gisselle","michelangela");

        Groupe g1 = new GroupeMP("test", 0, 25);
        g1.addEtudiant(e57);
        g1.addEtudiant(e55);
        Groupe g2 = new GroupeMP(g1);
    }
}
