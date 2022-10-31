/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_2;

public class Tarea_2 {

    public static void main(String[] args) {
        
        Expendedor exp = new Expendedor(2, 200);

        Moneda m1 = new Moneda100();
        Moneda m5 = new Moneda500();
        Moneda m10 = new Moneda1000();
        Moneda m15 = new Moneda1500();

        Comprador c0 = new Comprador(m15, exp, 1);
        Comprador c1 = new Comprador(m10, exp, 3);
        Comprador c2 = new Comprador(m5, exp, 2);
        Comprador c3 = new Comprador(m15, exp, 2);
        Comprador c4 = new Comprador(m1, exp, 1);
        Comprador c5 = new Comprador(null, exp, 3);
        Comprador c6 = new Comprador(m5, exp, 2);
        Comprador c7 = new Comprador(m5, exp, 4);

        c0.comprar();
        System.out.println("sabor c0:" + c0.getSabor() + " vuelto c0:" + c0.getVuelto()+"\n");
        c1.comprar();
        System.out.println("sabor c1:" + c1.getSabor() + " vuelto c1:" + c1.getVuelto()+"\n");
        c2.comprar();
        System.out.println("sabor c2:" + c2.getSabor() + " vuelto c2:" + c2.getVuelto()+"\n");
        c3.comprar();
        System.out.println("sabor c3:" + c3.getSabor() + " vuelto c3:" + c3.getVuelto()+"\n");
        c4.comprar();
        System.out.println("sabor c4:" + c4.getSabor() + " vuelto c4:" + c4.getVuelto()+"\n");
        c5.comprar();
        System.out.println("sabor c5:" + c5.getSabor() + " vuelto c5:" + c5.getVuelto()+"\n");
        c6.comprar();
        System.out.println("sabor c6:" + c6.getSabor() + " vuelto c6:" + c6.getVuelto()+"\n");
        c7.comprar();
        System.out.println("sabor c7:" + c7.getSabor() + " vuelto c7:" + c7.getVuelto()+"\n");
    }
    
}
