/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ivnn
 */
public class Equipo {
    
    private String nombre, confederacion;
    private int cantidadTitulos,posicionFifa;
    private boolean debutante;

    public Equipo() {
    }

    public Equipo(String nombre, String confederacion, int cantidadTitulos, int posicionFifa, boolean debutante) {
        this.nombre = nombre;
        this.confederacion = confederacion;
        this.cantidadTitulos = cantidadTitulos;
        this.posicionFifa = posicionFifa;
        this.debutante = debutante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public int getCantidadTitulos() {
        return cantidadTitulos;
    }

    public void setCantidadTitulos(int cantidadTitulos) {
        this.cantidadTitulos = cantidadTitulos;
    }

    public int getPosicionFifa() {
        return posicionFifa;
    }

    public void setPosicionFifa(int posicionFifa) {
        this.posicionFifa = posicionFifa;
    }

    public boolean isDebutante() {
        return debutante;
    }

    public void setDebutante(boolean debutante) {
        this.debutante = debutante;
    }

    

   
    
    
    
    
}
