/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.views;

import censo.controladores.BorrarCenso;
import censo.controladores.ControladorConductor;
import censo.controladores.ControladorImagen;
import censo.controladores.ControladorPersona;
import censo.controladores.ControladorVehiculo;
import censo.modelos.ModeloCenso;
import censo.modelos.ModeloConductor;
import censo.modelos.ModeloImagen;
import censo.modelos.ModeloPerfil;
import censo.modelos.ModeloPersona;
import censo.modelos.ModeloReporte;
import censo.modelos.ModeloUsuario;
import censo.modelos.ModeloVeiculo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    ModeloPersona MPoseedor;
    ModeloPersona MPropietario;
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
        mandos = new Mandos(this);
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
        
        MConductor = new ModeloConductor[5];
        
        VentanaBuscar v = new VentanaBuscar(ventana, this);
    }
    
    public void buscar(){
        if(n_censo != 0){
            MImagen = new ModeloImagen();
            MImagen.setNCenso(n_censo);
            ControladorImagen CI = new ControladorImagen(MImagen);
            MImagen = CI.Select("SelectForId");

            try {
                camara.setImagenByte(MImagen.getImagenBytea());
                System.err.println(MImagen.getImagenBytea());
            } catch (IOException ex) {
                Logger.getLogger(RompeCabezas.class.getName()).log(Level.SEVERE, null, ex);
            }

            MPropietario = new ModeloPersona();
            MPropietario.setIdPersona(n_censo);
            ControladorPersona CPr = new ControladorPersona(MPropietario);
            MPropietario = CPr.Select("SelectForId");
            propietario.setModelo(MPropietario);

            MPoseedor = new ModeloPersona();
            MPoseedor.setIdPersona(n_censo);
            ControladorPersona CPo = new ControladorPersona(MPoseedor);
            MPoseedor = CPo.Select("SelectForId");
            poseedor.setModelo(MPoseedor);

            MVehiculo = new ModeloVeiculo();
            MVehiculo.setNCenso(n_censo);
            ControladorVehiculo CV = new ControladorVehiculo(MVehiculo);
            MVehiculo = CV.Select("SelectForId");
            veiculo.setModel(MVehiculo);
            
            for(int i = 0; i < 5; i++){
                MConductor[i] = new ModeloConductor();
                MConductor[i].setNCenso(n_censo);
            }
            ControladorConductor CC = new ControladorConductor();
            CC.setModelo(MConductor[0]);
            MConductor = CC.Select("SelectLote");
            
            conductores.setConductores(MConductor);
            
            activar(false);
        }
    }
    
    public void guardar(){
        int susses1, susses2, susses3, susses4;
        
        MPropietario = new ModeloPersona();
        MPropietario.setIdPersona(n_censo);
        ControladorPersona CPr = new ControladorPersona(MPropietario);
        if(CPr.Select("SelectForId").getIdPersona() != 0){
            MPropietario = propietario.getModelo();
            MPropietario.setIdPersona(n_censo);
            CPr = new ControladorPersona(MPropietario);
            susses1 = CPr.InsertarActualizar("Actualizar");
        }else{
            MPropietario = propietario.getModelo();
            MPropietario.setIdPersona(n_censo);
            CPr = new ControladorPersona(MPropietario);
            susses1 = CPr.InsertarActualizar("Insertar");
        }
        
        MPoseedor = new ModeloPersona();
        MPoseedor.setIdPersona(n_censo);
        ControladorPersona CPo = new ControladorPersona(MPoseedor);
        if(CPo.Select("SelectForId").getIdPersona()!= 0){
            MPoseedor = poseedor.getModelo();
            MPoseedor.setIdPersona(n_censo);
            CPo = new ControladorPersona(MPoseedor);
            susses2 = CPo.InsertarActualizar("Actualizar");
        }else{
            MPoseedor = poseedor.getModelo();
            MPoseedor.setIdPersona(n_censo);
            CPo = new ControladorPersona(MPoseedor);
            susses2 = CPo.InsertarActualizar("Insertar");
        }
        
        MVehiculo = new ModeloVeiculo();
        MVehiculo.setNCenso(n_censo);
        ControladorVehiculo CV = new ControladorVehiculo(MVehiculo);
        if(CV.Select("SelectForId").getNCenso() != 0){
            System.out.println("1");
            MVehiculo = veiculo.getModel();
            MVehiculo.setNCenso(n_censo);
            CV = new ControladorVehiculo(MVehiculo);
            susses3 = CV.InsertarActualizar("Actualizar");
        }else{
            System.out.println("2");
            MVehiculo = veiculo.getModel();
            MVehiculo.setNCenso(n_censo);
            CV = new ControladorVehiculo(MVehiculo);
            susses3 = CV.InsertarActualizar("Insertar");
        }
        
        MConductor = conductores.getConductores();
        for(int i = 0; i < 5; i++){
            MConductor[i].setNCenso(n_censo);
            if(MConductor[i].getIdConductor() != 0){
                ControladorConductor CC = new ControladorConductor();
                CC.setModelo(MConductor[i]);
                ModeloConductor[] MConductor2 = CC.Select("SelectForId");
                CC = new ControladorConductor();
                CC.setModelo(MConductor[i]);
                if (MConductor2[0].getCedula() != 0){
                    CC.InsertarActualizar("Actualizar");
                }else {
                    CC.InsertarActualizar("Insertar");
                }
            }
        }
        
        if (susses1 != 3 && susses2 != 3 && susses3 != 3) {
            JOptionPane.showMessageDialog(null, "censo actualizado de manera exitosa", "info", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "censo no actualizado", "info", JOptionPane.WARNING_MESSAGE);
        }
        
        System.gc();
    }
    
    public void Borrar(){
        BorrarCenso bc = new BorrarCenso(n_censo);
    }
    
    public void activar(){
        veiculo.setActive();
        poseedor.setActive();
        propietario.setActive();
    }
    public void activar(boolean estado){
        veiculo.setActive(estado);
        poseedor.setActive(estado);
        propietario.setActive(estado);
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
