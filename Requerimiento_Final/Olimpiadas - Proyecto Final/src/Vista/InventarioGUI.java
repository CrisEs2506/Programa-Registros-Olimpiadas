package Vista;

import Controlador.ControladorInventario;
import Modelo.Inventario;
import java.awt.Image;
import java.awt.Toolkit;

public class InventarioGUI extends javax.swing.JFrame {

    public static String idComplejo;
    public static String idDeporte;
    public static String idEquipo;
    public static String idEstado;
    
    public InventarioGUI() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciaButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistrarInventario = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jScrollSede = new javax.swing.JScrollPane();
        jTableSede = new javax.swing.JTable();
        jScrollDeporte = new javax.swing.JScrollPane();
        jTableDeporte = new javax.swing.JTable();
        jScrollEquipamiento = new javax.swing.JScrollPane();
        jTableEquipamiento = new javax.swing.JTable();
        jScrollEstado = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jTextPieza = new javax.swing.JTextField();
        jTextCantidad = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario | Olimpiadas");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jButtonRegistrarInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1336, 50, 250, 55));
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1249, 936, 220, 50));
        getContentPane().add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 935, 220, 50));

        jTableSede.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Complejo", "Nombre Complejo", "Presupuesto", "Dirección"
            }
        ));
        jTableSede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSedeMouseClicked(evt);
            }
        });
        jScrollSede.setViewportView(jTableSede);

        getContentPane().add(jScrollSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 260, 460, 240));

        jTableDeporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Deporte", "Nombre Deporte", "#Max Integrantes"
            }
        ));
        jTableDeporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDeporteMouseClicked(evt);
            }
        });
        jScrollDeporte.setViewportView(jTableDeporte);

        getContentPane().add(jScrollDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 623, 460, 240));

        jTableEquipamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Equipo", "Nombre Equipo", "#Partes"
            }
        ));
        jTableEquipamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEquipamientoMouseClicked(evt);
            }
        });
        jScrollEquipamiento.setViewportView(jTableEquipamiento);

        getContentPane().add(jScrollEquipamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 441, 460, 240));

        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Estado", "Descripción Estado"
            }
        ));
        jTableEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstadoMouseClicked(evt);
            }
        });
        jScrollEstado.setViewportView(jTableEstado);
        if (jTableEstado.getColumnModel().getColumnCount() > 0) {
            jTableEstado.getColumnModel().getColumn(1).setMinWidth(175);
        }

        getContentPane().add(jScrollEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1232, 623, 460, 240));

        jTextPieza.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 281, 280, 40));

        jTextCantidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 400, 250, 70));

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUI_3.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1769, 996));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableSedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSedeMouseClicked
        int fila = this.jTableSede.rowAtPoint(evt.getPoint());
        
        idComplejo = (this.jTableSede.getValueAt(fila, 0).toString());
        
        ControladorInventario controlador = new ControladorInventario(this);
        controlador.deporte(this.jTableDeporte);
    }//GEN-LAST:event_jTableSedeMouseClicked

    private void jTableDeporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDeporteMouseClicked
        int fila = this.jTableDeporte.rowAtPoint(evt.getPoint());

        idDeporte = (this.jTableDeporte.getValueAt(fila, 0).toString());
        
        ControladorInventario controlador = new ControladorInventario(this);
        controlador.equipo(this.jTableEquipamiento);
    }//GEN-LAST:event_jTableDeporteMouseClicked

    private void jTableEquipamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipamientoMouseClicked
        int fila = this.jTableEquipamiento.rowAtPoint(evt.getPoint());

        idEquipo = (this.jTableEquipamiento.getValueAt(fila, 0).toString());
        
        ControladorInventario controlador = new ControladorInventario(this);
        controlador.estado(this.jTableEstado);
    }//GEN-LAST:event_jTableEquipamientoMouseClicked

    private void jTableEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstadoMouseClicked
        int fila = this.jTableEstado.rowAtPoint(evt.getPoint());

        idEstado = (this.jTableEstado.getValueAt(fila, 0).toString());
        System.out.println(idEstado);
    }//GEN-LAST:event_jTableEstadoMouseClicked
    
    //Poner los Botones Transparentes
    public void transparenciaButton()
    {
        jButtonRegistrarInventario.setOpaque(false);
        jButtonRegistrarInventario.setContentAreaFilled(false);
        jButtonRegistrarInventario.setBorderPainted(false);
        
        jButtonRegresar.setOpaque(false);
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.setBorderPainted(false);
        
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
        InventarioGUI inventarioGUI = new InventarioGUI();
        ControladorInventario controlador = new ControladorInventario(inventarioGUI);
        
        inventarioGUI.setVisible(true);
        inventarioGUI.setLocationRelativeTo(inventarioGUI);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCerrar;
    public javax.swing.JButton jButtonRegistrarInventario;
    public javax.swing.JButton jButtonRegresar;
    public javax.swing.JLabel jLabelFondo;
    public javax.swing.JScrollPane jScrollDeporte;
    public javax.swing.JScrollPane jScrollEquipamiento;
    public javax.swing.JScrollPane jScrollEstado;
    public javax.swing.JScrollPane jScrollSede;
    public javax.swing.JTable jTableDeporte;
    public javax.swing.JTable jTableEquipamiento;
    public javax.swing.JTable jTableEstado;
    public javax.swing.JTable jTableSede;
    public javax.swing.JTextField jTextCantidad;
    public javax.swing.JTextField jTextPieza;
    // End of variables declaration//GEN-END:variables
}
