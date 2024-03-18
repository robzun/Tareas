package FIGURAS;

//En otra clase, escribe un método principal para definir un rectángulo y un triángulo.

// o Definir un rectángulo (ancho = 4, alto = 3)
// o Imprime el área y el perímetro del rectángulo
// o Cambiar el tamaño del rectángulo por un factor de 3
// o Vuelva a imprimir el área y el perímetro del rectángulo

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4, 7, 4);
        Triangulo triangulo1 = new Triangulo(3, 4, 3);

        Rectangulo rectangulo2 = new Rectangulo(4, 3, 4);
        System.out.println(rectangulo2.toStringAreaPerimetro());

        rectangulo2.redimensionar(3);
        System.out.println(rectangulo2.toStringAreaPerimetro());
    }
}
