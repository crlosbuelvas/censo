/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloPropietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorPropietario {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloPropietario MP = null;
    
    public ControladorPropietario(ModeloPropietario MP){
        this.MP = MP;
        
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public ModeloPropietario Select(String consulta){
        if(consulta.equals("SelectForId")){
            try{
                preparedStatement = con.prepareStatement("SELECT * FROM public.propietarios WHERE id_propietario = ?;");
                preparedStatement.setLong(1, MP.getIdPropietario());
                
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    try{
                        MP.setApe1Pro(resultSet.getString("ape1_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setApe2Pro(resultSet.getString("ape2_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setCiudadPro(resultSet.getString("ciudad_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setDirPro(resultSet.getString("dir_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEscolaridadPro(resultSet.getString("escolaridad_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEstadoCivil(resultSet.getString("estado_civil"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEstratoPro(resultSet.getString("estrato_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setLicencia(resultSet.getString("licencia"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNacimientoPro(resultSet.getString("nacimiento_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNomPro(resultSet.getString("nom_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setPersonasCargo(resultSet.getString("personas_cargo"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setPlaca(resultSet.getString("placa"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setProfecionPro(resultSet.getString("profecion_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setSaludPro(resultSet.getString("salud_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setSexoPro(resultSet.getString("sexo_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setTipoDocumento(resultSet.getString("tipo_documento"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setIdPropietario(resultSet.getLong("id_propietario"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNHijos(resultSet.getLong("n_hijos"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setTipoId(resultSet.getLong("tipo_id"));
                    }catch(NullPointerException e){
                        
                    }
                    
                    
                    resultSet.close();
                    preparedStatement.close();
                    con.close();

                    return MP;
                }
                
                return null;
            }catch(SQLException e){
                System.err.println("error en SelectForId");
            }
            
        }
        return null;
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("InsertInicial")){
            try{
                preparedStatement = con.prepareStatement("INSERT INTO public.propietarios(id_propietario, tipo_id, ape1_pro, ape2_pro, nom_pro, tipo_documento) VALUES (?, ?, ?, ?, ?, ?);");
                preparedStatement.setLong(1, MP.getIdPropietario());
                preparedStatement.setLong(2, MP.getTipoId());
                preparedStatement.setString(3, MP.getApe1Pro());
                preparedStatement.setString(4, MP.getApe2Pro());
                preparedStatement.setString(5, MP.getNomPro());
                preparedStatement.setString(6, MP.getTipoDocumento());
                
                int r = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                return r;
            }catch(SQLException e){
                System.err.println("error");
            }
            
        }
        return 3;
    }
}
