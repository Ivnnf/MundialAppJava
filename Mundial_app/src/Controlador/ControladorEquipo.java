/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Equipo;
import bd.Conexion;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Ivnn
 */
public class ControladorEquipo {
    
    public boolean agregarEquipo (Equipo equipo)
    {
        try {
            
            Conexion con = new Conexion ();
            Connection cnt = con.obtenerConexion();
            
            String consulta = "INSERT INTO equipo (nombre,confederacion,titulos_mundiales,posicion_fifa,debutante) VALUES(?,?,?,?,?)";
            
            PreparedStatement ps = cnt.prepareStatement(consulta);
            
            ps.setString(1, equipo.getNombre());
            ps.setString(2, equipo.getConfederacion());
            ps.setInt(3, equipo.getCantidadTitulos());
            ps.setInt(4, equipo.getPosicionFifa());
            ps.setBoolean(5, equipo.isDebutante());
           
            
            
            ps.executeUpdate(); //actualiza los datos de la tabla
            ps.close();
            cnt.close();
            
            return true;
            
            
        } catch (SQLException e) {
            
            System.out.println("Error bd: "+e.getMessage());
            return false;
     }
    
    }
    
    
    
    public ArrayList<Equipo> traerTodo()
    {
    
        ArrayList<Equipo> equipo = new ArrayList<>();
        
         Conexion con = new Conexion();
        Connection cnx = con.obtenerConexion();
        
        String consulta = "SELECT nombre,confederacion,titulos_mundiales,posicion_fifa,debutante FROM equipo";
        
        try {
             PreparedStatement ps = cnx.prepareStatement(consulta);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next())
             {
             
                 Equipo l = new Equipo();
                 
                 l.setNombre(rs.getString("nombre"));
                 l.setConfederacion(rs.getString("confederacion"));
                 l.setCantidadTitulos(rs.getInt("titulos_mundiales"));
                 l.setPosicionFifa(rs.getInt("posicion_fifa"));
                 l.setDebutante(rs.getBoolean("debutante"));
  
                 equipo.add(l); //AGREGAR EL LIBRO A LA COLECCION.
               
             }
             rs.close();
             ps.close();
             cnx.close();
             
        } catch (Exception ex) {
            System.out.println("ERROR SQL"+ex.getMessage());
            
        }
        
    return equipo;
    
    
    }
}
