package futbol;
import java.lang.Math;

public class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public int compareTo(Object p) {
        return Math.abs(this.golesRecibidos - ((Portero) p).golesRecibidos);
    }

    public boolean jugarConLasManos() { return true;}
    
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal +
            ". Le han marcado " + golesRecibidos; 
    }
}