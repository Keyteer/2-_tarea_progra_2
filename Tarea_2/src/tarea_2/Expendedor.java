package tarea_2;
import java.util.ArrayList;

public class Expendedor {

    private ArrayList<Bebida>[] depBebida;
    private int numBebidas;
    private int precioBebidas;
    private int depositoMonedas;

    public Expendedor(int cantidadPorDep, int precio) {
        depBebida = new ArrayList[3];
        numBebidas = 3*cantidadPorDep;
        for (int i = 0; i < 3; i++) {
            depBebida[i] = new ArrayList<Bebida>();
            for(int j=0;j<cantidadPorDep;j++){
                if(i==0){
                    depBebida[i].add(new CanadaDry(j+1));
                }else if(i==1){
                    depBebida[i].add(new Pap(j+1));
                }else if(i==2){
                    depBebida[i].add(new CocaCola(j+1));
                }
            }
        }
        precioBebidas = precio;
    }

    /*public int[] getdepBebida() {
        return depBebida;
    }*/

    public int getPrecioBebidas() {
        return precioBebidas;
    }
    public Bebida getBebida(){
        return depBebida[1].remove(1);
    }

    public Bebida comprarBebida(Moneda moneda,int numBebidas,int n) {
        
        if(moneda.getValor()>this.precioBebidas){
            if(n==1){
                depositoMonedas = moneda.getValor() - precio ;
                return depBebidas[0].remove();
            }else if(n==2){
                depositoMonedas = moneda.getValor() - precio ;
                return depBebidas[0].remove();
            }else if(n==3){
                depositoMonedas = moneda.getValor() - precio ;
                return depBebidas[0].remove();
            }
        }else if(moneda.getValor()>this.precioBebidas){
            
        }
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
