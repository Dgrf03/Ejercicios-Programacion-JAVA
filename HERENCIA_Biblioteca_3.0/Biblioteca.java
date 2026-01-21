public class Biblioteca {

    private Prestamo p1;
    private Prestamo p2;

    public Biblioteca() {
        this.p1 = null;
        this.p2 = null;
    }

    public void setPrestamo1(Prestamo p) {
        this.p1 = p;
    }

    public void setPrestamo2(Prestamo p) {
        this.p2 = p;
    }

    public Prestamo getPrestamo1() {
        return p1;
    }

    public Prestamo getPrestamo2() {
        return p2;
    }
}