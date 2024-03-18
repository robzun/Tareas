package FIGURAS;

// Escribe una subclase concreta Rectángulo
// o Miembros de datos: anchura, altura
// Implementar que sea redimensionable (herede de la interfaz redimencionar) 

public class Rectangulo extends Figura implements Redimensionar {
    private int alto;
    private int ancho;

public Rectangulo(int numLados, int alto, int ancho){
    super(numLados);
    this.alto = alto;
    this.ancho = ancho;
}

@Override
public float getArea(){
    return (ancho*alto);
}

@Override
public float getPerimetro(){
    return ((ancho*2) + (alto*2));
}

@Override
public void redimensionar(int factor) {
    alto = (alto * factor);
    ancho = (ancho * factor);
}

public String toStringAreaPerimetro(){
    return "Área: " + getArea() + "\n" + "Perímetro: " + getPerimetro();
}
}