package Controlador;

import Vista.LoginGUI;
import Vista.MenuGUI;
import Vista.InventarioGUI;
import Vista.UnicoGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorMenu implements ActionListener
{
    LoginGUI loginGUI = new LoginGUI();
    MenuGUI menuGUI = new MenuGUI();
    InventarioGUI inventarioGUI = new InventarioGUI();
    UnicoGUI unicoGUI = new UnicoGUI();
    
    public ControladorMenu(MenuGUI menuGUI)
    {
        this.menuGUI = menuGUI;
        this.menuGUI.jButtonInventario.addActionListener(this);
        this.menuGUI.jButtonUnico.addActionListener(this);
        this.menuGUI.jButtonCerrar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==menuGUI.jButtonInventario)
        {
            botonInventario();
        }
        
        if(e.getSource()==menuGUI.jButtonUnico)
        {
            botonUnico();
        }
        
        if(e.getSource()==menuGUI.jButtonCerrar)
        {
            botonCerrar();
        }
    }
    
    public void botonInventario()
    {
        inventarioGUI.setVisible(true);
        menuGUI.setVisible(false);
    }
    
    public void botonUnico()
    {
        unicoGUI.setVisible(true);
        menuGUI.setVisible(false);
    }
    
    public void botonCerrar()
    {
        loginGUI.setVisible(true);
        menuGUI.setVisible(false);
    }
}
