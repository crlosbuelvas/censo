/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.views;

import censo.controladores.ControladorImagen;
import censo.controladores.ControladorPropietario;
import censo.modelos.ModeloCenso;
import censo.modelos.ModeloConductor;
import censo.modelos.ModeloImagen;
import censo.modelos.ModeloPerfil;
import censo.modelos.ModeloPoseedor;
import censo.modelos.ModeloPropietario;
import censo.modelos.ModeloReporte;
import censo.modelos.ModeloUsuario;
import censo.modelos.ModeloVeiculo;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author Admin
 */
public class RompeCabezas extends javax.swing.JPanel {

    /**
     * Creates new form RompeCabezas
     */
    
    ModeloCenso MCenso = null;
    ModeloConductor[] MConductor = new ModeloConductor[5];
    ModeloImagen MImagen;
    ModeloPerfil MPerfil;
    ModeloPoseedor MPoseedor;
    ModeloPropietario MPropietario;
    ModeloReporte MReporte;
    ModeloUsuario MUsuario;
    ModeloVeiculo MVehiculo;
    
    public int n_censo = 0;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public RompeCabezas(JFrame ventana) {
        setLayout(null);
        
        veiculo = new Vehiculos();
        propietario = new Propietario();
        poseedor = new Poseedor();
        camara = new ImagenView();
        conductores = new Conductor();
        mandos = new Mandos();
        POS_PRO = new JTabbedPane();
        
        
        camara.setLocation((ventana.getSize().width-320)-20, 10);
        camara.setSize(320, 240 + 50);
        veiculo.setBounds(10, 10, camara.getLocation().x - 20, 414);
        POS_PRO.setBounds(10, veiculo.getSize().height+20, veiculo.getSize().width, 230);
        propietario.setBounds(0, 0, POS_PRO.getSize().width - 10, 220);
        poseedor.setBounds(0, 0, POS_PRO.getSize().width - 10, 220);
        conductores.setBounds(camara.getLocation().x, 10 + (camara.getSize().height+10), camara.getSize().width, 180);
        mandos.setBounds(camara.getLocation().x,
                10 + (camara.getSize().height+10) + (conductores.getSize().height + 10),
                camara.getSize().width, 100);
        
        POS_PRO.addTab("Propietario", propietario);
        POS_PRO.addTab("Poseedor", poseedor);
        
        add(veiculo);
        add(POS_PRO);
        add(camara);
        add(conductores);
        add(mandos);
        
        VentanaBuscar v = new VentanaBuscar(ventana, this);
    }
    
    public void buscar(){
        MImagen = new ModeloImagen();
        MImagen.setIdImagen(n_censo);
        ControladorImagen CI = new ControladorImagen(MImagen);
        MImagen = CI.Select("SelectForId");
        
        try {
            camara.setImagenByte(MImagen.getImagenBytea());
            System.err.println(MImagen.getImagenBytea());
        } catch (IOException ex) {
            Logger.getLogger(RompeCabezas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MPropietario = new ModeloPropietario();
        MPropietario.setIdPropietario(n_censo);
        ControladorPropietario CP = new ControladorPropietario(MPropietario);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private Vehiculos veiculo;
    private Propietario propietario;
    private Poseedor poseedor;
    private ImagenView camara;
    private Conductor conductores;
    private Mandos mandos;
    private JTabbedPane POS_PRO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
