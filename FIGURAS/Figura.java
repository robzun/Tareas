package FIGURAS;

// Escribe clase abstracta figura
// o Miembros de datos: número de lados
// o Constructor: inicializar número de lados
// o Método concreto: método obtener (get) para número de lados
// o Métodos abstractos: obtener área y obtener perímetro 

public abstract class Figura {
    private int numLados;

public Figura(int numLados){
    this.numLados = numLados;
}

public int getNumLados() {
    return numLados;
}

public abstract float getArea();

public abstract float getPerimetro();
}