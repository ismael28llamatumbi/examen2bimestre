/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author wssa8
 */
public class Conexion {

    Connection conex = null;

    public Connection conexion() {
        String url = "jdbc:mysql://localhost:3306/bimal?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC ";
        String user = "root";
        String passwd = "root";
        try {
            conex = DriverManager.getConnection(url, user, passwd);
            //System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conex;
    }
}