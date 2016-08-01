/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloPoseedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorPoseedor {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloPoseedor MP = null;
    
    public ControladorPoseedor(ModeloPoseedor MP){
        this.MP = MP;
        
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public ModeloPoseedor Select(String consulta){
        if(consulta.equals("SelectForId")){
            try{
                preparedStatement = con.prepareStatement("SELECT * FROM public.poseedores WHERE id_poseedor = ?;");
                preparedStatement.setLong(1, MP.getIdPoseedor());
                
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    try{
                        MP.setApe1Pos(resultSet.getString("ape1_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setApe2Pos(resultSet.getString("ape2_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setCiudadPos(resultSet.getString("ciudad_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setDirPos(resultSet.getString("dir_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEscolaridadPos(resultSet.getString("escolaridad_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEstadoCivil(resultSet.getString("estado_civil"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEstratoPos(resultSet.getInt("estrato_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setLicencia(resultSet.getString("licencia"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNacimientoPos(resultSet.getString("nacimiento_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNomPos(resultSet.getString("nom_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setPersonasCargo(resultSet.getInt("personas_cargo"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setPlaca(resultSet.getString("placa"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setProfecionPos(resultSet.getString("profecion_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setSaludPos(resultSet.getString("salud_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setSexoPos(resultSet.getString("sexo_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setTipoDocumento(resultSet.getString("tipo_documento"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setIdPoseedor(resultSet.getLong("id_propietario"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNHijos(resultSet.getInt("n_hijos"));
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
                
                return MP;
            }catch(SQLException e){
                System.err.println("error en SelectForId");
            }
            
        }
        return null;
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("InsertInicial")){
            try{
                preparedStatement = con.prepareStatement("INSERT INTO public.poseedores(tipo_id, ape1_pos, ape2_pos, nom_pos, tipo_documento) VALUES (?, ?, ?, ?, ?);");
                preparedStatement.setLong(1, MP.getTipoId());
                preparedStatement.setString(2, MP.getApe1Pos());
                preparedStatement.setString(3, MP.getApe2Pos());
                preparedStatement.setString(4, MP.getNomPos());
                preparedStatement.setString(5, MP.getTipoDocumento());
                
                int r = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                return r;
            }catch(SQLException e){
                System.err.println("error");
            }
            
        }
        if(consulta.equals("Insert")){
            try{
                preparedStatement = con.prepareStatement(
                    "INSERT INTO public.poseedores(" +
                            "tipo_id, ape1_pos, ape2_pos, dir_pos, estrato_pos, ciudad_pos, " +
                            "licencia, sexo_pos, nacimiento_pos, personas_cargo, n_hijos, " +
                            "estado_civil, escolaridad_pos, profecion_pos, salud_pos, nom_pos, " +
                            "placa, id_poseedor, tipo_documento) " +
                        "VALUES (?, ?, ?, ?, ?, ?, " +
                            "?, ?, ?, ?, ?, " +
                            "?, ?, ?, ?, ?, " +
                            "?, ?, ?);"
                );
                if(MP.getTipoId() != 0){
                    preparedStatement.setLong(1, MP.getTipoId());
                }else{
                    preparedStatement.setNull(1, java.sql.Types.BIGINT);
                }
                if(!MP.getApe1Pos().equals("")){
                    preparedStatement.setString(2, MP.getApe1Pos());
                }else{
                    preparedStatement.setNull(2, java.sql.Types.VARCHAR);
                }
                if(!MP.getApe2Pos().equals("")){
                    preparedStatement.setString(3, MP.getApe2Pos());
                }else{
                    preparedStatement.setNull(3, java.sql.Types.VARCHAR);
                }
                if(!MP.getDirPos().equals("")){
                    preparedStatement.setString(4, MP.getDirPos());
                }else{
                    preparedStatement.setNull(4, java.sql.Types.VARCHAR);
                }
                if(MP.getEstratoPos() != 0){
                    preparedStatement.setInt(5, MP.getEstratoPos());
                }else{
                    preparedStatement.setNull(5, java.sql.Types.INTEGER);
                }
                if(!MP.getCiudadPos().equals("")){
                    preparedStatement.setString(6, MP.getCiudadPos());
                }else{
                    preparedStatement.setNull(6, java.sql.Types.VARCHAR);
                }
                if(!MP.getLicencia().equals("")){
                    preparedStatement.setString(7, MP.getLicencia());
                }else{
                    preparedStatement.setNull(7, java.sql.Types.VARCHAR);
                }
                if(!MP.getSexoPos().equals("")){
                    preparedStatement.setString(8, MP.getSexoPos());
                }else{
                    preparedStatement.setNull(8, java.sql.Types.VARCHAR);
                }
                if(!MP.getNacimientoPos().equals("")){
                    preparedStatement.setString(9, MP.getNacimientoPos());
                }else{
                    preparedStatement.setNull(9, java.sql.Types.VARCHAR);
                }
                if(MP.getPersonasCargo()!= 0){
                    preparedStatement.setInt(10, MP.getPersonasCargo());
                }else{
                    preparedStatement.setNull(10, java.sql.Types.INTEGER);
                }
                if(MP.getNHijos() != 0){
                    preparedStatement.setInt(11, MP.getNHijos());
                }else{
                    preparedStatement.setNull(11, java.sql.Types.INTEGER);
                }
                if(!MP.getEstadoCivil().equals("")){
                    preparedStatement.setString(12, MP.getEstadoCivil());
                }else{
                    preparedStatement.setNull(12, java.sql.Types.VARCHAR);
                }
                if(!MP.getEscolaridadPos().equals("")){
                    preparedStatement.setString(13, MP.getEscolaridadPos());
                }else{
                    preparedStatement.setNull(13, java.sql.Types.VARCHAR);
                }
                if(!MP.getProfecionPos().equals("")){
                    preparedStatement.setString(14, MP.getProfecionPos());
                }else{
                    preparedStatement.setNull(14, java.sql.Types.VARCHAR);
                }
                if(!MP.getSaludPos().equals("")){
                    preparedStatement.setString(15, MP.getSaludPos());
                }else{
                    preparedStatement.setNull(15, java.sql.Types.VARCHAR);
                }
                if(!MP.getNomPos().equals("")){
                    preparedStatement.setString(16, MP.getNomPos());
                }else{
                    preparedStatement.setNull(16, java.sql.Types.VARCHAR);
                }
                if(!MP.getPlaca().equals("")){
                    preparedStatement.setString(17, MP.getPlaca());
                }else{
                    preparedStatement.setNull(17, java.sql.Types.VARCHAR);
                }
                if(MP.getIdPoseedor() != 0){
                    preparedStatement.setLong(18, MP.getIdPoseedor());
                }else{
                    preparedStatement.setNull(18, java.sql.Types.BIGINT);
                }
                if(!MP.getTipoDocumento().equals("")){
                    preparedStatement.setString(19, MP.getTipoDocumento());
                }else{
                    preparedStatement.setNull(19, java.sql.Types.VARCHAR);
                }
                
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
