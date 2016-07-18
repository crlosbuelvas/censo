/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

/**
 *
 * @author Admin
 */

import java.sql.*;

public class Conexion {
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public Conexion() {
        try {
        
        } catch (Exception e) {
            
        } finally {
        }

    }
}
