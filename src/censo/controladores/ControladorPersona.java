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
                preparedStatement = con.prepareStatement("SELECT * FROM public.persona WHERE n_censo = ?;");
                preparedStatement.setLong(1, MP.getIdPersona());
                
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    try{
                        MP.setApellido1(resultSet.getString("apellido1"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setApellido2(resultSet.getString("apellido2"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setCiudad(resultSet.getString("ciudad"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setDireccion(resultSet.getString("direccion"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEscolaridad(resultSet.getString("escolaridad"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEstadoCivil(resultSet.getString("estado_civil"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setEstratoPro(resultSet.getInt("estrato"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setLicencia(resultSet.getString("licencia"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNacimiento(resultSet.getString("nacimiento"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNombre(resultSet.getString("nombre"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setPersonasCargo(resultSet.getInt("personas_a_cargo"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setPlaca(resultSet.getString("placa"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setProfecion(resultSet.getString("profecion"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setSalud(resultSet.getString("salud"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setSexo(resultSet.getString("sexo"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setTipoDocumento(resultSet.getString("tipo_documento"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setIdPersona(resultSet.getLong("n_censo"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNumeroDeHijos(resultSet.getInt("numero_de_hijos"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setNumeroDeDocumento(resultSet.getLong("numero_de_documento"));
                    }catch(NullPointerException e){
                        
                    }
                    try{
                        MP.setTipoDePersona(resultSet.getInt("tipo_persona"));
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
        if(consulta.equals("SelectId")){
            try{
                preparedStatement = con.prepareStatement("SELECT id_persona FROM public.persona WHERE n_censo = ? AND numero_de_documento = ?;");
                preparedStatement.setLong(1, MP.getNCenso());
                preparedStatement.setLong(2, MP.getNumeroDeDocumento());
                
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    try{
                        MP.setIdPersona(resultSet.getLong("id_persona"));
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
                preparedStatement = con.prepareStatement("INSERT INTO public.persona(n_censo, numero_de_documento, apellido1, apellido2, nombre, tipo_documento, tipo_persona) VALUES (?, ?, ?, ?, ?, ?, ?);");
                preparedStatement.setLong(1, MP.getNCenso());
                preparedStatement.setLong(2, MP.getNumeroDeDocumento());
                preparedStatement.setString(3, MP.getApellido1());
                preparedStatement.setString(4, MP.getApellido2());
                preparedStatement.setString(5, MP.getNom());
                preparedStatement.setString(6, MP.getTipoDocumento());
                preparedStatement.setInt(7, MP.getTipoDePersona());
                
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
                        "UPDATE public.persona " +
                            "SET numero_de_documento=?, apellido1=?, apellido2=?, direccion=?, estrato=?, " +
                                "ciudad=?, licencia=?, sexo=?, nacimiento=?, personas_a_cargo=?, " +
                                "numero_de_hijos=?, estado_civil=?, escolaridad=?, profecion=?, " +
                                "salud=?, nombre=?, placa=?, n_censo=?, tipo_documento=? " +
                            "WHERE n_censo = ? AND tipo_persona = ?;"
                    );
                    preparedStatement.setLong(20, MP.getNCenso());
                }else{
                    preparedStatement = con.prepareStatement(
                        "INSERT INTO public.persona(" +
                            "numero_de_documento, apellido1, apellido2, direccion, estrato, ciudad, " +
                            "licencia, sexo, nacimiento, personas_a_cargo, numero_de_hijos, " +
                            "estado_civil, escolaridad, profecion, salud, nombre, " +
                            "placa, n_censo, tipo_documento, tipo_persona) " +
                        "VALUES (?, ?, ?, ?, ?, ?, " +
                            "?, ?, ?, ?, ?, " +
                            "?, ?, ?, ?, ?, " +
                            "?, ?, ?, ?);"
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
                if(MP.getNCenso() != 0){
                    preparedStatement.setLong(18, MP.getNCenso());
                }else{
                    preparedStatement.setNull(18, java.sql.Types.BIGINT);
                }
                if(!MP.getTipoDocumento().equals("")){
                    preparedStatement.setString(19, MP.getTipoDocumento());
                }else{
                    preparedStatement.setNull(19, java.sql.Types.VARCHAR);
                }
                if(MP.getTipoDePersona() != 0){
                    preparedStatement.setInt(20, MP.getTipoDePersona());
                }else{
                    preparedStatement.setNull(20, java.sql.Types.INTEGER);
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
