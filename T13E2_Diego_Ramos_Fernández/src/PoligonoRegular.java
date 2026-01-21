public class PoligonoRegular extends Poligono implements Dibujable, Calculable {

    private double longitudLado;

    public PoligonoRegular(Punto[] vertices, double longitudLado) {
        super(vertices.length, vertices);
        this.longitudLado = longitudLado;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    @Override
    public double calcularArea() {
        int n = numLados;
        return (n * longitudLado * longitudLado) / (4 * Math.tan(Math.PI / n));
    }

    @Override
    public double calcularPerimetro() {
        return numLados * longitudLado;
    }

    @Override
    public void lineaRecta(Punto p1, Punto p2) {
        System.out.println("Línea recta de " + p1 + " a " + p2);
    }

    @Override
    public void lineaCurva(Punto p1, Punto p2, Punto control) {
        System.out.println("Línea curva de " + p1 + " a " + p2 +" con control " + control);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Polígono Regular:");
        for (int i = 0; i < numLados; i++) {
            lineaRecta(puntos[i], puntos[(i + 1) % numLados]);
        }
    }
}
