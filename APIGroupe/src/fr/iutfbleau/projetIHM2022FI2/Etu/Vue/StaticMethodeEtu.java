package fr.iutfbleau.projetIHM2022FI2.Etu.Vue;

import javax.swing.*;
import java.awt.*;

public class StaticMethodeEtu{
    public static void absoluteSize(Component comp, int x, int y) {
        comp.setSize(new Dimension(x, y));
        comp.setMinimumSize(new Dimension(x, y));
        comp.setPreferredSize(new Dimension(x, y));
        comp.setMaximumSize(new Dimension(x, y));
    }
}