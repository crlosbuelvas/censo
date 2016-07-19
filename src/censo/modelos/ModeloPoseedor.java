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
    private int id_poseedor;
    private int tipo_id;
    private String ape1_pos;
    private String ape2_pos;
    private String dir_pos;
    private String estrato_pos;
    private String ciudad_pos;
    private String licencia;
    private String sexo_pos;
    private String nacimiento_pos;
    private String personas_cargo;
    private String n_hijos;
    private String estado_civil;
    private String escolaridad_pos;
    private String profecion_pos;
    private String salud_pos;
    private String nom_pos;
    private String placa;
    
    public void setIdPseedor(int id_posesdor){ this.id_poseedor = id_posesdor; }
    public void setTipoId(int tipo_id){ this.tipo_id = tipo_id; }
    public void setApe1Pos(String ape1_pos){ this.ape1_pos = ape1_pos.toUpperCase(); }
    public void setApe2Pos(String ape2_pos){ this.ape2_pos = ape2_pos.toUpperCase(); }
    public void setDirPos(String dir_pos){ this.dir_pos = dir_pos.toUpperCase(); }
    public void setEstratoPos(String estrato_pos){ this.estrato_pos = estrato_pos.toUpperCase(); }
    public void setCiudadPos(String ciudad_pos){ this.ciudad_pos = ciudad_pos.toUpperCase(); }
    public void setLicencia(String licencia){ this.licencia = licencia.toUpperCase(); }
    public void setSexoPos(String sexo_pos){ this.sexo_pos = sexo_pos.toUpperCase(); }
    public void setNacimientoPos(String nacimiento_pos){ this.nacimiento_pos = nacimiento_pos.toUpperCase(); }
    public void setPersonasCargo(String personas_cargo){ this.personas_cargo = personas_cargo.toUpperCase(); }
    public void setNHijos(String n_hijos){ this.n_hijos = n_hijos.toUpperCase(); }
    public void setEstadoCivil(String estado_civil){ this.estado_civil = estado_civil.toUpperCase(); }
    public void setEscolaridadPos(String escolaridad_pos){ this.escolaridad_pos = escolaridad_pos.toUpperCase(); }
    public void setProfecionPos(String profecion_pos){ this.profecion_pos = profecion_pos.toUpperCase(); }
    public void setSaludPos(String salud_pos){ this.salud_pos = salud_pos.toUpperCase(); }
    public void setNomPos(String nom_pos){ this.nom_pos = nom_pos.toUpperCase(); }
    public void setPlaca(String placa){ this.placa = placa.toUpperCase(); }
    
    public int getIdPseedor(int id_posesdor){ return this.id_poseedor; }
    public int getTipoId(int tipo_id){ return this.tipo_id; }
    public String getApe1Pos(String ape1_pos){ return this.ape1_pos; }
    public String getApe2Pos(String ape2_pos){ return this.ape2_pos; }
    public String getDirPos(String dir_pos){ return this.dir_pos; }
    public String getEstratoPos(String estrato_pos){ return this.estrato_pos; }
    public String getCiudadPos(String ciudad_pos){ return this.ciudad_pos; }
    public String getLicencia(String licencia){ return this.licencia; }
    public String getSexoPos(String sexo_pos){ return this.sexo_pos; }
    public String getNacimientoPos(String nacimiento_pos){ return this.nacimiento_pos; }
    public String getPersonasCargo(String personas_cargo){ return this.personas_cargo; }
    public String getNHijos(String n_hijos){ return this.n_hijos = n_hijos.toUpperCase(); }
    public String getEstadoCivil(String estado_civil){ return this.estado_civil; }
    public String getEscolaridadPos(String escolaridad_pos){ return this.escolaridad_pos; }
    public String getProfecionPos(String profecion_pos){ return this.profecion_pos; }
    public String getSaludPos(String salud_pos){ return this.salud_pos; }
    public String getNomPos(String nom_pos){ return this.nom_pos; }
    public String getPlaca(String placa){ return this.placa; }
    
}
