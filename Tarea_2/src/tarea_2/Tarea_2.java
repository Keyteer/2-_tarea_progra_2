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
        
        Expendedor exp = new Expendedor(3, 600);

        Moneda m1 = new Moneda100();
        Moneda m5 = new Moneda500();
        Moneda m10 = new Moneda1000();
        Moneda m15 = new Moneda1500();

        Comprador c1 = new Comprador(m1, exp, 1);
        Comprador c2 = new Comprador(m5, exp, 2);
        Comprador c3 = new Comprador(m10, exp, 3);
        Comprador c4 = new Comprador(m15, exp, 4);

        c1.comprar();
        c2.comprar();
        c3.comprar();
        c4.comprar();

        System.out.println("sabor c1:" + c1.getSabor() + "vuelto c1:" + c1.getVuelto());
        System.out.println("sabor c2:" + c2.getSabor() + "vuelto c2:" + c2.getVuelto());
        System.out.println("sabor c3:" + c3.getSabor() + "vuelto c3:" + c3.getVuelto());
        System.out.println("sabor c4:" + c4.getSabor() + "vuelto c4:" + c4.getVuelto());
    }
    
}
