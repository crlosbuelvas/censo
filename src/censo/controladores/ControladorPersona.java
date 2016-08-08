/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloPersona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorPersona {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloPersona MP = null;
    
    public ControladorPersona(ModeloPersona MP){
        this.MP = MP;
        
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public ModeloPersona Select(String consulta){
        if(consulta.equals("SelectForId")){
            try{
                preparedStatement = con.prepareStatement("SELECT * FROM public.propietarios WHERE id_propietario = ?;");
                preparedStatement.setLong(1, MP.getIdPersona());
                
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    try{
                        MP.setApellido1(resultSet.getString("ape1_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setApellido2(resultSet.getString("ape2_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setCiudad(resultSet.getString("ciudad_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setDireccion(resultSet.getString("dir_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEscolaridad(resultSet.getString("escolaridad_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEstadoCivil(resultSet.getString("estado_civil"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEstratoPro(resultSet.getInt("estrato_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setLicencia(resultSet.getString("licencia"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNacimiento(resultSet.getString("nacimiento_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNombre(resultSet.getString("nom_pro"));
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
                        MP.setProfecion(resultSet.getString("profecion_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setSalud(resultSet.getString("salud_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setSexo(resultSet.getString("sexo_pro"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setTipoDocumento(resultSet.getString("tipo_documento"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setIdPersona(resultSet.getLong("id_propietario"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNumeroDeHijos(resultSet.getInt("n_hijos"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNumeroDeDocumento(resultSet.getLong("tipo_id"));
                    }catch(NullPointerException e){
                        
                    }
                    
                    
                    resultSet.close();
                    preparedStatement.close();
                    con.close();

                    return MP;
                }
                
                MP.setIdPersona(0);
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
                preparedStatement = con.prepareStatement("INSERT INTO public.propietarios(id_propietario, tipo_id, ape1_pro, ape2_pro, nom_pro, tipo_documento) VALUES (?, ?, ?, ?, ?, ?);");
                preparedStatement.setLong(1, MP.getIdPersona());
                preparedStatement.setLong(2, MP.getNumeroDeDocumento());
                preparedStatement.setString(3, MP.getApellido1());
                preparedStatement.setString(4, MP.getApellido2());
                preparedStatement.setString(5, MP.getNom());
                preparedStatement.setString(6, MP.getTipoDocumento());
                
                int r = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                return r;
            }catch(SQLException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            
        }
        if(consulta.equals("Actualizar") || consulta.equals("Insertar")){
            try{
                if(consulta.equals("Actualizar")){
                    preparedStatement = con.prepareStatement(
                        "UPDATE public.propietarios " +
                            "SET tipo_id=?, ape1_pro=?, ape2_pro=?, dir_pro=?, estrato_pro=?, " +
                                "ciudad_pro=?, licencia=?, sexo_pro=?, nacimiento_pro=?, personas_cargo=?, " +
                                "n_hijos=?, estado_civil=?, escolaridad_pro=?, profecion_pro=?, " +
                                "salud_pro=?, nom_pro=?, placa=?, id_propietario=?, tipo_documento=?" +
                            "WHERE id_propietario = ?;"
                    );
                    preparedStatement.setLong(20, MP.getIdPersona());
                }else{
                    preparedStatement = con.prepareStatement(
                        "INSERT INTO public.propietarios(" +
                            "tipo_id, ape1_pro, ape2_pro, dir_pro, estrato_pro, ciudad_pro, " +
                            "licencia, sexo_pro, nacimiento_pro, personas_cargo, n_hijos, " +
                            "estado_civil, escolaridad_pro, profecion_pro, salud_pro, nom_pro, " +
                            "placa, id_propietario, tipo_documento) " +
                        "VALUES (?, ?, ?, ?, ?, ?, " +
                            "?, ?, ?, ?, ?, " +
                            "?, ?, ?, ?, ?, " +
                            "?, ?, ?);"
                    );
                }
                if(MP.getNumeroDeDocumento() != 0){
                    preparedStatement.setLong(1, MP.getNumeroDeDocumento());
                }else{
                    preparedStatement.setNull(1, java.sql.Types.BIGINT);
                }
                if(!MP.getApellido1().equals("")){
                    preparedStatement.setString(2, MP.getApellido1());
                }else{
                    preparedStatement.setNull(2, java.sql.Types.VARCHAR);
                }
                if(!MP.getApellido2().equals("")){
                    preparedStatement.setString(3, MP.getApellido2());
                }else{
                    preparedStatement.setNull(3, java.sql.Types.VARCHAR);
                }
                if(!MP.getDireccion().equals("")){
                    preparedStatement.setString(4, MP.getDireccion());
                }else{
                    preparedStatement.setNull(4, java.sql.Types.VARCHAR);
                }
                if(MP.getEstrato() != 0){
                    preparedStatement.setInt(5, MP.getEstrato());
                }else{
                    preparedStatement.setNull(5, java.sql.Types.INTEGER);
                }
                if(!MP.getCiudad().equals("")){
                    preparedStatement.setString(6, MP.getCiudad());
                }else{
                    preparedStatement.setNull(6, java.sql.Types.VARCHAR);
                }
                if(!MP.getLicencia().equals("")){
                    preparedStatement.setString(7, MP.getLicencia());
                }else{
                    preparedStatement.setNull(7, java.sql.Types.VARCHAR);
                }
                if(!MP.getSexo().equals("")){
                    preparedStatement.setString(8, MP.getSexo());
                }else{
                    preparedStatement.setNull(8, java.sql.Types.VARCHAR);
                }
                if(!MP.getNacimiento().equals("")){
                    preparedStatement.setString(9, MP.getNacimiento());
                }else{
                    preparedStatement.setNull(9, java.sql.Types.DATE);
                }
                if(MP.getPersonasCargo() != 0){
                    preparedStatement.setInt(10, MP.getPersonasCargo());
                }else{
                    preparedStatement.setNull(10, java.sql.Types.INTEGER);
                }
                if(MP.getNumeroHijos() != 0){
                    preparedStatement.setInt(11, MP.getNumeroHijos());
                }else{
                    preparedStatement.setNull(11, java.sql.Types.INTEGER);
                }
                if(!MP.getEstadoCivil().equals("")){
                    preparedStatement.setString(12, MP.getEstadoCivil());
                }else{
                    preparedStatement.setNull(12, java.sql.Types.VARCHAR);
                }
                if(!MP.getEscolaridad().equals("")){
                    preparedStatement.setString(13, MP.getEscolaridad());
                }else{
                    preparedStatement.setNull(13, java.sql.Types.VARCHAR);
                }
                if(!MP.getProfecion().equals("")){
                    preparedStatement.setString(14, MP.getProfecion());
                }else{
                    preparedStatement.setNull(14, java.sql.Types.VARCHAR);
                }
                if(!MP.getSalud().equals("")){
                    preparedStatement.setString(15, MP.getSalud());
                }else{
                    preparedStatement.setNull(15, java.sql.Types.VARCHAR);
                }
                if(!MP.getNom().equals("")){
                    preparedStatement.setString(16, MP.getNom());
                }else{
                    preparedStatement.setNull(16, java.sql.Types.VARCHAR);
                }
                if(!MP.getPlaca().equals("")){
                    preparedStatement.setString(17, MP.getPlaca());
                }else{
                    preparedStatement.setNull(17, java.sql.Types.VARCHAR);
                }
                if(MP.getIdPersona()!= 0){
                    preparedStatement.setLong(18, MP.getIdPersona());
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
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
            
        }
        return 3;
    }
}
