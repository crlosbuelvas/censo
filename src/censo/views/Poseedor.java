/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.views;

import censo.modelos.ModeloPoseedor;
import javax.swing.JOptionPane;

/**
 *
 * @author GESTIONSAS
 */
public class Poseedor extends javax.swing.JPanel {

    /**
     * Creates new form Poseedor
     */
    public Poseedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        licencia = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        sexo_pro = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        estado_civil = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        personas_cargo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        n_hijos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ape1_pro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ape2_pro = new javax.swing.JTextField();
        nom_pro = new javax.swing.JTextField();
        escolaridad_pro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        profecion_pro = new javax.swing.JTextField();
        dir_pro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        estrato_pro = new javax.swing.JTextField();
        tipo_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Licencia1 = new javax.swing.JRadioButton();
        ciudad_pro = new javax.swing.JTextField();
        licencia2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        salud_pro = new javax.swing.JComboBox<>();
        id_propietario = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        nacimiento_pro = new javax.swing.JFormattedTextField();

        jLabel9.setText("Sexo");

        sexo_pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        jLabel10.setText("Estado Civil");

        jLabel12.setText("Personas a Cargo");

        jLabel1.setText("Primer Apellido");

        jLabel13.setText("N°  de Hijos");

        jLabel2.setText("Segundo Apellido");

        jLabel3.setText("Nombres");

        jLabel15.setText("Licencia");

        ape1_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ape1_proActionPerformed(evt);
            }
        });

        jLabel18.setText("Escolaridad");

        jLabel20.setText("Profesion");

        jLabel4.setText("Direccion");

        jLabel21.setText("Salud");

        jLabel5.setText("Estrato");

        jLabel22.setText("Tipo Id");

        jLabel6.setText("Ciudad");

        licencia.add(Licencia1);
        Licencia1.setText("si");

        licencia.add(licencia2);
        licencia2.setText("no");

        jLabel7.setText("N° De Identificacion");

        salud_pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subsidiado", "contributivo" }));

        id_propietario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel8.setText("Fecha de Nacimiento");

        nacimiento_pro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/MM/yyyy"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ape1_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ape2_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nom_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dir_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ciudad_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Licencia1)
                        .addGap(2, 2, 2)
                        .addComponent(licencia2)
                        .addGap(46, 46, 46)
                        .addComponent(estrato_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel13)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nacimiento_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(personas_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(n_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sexo_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(escolaridad_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(profecion_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salud_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ape1_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ape2_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Licencia1)
                    .addComponent(licencia2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dir_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estrato_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nacimiento_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personas_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escolaridad_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profecion_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salud_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ape1_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ape1_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ape1_proActionPerformed
    
    public ModeloPoseedor getModelo(){
        if(!nom_pro.equals("") && !ape1_pro.equals("") && !ape2_pro.equals("") &&
                !ciudad_pro.equals("") && !dir_pro.equals("") && !escolaridad_pro.equals("") && 
                !estado_civil.equals("") && !estrato_pro.equals("") && !id_propietario.equals("") && 
                !n_hijos.equals("") && !nacimiento_pro.equals("") && !personas_cargo.equals("") && 
                !profecion_pro.equals("") && !tipo_id.equals("")){
            try{
                ModeloPoseedor MP = new ModeloPoseedor();
                MP.setNomPos(nom_pro.getText());
                MP.setApe1Pos(ape1_pro.getText());
                MP.setApe2Pos(ape2_pro.getText());
                MP.setCiudadPos(ciudad_pro.getText());
                MP.setDirPos(dir_pro.getText());
                MP.setEscolaridadPos(escolaridad_pro.getText());
                MP.setEstadoCivil(estado_civil.getText());
                MP.setEstratoPos(Integer.parseInt(estrato_pro.getText()));
                MP.setTipoId(Long.parseLong(id_propietario.getText()));
                if(Licencia1.isSelected()){
                    MP.setLicencia("si");
                }else{
                    MP.setLicencia("no");
                }
                MP.setNHijos(Integer.parseInt(n_hijos.getText()));
                MP.setNacimientoPos(nacimiento_pro.getText());
                MP.setPersonasCargo(Integer.parseInt(personas_cargo.getText()));
                MP.setProfecionPos(profecion_pro.getText());
                MP.setSaludPos(String.valueOf(salud_pro.getSelectedItem()));
                MP.setSexoPos(String.valueOf(String.valueOf(sexo_pro.getSelectedItem())).substring(0, 1));
                MP.setTipoDocumento(tipo_id.getText());
                
                return MP;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "los campos de identificacion y numero de hijos deven ser numericos deven ser numericos", "error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }
    
    public void setModelo(ModeloPoseedor MP){
        nom_pro.setText(MP.getNomPos());
        ape1_pro.setText(MP.getApe1Pos());
        ape2_pro.setText(MP.getApe2Pos());
        ciudad_pro.setText(MP.getCiudadPos());
        dir_pro.setText(MP.getDirPos());
        escolaridad_pro.setText(MP.getEscolaridadPos());
        estado_civil.setText(MP.getEstadoCivil());
        estrato_pro.setText(String.valueOf(MP.getEstratoPos()));
        id_propietario.setText(String.valueOf(MP.getTipoId()));
        if(MP.getLicencia().equals("SI")){
            Licencia1.setSelected(true);
            licencia2.setSelected(false);
        }else{
            Licencia1.setSelected(false);
            licencia2.setSelected(true);
        }
        n_hijos.setText(String.valueOf(MP.getNHijos()));
        nacimiento_pro.setText(MP.getNacimientoPos());
        personas_cargo.setText(String.valueOf(MP.getPersonasCargo()));
        profecion_pro.setText(MP.getProfecionPos());
        salud_pro.setSelectedItem(MP.getSaludPos());
        if(MP.getSexoPos().equals("M")){
            sexo_pro.setSelectedItem("Masculino");
        } else if (MP.getSexoPos().equals("F")) {
            sexo_pro.setSelectedItem("Femenino");
        } else {
            sexo_pro.setSelectedItem("Otros");
        }
        tipo_id.setText(MP.getTipoDocumento());
    }
    
    public void setActive(){
        Licencia1.setEnabled(!Licencia1.isEnabled());
        ape1_pro.setEnabled(!ape1_pro.isEnabled());
        ape2_pro.setEnabled(!ape2_pro.isEnabled());
        ciudad_pro.setEnabled(!ciudad_pro.isEnabled());
        dir_pro.setEnabled(!dir_pro.isEnabled());
        escolaridad_pro.setEnabled(!escolaridad_pro.isEnabled());
        estado_civil.setEnabled(!estado_civil.isEnabled());
        estrato_pro.setEnabled(!estrato_pro.isEnabled());
        id_propietario.setEnabled(!id_propietario.isEnabled());
        licencia2.setEnabled(!licencia2.isEnabled());
        n_hijos.setEnabled(!n_hijos.isEnabled());
        nacimiento_pro.setEnabled(!nacimiento_pro.isEnabled());
        nom_pro.setEnabled(!nom_pro.isEnabled());
        personas_cargo.setEnabled(!personas_cargo.isEnabled());
        profecion_pro.setEnabled(!profecion_pro.isEnabled());
        salud_pro.setEnabled(!salud_pro.isEnabled());
        sexo_pro.setEnabled(!sexo_pro.isEnabled());
        tipo_id.setEnabled(!tipo_id.isEnabled());
    }
    public void setActive(boolean estado){
        Licencia1.setEnabled(estado);
        ape1_pro.setEnabled(estado);
        ape2_pro.setEnabled(estado);
        ciudad_pro.setEnabled(estado);
        dir_pro.setEnabled(estado);
        escolaridad_pro.setEnabled(estado);
        estado_civil.setEnabled(estado);
        estrato_pro.setEnabled(estado);
        id_propietario.setEnabled(estado);
        licencia2.setEnabled(estado);
        n_hijos.setEnabled(estado);
        nacimiento_pro.setEnabled(estado);
        nom_pro.setEnabled(estado);
        personas_cargo.setEnabled(estado);
        profecion_pro.setEnabled(estado);
        salud_pro.setEnabled(estado);
        sexo_pro.setEnabled(estado);
        tipo_id.setEnabled(estado);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Licencia1;
    private javax.swing.JTextField ape1_pro;
    private javax.swing.JTextField ape2_pro;
    private javax.swing.JTextField ciudad_pro;
    private javax.swing.JTextField dir_pro;
    private javax.swing.JTextField escolaridad_pro;
    private javax.swing.JTextField estado_civil;
    private javax.swing.JTextField estrato_pro;
    private javax.swing.JFormattedTextField id_propietario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.ButtonGroup licencia;
    private javax.swing.JRadioButton licencia2;
    private javax.swing.JTextField n_hijos;
    private javax.swing.JFormattedTextField nacimiento_pro;
    private javax.swing.JTextField nom_pro;
    private javax.swing.JTextField personas_cargo;
    private javax.swing.JTextField profecion_pro;
    private javax.swing.JComboBox<String> salud_pro;
    private javax.swing.JComboBox<String> sexo_pro;
    private javax.swing.JTextField tipo_id;
    // End of variables declaration//GEN-END:variables
}
