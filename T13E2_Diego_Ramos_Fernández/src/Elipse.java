public class Elipse extends Poligono implements Dibujable, Calculable {

    private double radioMayor;
    private double radioMenor;

    public Elipse(Punto centro1, Punto centro2, double radioMayor, double radioMenor) {
        super(2, new Punto[]{centro1, centro2});
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public Punto getCentro1() {
        return puntos[0];
    }

    public void setCentro1(Punto centro1) {
        puntos[0] = centro1;
    }

    public Punto getCentro2() {
        return puntos[1];
    }

    public void setCentro2(Punto centro2) {
        puntos[1] = centro2;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }

    @Override
    public double calcularPerimetro() {
        double a = radioMayor;
        double b = radioMenor;
        double h = Math.pow(a - b, 2) / Math.pow(a + b, 2);
        return Math.PI * (a + b) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
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
        System.out.println("Dibujando Elipse entre centros " + getCentro1() + " y " + getCentro2() + " con radios " + radioMayor + " y " + radioMenor);
        lineaCurva(getCentro1(), getCentro2(), getCentro1());
    }

    @Override
    public String toString() {
        return "Elipse centros=" + getCentro1() + ", " + getCentro2() + " radioMayor=" + radioMayor + " radioMenor=" + radioMenor;
    }
}
