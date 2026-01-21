public class Rectangulo extends Poligono implements Dibujable, Calculable {

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(4, new Punto[]{p1, p2, p3, p4});
    }

    private double distanciaEuclidea(Punto a, Punto b) {
        int dx = a.getX() - b.getX();
        int dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public double calcularArea() {
        double base = distanciaEuclidea(puntos[0], puntos[1]);
        double altura = distanciaEuclidea(puntos[1], puntos[2]);
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        double base = distanciaEuclidea(puntos[0], puntos[1]);
        double altura = distanciaEuclidea(puntos[1], puntos[2]);
        return 2 * (base + altura);
    }

    @Override
    public void lineaRecta(Punto p1, Punto p2) {
        System.out.println("Línea recta de " + p1 + " a " + p2);
    }

    @Override
    public void lineaCurva(Punto p1, Punto p2, Punto control) {
        System.out.println("Línea curva de " + p1 + " a " + p2 +
                " con control " + control);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Rectángulo:");
        for (int i = 0; i < numLados; i++) {
            lineaRecta(puntos[i], puntos[(i + 1) % numLados]);
        }
    }
}
