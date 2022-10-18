package tarea_2;

public class Comprador {

    Moneda m;
    Expendedor exp;
    int numBebida, vuelto;

    public Comprador(Moneda m, Expendedor exp, int numBebida) {
        this.m = m;
        this.exp = exp;
        this.numBebida = numBebida;
        this.vuelto = 0;
    }
}
