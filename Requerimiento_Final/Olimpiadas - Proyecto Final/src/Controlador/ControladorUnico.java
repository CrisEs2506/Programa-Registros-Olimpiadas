package Controlador;

import Modelo.Unico;
import Modelo.UnicoDAO;
import Vista.UnicoGUI;
import Vista.LoginGUI;
import Vista.MenuGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorUnico implements ActionListener
{
    UnicoGUI unicoGUI = new UnicoGUI();
    LoginGUI loginGUI = new LoginGUI();
    MenuGUI menuGUI = new MenuGUI();
    UnicoDAO unicoDAO = new UnicoDAO();
    Unico unico = new Unico();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorUnico(UnicoGUI unicoGUI)
    {
        this.unicoGUI = unicoGUI;
        this.unicoGUI.jButtonRegistrarUnico.addActionListener(this);
        this.unicoGUI.jButtonRegresarUnico.addActionListener(this);
        this.unicoGUI.jButtonCerrarUnico.addActionListener(this);
        sedeUnico(unicoGUI.jTableSedeUnico);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==unicoGUI.jButtonRegistrarUnico)
        {
            botonRegistrarUnico();
        }
        
        if(e.getSource()==unicoGUI.jButtonRegresarUnico)
        {
            botonRegresarUnico();
        }
        
        if(e.getSource()==unicoGUI.jButtonCerrarUnico)
        {
            botonCerrarUnico();
        }
    }
    
    //Metodo para mostrar la tabla Sede Unico cada vez que se abra la interfaz Unico
    public void sedeUnico(JTable tabla)
    {
        if(unicoGUI.isVisible() == false)
        {
            modelo = (DefaultTableModel) tabla.getModel();
            List<Unico> listaSedeUnico = unicoDAO.mostrarSedeUnico();
            Object[] object = new Object[4];

            for(int i=0; i<listaSedeUnico.size(); i++)
            {
                object[0] = listaSedeUnico.get(i).getIdcomplejounico();
                object[1] = listaSedeUnico.get(i).getNomcomplejounico();
                object[2] = listaSedeUnico.get(i).getPresupuestounico();
                object[3] = listaSedeUnico.get(i).getDireccionunico();
                modelo.addRow(object);
            }
            
            unicoGUI.jTableSedeUnico.setModel(modelo);
        }
    }
    
    public void botonRegistrarUnico()
    {
        //Obtener Datos que Usuario digita en Campos de Texto de Deporte
        String idDeporte = unicoGUI.jTextIDDeporte.getText();
        String nombreDeporte = unicoGUI.jTextNombre.getText();
        String nIntegrantes = unicoGUI.jTextIntegrantes.getText();
        
        //Obtener Datos que Usuario digita en Campos de Texto de Unico
        String idUnico = unicoGUI.jTextIDUnico.getText();
        String area = unicoGUI.jTextArea.getText();
        
        //Colocar Datos de Deporte en Clase Unico
        unico.setIddeporte(idDeporte);
        unico.setNomdeporteunico(nombreDeporte);
        unico.setNmaxintegrantesunico(Integer.parseInt(nIntegrantes));
        
        //Colocar Datos de Unico en Clase Unico
        unico.setIdunico(idUnico);
        unico.setAreaunico(Double.parseDouble(area));
        
        //Colocar Texto del ID Deporte Anteriormente Digitado en Deporte
        unicoGUI.jTextIDDeporte2.setText(idDeporte);
        
        int respuesta = unicoDAO.registrarUnico(unico);
        
        if(respuesta == 1)
        {
            JOptionPane.showMessageDialog(unicoGUI, "Registro de Evento Unico Agregado con Éxito");
        }
        else
        {
            JOptionPane.showMessageDialog(unicoGUI, "Algo se Ingreso Erroneamente, por favor Vuelve a Intentarlo");
        }
    }
    
    public void botonRegresarUnico()
    {
        menuGUI.setVisible(true);
        unicoGUI.setVisible(false);
    }
    
    public void botonCerrarUnico()
    {
        loginGUI.setVisible(true);
        unicoGUI.setVisible(false);
    }
}
