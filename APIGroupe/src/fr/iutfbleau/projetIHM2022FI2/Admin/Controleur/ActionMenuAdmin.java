package fr.iutfbleau.projetIHM2022FI2.Admin.Controleur;

import java.awt.event.*;
import javax.swing.*;

import fr.iutfbleau.projetIHM2022FI2.Admin.Vue.*;

public class ActionMenuAdmin implements ActionListener, MouseListener {

    JButton AddEtu,CreeGroup,SupGroup,RenGroup,DepEtu;
    Pancardlayout a;
    public ActionMenuAdmin(JButton AddEtu,JButton CreeGroup,JButton SupGroup,JButton RenGroup,JButton DepEtu,Pancardlayout a){
        this.AddEtu = AddEtu;
        this.CreeGroup = CreeGroup;
        this.SupGroup = SupGroup;
        this.RenGroup = RenGroup;
        this.DepEtu = DepEtu;
        this.a =a;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == AddEtu){
            a.getaddetu();
        }
        if(e.getSource() == CreeGroup){
            a.getcreegroup();
        }
        if(e.getSource() == SupGroup){
            a.getsupgroup();
        }
        if(e.getSource() == RenGroup){
            a.getrengroup();
        }
        if(e.getSource() == DepEtu){
            a.getdepetu();
        }

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
