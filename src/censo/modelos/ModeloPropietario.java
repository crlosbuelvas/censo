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
public class ModeloPropietario {
    private int id_propietario;
    private int tipo_id;
    private String ape1_pro;
    private String ape2_pro;
    private String dir_pro;
    private String estrato_pro;
    private String ciudad_pro;
    private String licencia;
    private String sexo_pro;
    private String nacimiento_pro;
    private String personas_cargo;
    private String n_hijos;
    private String estado_civil;
    private String escolaridad_pro;
    private String profecion_pro;
    private String salud_pro;
    private String nom_pro;
    private String placa;
    
    public void setIdPropietario(int id_propietario){ this.id_propietario = id_propietario; }
    public void setTipoId(int tipo_id){ this.tipo_id = tipo_id; }
    public void setApe1Pos(String ape1_pro){ this.ape1_pro = ape1_pro.toUpperCase(); }
    public void setApe2Pos(String ape2_pro){ this.ape2_pro = ape2_pro.toUpperCase(); }
    public void setDirPos(String dir_pro){ this.dir_pro = dir_pro.toUpperCase(); }
    public void setEstratoPos(String estrato_pro){ this.estrato_pro = estrato_pro.toUpperCase(); }
    public void setCiudadPos(String ciudad_pro){ this.ciudad_pro = ciudad_pro.toUpperCase(); }
    public void setLicencia(String licencia){ this.licencia = licencia.toUpperCase(); }
    public void setSexoPos(String sexo_pro){ this.sexo_pro = sexo_pro.toUpperCase(); }
    public void setNacimientoPos(String nacimiento_pro){ this.nacimiento_pro = nacimiento_pro.toUpperCase(); }
    public void setPersonasCargo(String personas_cargo){ this.personas_cargo = personas_cargo.toUpperCase(); }
    public void setNHijos(String n_hijos){ this.n_hijos = n_hijos.toUpperCase(); }
    public void setEstadoCivil(String estado_civil){ this.estado_civil = estado_civil.toUpperCase(); }
    public void setEscolaridadPos(String escolaridad_pro){ this.escolaridad_pro = escolaridad_pro.toUpperCase(); }
    public void setProfecionPos(String profecion_pro){ this.profecion_pro = profecion_pro.toUpperCase(); }
    public void setSaludPos(String salud_pro){ this.salud_pro = salud_pro.toUpperCase(); }
    public void setNomPos(String nom_pro){ this.nom_pro = nom_pro.toUpperCase(); }
    public void setPlaca(String placa){ this.placa = placa.toUpperCase(); }
    
    public int getIdPropietario(){ return this.id_propietario; }
    public int getTipoId(){ return this.tipo_id; }
    public String getApe1Pos(){ return this.ape1_pro; }
    public String getApe2Pos(){ return this.ape2_pro; }
    public String getDirPos(){ return this.dir_pro; }
    public String getEstratoPos(){ return this.estrato_pro; }
    public String getCiudadPos(){ return this.ciudad_pro; }
    public String getLicencia(){ return this.licencia; }
    public String getSexoPos(){ return this.sexo_pro; }
    public String getNacimientoPos(){ return this.nacimiento_pro; }
    public String getPersonasCargo(){ return this.personas_cargo; }
    public String getNHijos(){ return this.n_hijos = n_hijos; }
    public String getEstadoCivil(){ return this.estado_civil; }
    public String getEscolaridadPos(){ return this.escolaridad_pro; }
    public String getProfecionPos(){ return this.profecion_pro; }
    public String getSaludPos(){ return this.salud_pro; }
    public String getNomPos(String nom_pro){ return this.nom_pro; }
    public String getPlaca(){ return this.placa; }
}
