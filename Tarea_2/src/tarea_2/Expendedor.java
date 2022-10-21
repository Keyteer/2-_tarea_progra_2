package tarea_2;

public class Expendedor {

    private int[] numBebidas;
    private int precioBebidas;
    private int depositoMonedas;

    public Expendedor(int cantidadPorDep, int precio) {
        numBebidas = new int[3];
        for (int i = 0; i < numBebidas.length; i++) {
            numBebidas[i] = cantidadPorDep;
        }
        precioBebidas = precio;
    }

    public int[] getNumBebidas() {
        return numBebidas;
    }

    public int getPrecioBebidas() {
        return precioBebidas;
    }

    public Bebida comprarBebida(Moneda moneda,int numBebida) {

    }

    public Moneda getVuelto() {
        if(depositoMonedas >= 100){
            depositoMonedas -= 100;
            return new Moneda100();
        }else{
            return null;
        }
    }
}
