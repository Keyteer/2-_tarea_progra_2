package tarea_2;

public class Comprador {

    private Moneda m;
    private Expendedor exp;
    private int numBebida, vuelto;
    private String sabor;

    public Comprador(Moneda m, Expendedor exp, int numBebida) {
        this.m = m;
        this.exp = exp;
        this.numBebida = numBebida;
        vuelto = 0;
        sabor = "";
    }

    /*public void comprar(){
        this.beber(exp.comprarBebida(m,numBebida));
        
        while (m != null){
            m = exp.getVuelto();
            vuelto += m.getValor();
        }
    }*/
    
    public void beber(Bebida b){
        sabor = b.tomarBebida();
    }
}
