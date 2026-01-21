public class Circulo extends Poligono implements Dibujable, Calculable {

    private double radio;

    public Circulo(Punto centro, double radio) {
        super(1, new Punto[]{centro});
        this.radio = radio;
    }

    public Punto getCentro() {
        return puntos[0];
    }

    public void setCentro(Punto centro) {
        puntos[0] = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
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
        System.out.println("Dibujando Círculo en centro " + getCentro() + " con radio " + radio);
        lineaCurva(getCentro(), getCentro(), getCentro());
    }

    @Override
    public String toString() {
        return "Circulo centro=" + getCentro() + ", radio=" + radio;
    }
}
