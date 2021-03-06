package futbol;
import java.lang.Math;

public class Jugador extends Futbolista {

    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos() { return false; }

    public int compareTo(Object f) {
        return Math.abs(this.getEdad() - ((Futbolista) f).getEdad());
    }

    public String toString() {
        return super.toString() + " con el dorsal " + dorsal +
            ". Ha marcado " + golesMarcados; 
    }
}