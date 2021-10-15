package Vista;

import Controlador.ControladorLogin;
import java.awt.Image;
import java.awt.Toolkit;

public class LoginGUI extends javax.swing.JFrame {

    public LoginGUI() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        
        transparenciaTextLabel();
        transparenciaButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextUsuario = new javax.swing.JTextField();
        jPasswordContrasena = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion | Olimpiadas");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextUsuario.setText("Usuario");
        getContentPane().add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 250, 40));

        jPasswordContrasena.setText("jPasswordField1");
        getContentPane().add(jPasswordContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 250, 40));
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 200, 75));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUI_1.png"))); // NOI18N
        jLabelFondo.setAlignmentY(0.0F);
        jLabelFondo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelFondo.setOpaque(true);
        jLabelFondo.setPreferredSize(new java.awt.Dimension(473, 864));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Poner los Cuadros de Texto Transparentes
    public void transparenciaTextLabel()
    {
        jTextUsuario.setOpaque(false);
        jPasswordContrasena.setOpaque(false);
    }
    
    //Poner los Botones Transparentes
    public void transparenciaButton()
    {
        jButtonLogin.setOpaque(false);
        jButtonLogin.setContentAreaFilled(false);
        jButtonLogin.setBorderPainted(false);
    }

    //Icono
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }
    
    public static void main(String args[]) 
    {
        LoginGUI loginGUI = new LoginGUI();
        ControladorLogin controlador = new ControladorLogin(loginGUI);
        
        loginGUI.setVisible(true);
        loginGUI.setLocationRelativeTo(loginGUI);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelFondo;
    public javax.swing.JPasswordField jPasswordContrasena;
    public javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
