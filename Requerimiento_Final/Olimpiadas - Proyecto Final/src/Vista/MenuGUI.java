package Vista;

import Controlador.ControladorInventario;
import Controlador.ControladorMenu;
import Controlador.ControladorUnico;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuGUI extends javax.swing.JFrame {

    public MenuGUI() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciaButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonInventario = new javax.swing.JButton();
        jButtonUnico = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu | Olimpiadas");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 350, 55));
        jButtonInventario.getAccessibleContext().setAccessibleName("jButtonInventario");

        jButtonUnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 320, 350, 95));
        jButtonUnico.getAccessibleContext().setAccessibleName("jButtonUnico");

        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 460, 370, 90));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUI_2.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 676));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventarioActionPerformed
        InventarioGUI inventarioGUI = new InventarioGUI();
        ControladorInventario controlador = new ControladorInventario(inventarioGUI);
        inventarioGUI.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInventarioActionPerformed

    private void jButtonUnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnicoActionPerformed
        UnicoGUI unicoGUI = new UnicoGUI();
        ControladorUnico controlador = new ControladorUnico(unicoGUI);
        unicoGUI.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonUnicoActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        LoginGUI loginGUI = new LoginGUI();
        
        loginGUI.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    //Poner los Botones Transparentes
    public void transparenciaButton()
    {
        jButtonInventario.setOpaque(false);
        jButtonInventario.setContentAreaFilled(false);
        jButtonInventario.setBorderPainted(false);
        
        jButtonUnico.setOpaque(false);
        jButtonUnico.setContentAreaFilled(false);
        jButtonUnico.setBorderPainted(false);
        
        jButtonCerrar.setOpaque(false);
        jButtonCerrar.setContentAreaFilled(false);
        jButtonCerrar.setBorderPainted(false);
    }
    
    //Icono
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }
    
    public static void main(String args[]) 
    {
        MenuGUI menuGUI = new MenuGUI();
        ControladorMenu controlador = new ControladorMenu(menuGUI);
        
        menuGUI.setVisible(true);
        menuGUI.setLocationRelativeTo(menuGUI);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCerrar;
    public javax.swing.JButton jButtonInventario;
    public javax.swing.JButton jButtonUnico;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
