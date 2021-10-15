package Vista;

import Controlador.ControladorUnico;
import java.awt.Image;
import java.awt.Toolkit;

public class UnicoGUI extends javax.swing.JFrame {

    public static String idComplejoUnico;
    
    public UnicoGUI() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciaButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextIDDeporte = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextIntegrantes = new javax.swing.JTextField();
        jTextIDUnico = new javax.swing.JTextField();
        jTextArea = new javax.swing.JTextField();
        jTextIDDeporte2 = new javax.swing.JTextField();
        jScrollSedeUnico = new javax.swing.JScrollPane();
        jTableSedeUnico = new javax.swing.JTable();
        jButtonRegistrarUnico = new javax.swing.JButton();
        jButtonRegresarUnico = new javax.swing.JButton();
        jButtonCerrarUnico = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deporte Unico | Olimpiadas");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextIDDeporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextIDDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 467, 260, 30));

        jTextNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 547, 290, 30));

        jTextIntegrantes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 625, 160, 30));

        jTextIDUnico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextIDUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 467, 280, 30));

        jTextArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 547, 310, 30));

        jTextIDDeporte2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextIDDeporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 625, 250, 30));

        jTableSedeUnico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Complejo", "Nombre Complejo", "Presupesto", "Dirección"
            }
        ));
        jTableSedeUnico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSedeUnicoMouseClicked(evt);
            }
        });
        jScrollSedeUnico.setViewportView(jTableSedeUnico);

        getContentPane().add(jScrollSedeUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 441, 460, 240));
        getContentPane().add(jButtonRegistrarUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(1336, 50, 250, 55));
        getContentPane().add(jButtonRegresarUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(1249, 936, 220, 50));
        getContentPane().add(jButtonCerrarUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 935, 220, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUI_4.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1769, 996));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableSedeUnicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSedeUnicoMouseClicked
        int fila = this.jTableSedeUnico.rowAtPoint(evt.getPoint());
        
        idComplejoUnico = (this.jTableSedeUnico.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_jTableSedeUnicoMouseClicked

    //Poner los Botones Transparentes
    public void transparenciaButton()
    {
        jButtonRegistrarUnico.setOpaque(false);
        jButtonRegistrarUnico.setContentAreaFilled(false);
        jButtonRegistrarUnico.setBorderPainted(false);
        
        jButtonRegresarUnico.setOpaque(false);
        jButtonRegresarUnico.setContentAreaFilled(false);
        jButtonRegresarUnico.setBorderPainted(false);
        
        jButtonCerrarUnico.setOpaque(false);
        jButtonCerrarUnico.setContentAreaFilled(false);
        jButtonCerrarUnico.setBorderPainted(false);
    }
    
    //Icono
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }
    
    public static void main(String args[]) 
    {
        UnicoGUI unicoGUI = new UnicoGUI();
        ControladorUnico controlador = new ControladorUnico(unicoGUI);
        
        unicoGUI.setVisible(true);
        unicoGUI.setLocationRelativeTo(unicoGUI);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCerrarUnico;
    public javax.swing.JButton jButtonRegistrarUnico;
    public javax.swing.JButton jButtonRegresarUnico;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollSedeUnico;
    public javax.swing.JTable jTableSedeUnico;
    public javax.swing.JTextField jTextArea;
    public javax.swing.JTextField jTextIDDeporte;
    public javax.swing.JTextField jTextIDDeporte2;
    public javax.swing.JTextField jTextIDUnico;
    public javax.swing.JTextField jTextIntegrantes;
    public javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
