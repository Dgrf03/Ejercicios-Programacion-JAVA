public class Main {

    public static void main(String[] args) {

        Poligono[] figuras = new Poligono[5];

        figuras[0] = new Triangulo(new Punto(0, 0), new Punto(3, 0), new Punto(0, 4)
        );

        figuras[1] = new Rectangulo(new Punto(0, 0), new Punto(4, 0), new Punto(4, 2), new Punto(0, 2)
        );

        figuras[2] = new Circulo(new Punto(1, 1), 5
        );

        figuras[3] = new Elipse(new Punto(0, 0), new Punto(2, 0), 4, 2
        );

        Punto[] verticesReg = {new Punto(0, 0), new Punto(2, 0), new Punto(3, 2), new Punto(2, 4), new Punto(0, 4), new Punto(-1, 2)
        };

        figuras[4] = new PoligonoRegular(verticesReg, 2);

        for (Poligono p : figuras) {
            System.out.println("---------------------------------");
            System.out.println(p.toString());

            if (p instanceof Calculable) {
                Calculable c = (Calculable) p;
                System.out.println("Área: " + c.calcularArea());
                System.out.println("Perímetro: " + c.calcularPerimetro());
            }

            if (p instanceof Dibujable) {
                Dibujable d = (Dibujable) p;
                d.dibujar();
            }
        }
    }
}
