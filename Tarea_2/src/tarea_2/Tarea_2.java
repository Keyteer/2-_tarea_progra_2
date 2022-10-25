/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_2;

/**
 *
 * @author pepalacios2021
 */
public class Tarea_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5,100);
        
        Bebida b=exp.getBebida();
        System.out.println(b.tomarBebida());
    }
    
}
