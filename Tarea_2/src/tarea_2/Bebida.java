package tarea_2;

public abstract class Bebida {
    
    private int numSerie;
    
    public Bebida(int NumSerie){
        numSerie = NumSerie;
    }
    public abstract String tomarBebida();
    
}
