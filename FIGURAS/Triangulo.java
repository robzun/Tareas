package FIGURAS;

// Escribe una subclase concreta Triangulo
// o Miembros de datos: anchura, altura 

public class Triangulo extends Figura{
    private int alto;
    private int ancho;

public Triangulo(int numLados, int alto, int ancho){
    super(numLados);
    this.alto = alto;
    this.ancho = ancho;
}

@Override
public float getArea(){
    return (alto*ancho) / 2;
}

@Override
public float getPerimetro(){
    return (ancho * 3);
}
}
