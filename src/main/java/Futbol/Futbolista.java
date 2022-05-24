package futbol;

public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    public Futbolista(String nombre, int edad, String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String toString() {
        return "El futbolista " +nombre + " tiene " +edad  + ", y"
            + " juega de " +posicion;
    }

    public boolean equals(Futbolista f) {
        return f ==this;
    }

    public abstract boolean jugarConLasManos();

    
    public String getNombre() { 
    	return this.nombre; 
    	}
    public String getPosicion() { 
    	return this.posicion; 
    	}
    public int getEdad() { 
    	return this.edad; 
    	}

    public void setNombre(String nombre ){
    	this.nombre = nombre; 
    	}
    public void setPosicion(String posicion) {
    	this.posicion = posicion; 
    	}
    public void setEdad(int edad) { 
    	this.edad = edad; 
    	}
}