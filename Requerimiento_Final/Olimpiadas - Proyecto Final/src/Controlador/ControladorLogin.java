package Controlador;

import Modelo.Login;
import Modelo.LoginDAO;
import Vista.LoginGUI;
import Vista.MenuGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener
{
    Login login = new Login();
    LoginDAO loginDAO = new LoginDAO();
    LoginGUI loginGUI = new LoginGUI();
    MenuGUI menuGUI = new MenuGUI();
    
    public ControladorLogin(LoginGUI loginGUI)
    {
        this.loginGUI = loginGUI;
        this.loginGUI.jButtonLogin.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==loginGUI.jButtonLogin)
        {
            botonEntrar();
        }
    }
    
    public void botonEntrar()
    {
        //Obtener Datos de Usuario y Contraseña del JText y JPassword
        String usuario = loginGUI.jTextUsuario.getText();
        String password = loginGUI.jPasswordContrasena.getText();
        
        //Mandar Datos a la clase Login
        login.setUsuario(usuario);
        login.setPassword(password);
        
        boolean bool = loginDAO.comparar(login);
        
        if(bool == true)
        {
            menuGUI.setVisible(true);
            loginGUI.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(loginGUI, "El Usuario o la Contraseña son Incorrectos");
        }
    }
}
