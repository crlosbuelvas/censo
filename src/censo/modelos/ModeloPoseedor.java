/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.modelos;

/**
 *
 * @author Admin
 */
public class ModeloPoseedor {
    private long id_poseedor;
    private long tipo_id;
    private String ape1_pos;
    private String ape2_pos;
    private String dir_pos;
    private int estrato_pos;
    private String ciudad_pos;
    private String licencia;
    private String sexo_pos;
    private String nacimiento_pos;
    private int personas_cargo;
    private int n_hijos;
    private String estado_civil;
    private String escolaridad_pos;
    private String profecion_pos;
    private String salud_pos;
    private String nom_pos;
    private String placa;
    private String tipo_documento;
    
    public ModeloPoseedor(){
        id_poseedor = 0;
        tipo_id = 0;
        ape1_pos = "";
        ape2_pos = "";
        dir_pos = "";
        estrato_pos = 0;
        ciudad_pos = "";
        licencia = "";
        sexo_pos = "";
        nacimiento_pos = "";
        personas_cargo = 0;
        n_hijos = 0;
        estado_civil = "";
        escolaridad_pos = "";
        profecion_pos = "";
        salud_pos = "";
        nom_pos = "";
        placa = "";
        tipo_documento = "";
    }
    
    public void setIdPoseedor(long id_posesdor){ this.id_poseedor = id_posesdor; }
    public void setTipoId(long tipo_id){ this.tipo_id = tipo_id; }
    public void setApe1Pos(String ape1_pos){ this.ape1_pos = ape1_pos.toUpperCase(); }
    public void setApe2Pos(String ape2_pos){ this.ape2_pos = ape2_pos.toUpperCase(); }
    public void setDirPos(String dir_pos){ this.dir_pos = dir_pos.toUpperCase(); }
    public void setEstratoPos(int estrato_pos){ this.estrato_pos = estrato_pos; }
    public void setCiudadPos(String ciudad_pos){ this.ciudad_pos = ciudad_pos.toUpperCase(); }
    public void setLicencia(String licencia){ this.licencia = licencia.toUpperCase(); }
    public void setSexoPos(String sexo_pos){ this.sexo_pos = sexo_pos.toUpperCase(); }
    public void setNacimientoPos(String nacimiento_pos){ this.nacimiento_pos = nacimiento_pos.toUpperCase(); }
    public void setPersonasCargo(int personas_cargo){ this.personas_cargo = personas_cargo; }
    public void setNHijos(int n_hijos){ this.n_hijos = n_hijos; }
    public void setEstadoCivil(String estado_civil){ this.estado_civil = estado_civil.toUpperCase(); }
    public void setEscolaridadPos(String escolaridad_pos){ this.escolaridad_pos = escolaridad_pos.toUpperCase(); }
    public void setProfecionPos(String profecion_pos){ this.profecion_pos = profecion_pos.toUpperCase(); }
    public void setSaludPos(String salud_pos){ this.salud_pos = salud_pos.toUpperCase(); }
    public void setNomPos(String nom_pos){ this.nom_pos = nom_pos.toUpperCase(); }
    public void setPlaca(String placa){ this.placa = placa.toUpperCase(); }
    public void setTipoDocumento(String tipo_documento){ this.tipo_documento = tipo_documento.toUpperCase(); }
    
    public long getIdPoseedor(){ return this.id_poseedor; }
    public long getTipoId(){ return this.tipo_id; }
    public String getApe1Pos(){ return this.ape1_pos; }
    public String getApe2Pos(){ return this.ape2_pos; }
    public String getDirPos(){ return this.dir_pos; }
    public int getEstratoPos(){ return this.estrato_pos; }
    public String getCiudadPos(){ return this.ciudad_pos; }
    public String getLicencia(){ return this.licencia; }
    public String getSexoPos(){ return this.sexo_pos; }
    public String getNacimientoPos(){ return this.nacimiento_pos; }
    public int getPersonasCargo(){ return this.personas_cargo; }
    public int getNHijos(){ return this.n_hijos; }
    public String getEstadoCivil(){ return this.estado_civil; }
    public String getEscolaridadPos(){ return this.escolaridad_pos; }
    public String getProfecionPos(){ return this.profecion_pos; }
    public String getSaludPos(){ return this.salud_pos; }
    public String getNomPos(){ return this.nom_pos; }
    public String getPlaca(){ return this.placa; }
    public String getTipoDocumento(){ return this.tipo_documento; }
    
}
