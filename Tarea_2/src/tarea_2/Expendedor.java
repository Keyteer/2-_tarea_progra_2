/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_2;

public class Expendedor {
    
    private int numBebidas;
    private int precioBebidas;
    
    public Expendedor(int cantidadPorDep,int precio){
        
        numBebidas = cantidadPorDep;
        precioBebidas = precio;
    }
    public int getNumBebidas(){
        return numBebidas;
    }
    public int getPrecioBebidas(){
        return precioBebidas;
    }
    public Bebida comprarBebida(Moneda moneda){
        
    }
}
