public class Triangulo extends Poligono implements Dibujable, Calculable {

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        super(3, new Punto[]{p1, p2, p3});
    }

    // Distancia euclídea entre dos puntos
    private double distanciaEuclidea(Punto a, Punto b) {
        int dx = a.getX() - b.getX();
        int dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public double calcularArea() {
        double a = distanciaEuclidea(puntos[0], puntos[1]);
        double b = distanciaEuclidea(puntos[1], puntos[2]);
        double c = distanciaEuclidea(puntos[2], puntos[0]);
        double s = (a + b + c) / 2.0;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calcularPerimetro() {
        double per = 0;
        for (int i = 0; i < numLados; i++) {
            per += distanciaEuclidea(puntos[i], puntos[(i + 1) % numLados]);
        }
        return per;
    }

    @Override
    public void lineaRecta(Punto p1, Punto p2) {
        System.out.println("Línea recta de " + p1 + " a " + p2);
    }

    @Override
    public void lineaCurva(Punto p1, Punto p2, Punto control) {
        System.out.println("Línea curva de " + p1 + " a " + p2 + " con control " + control);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Triángulo:");
        for (int i = 0; i < numLados; i++) {
            lineaRecta(puntos[i], puntos[(i + 1) % numLados]);
        }
    }
}
