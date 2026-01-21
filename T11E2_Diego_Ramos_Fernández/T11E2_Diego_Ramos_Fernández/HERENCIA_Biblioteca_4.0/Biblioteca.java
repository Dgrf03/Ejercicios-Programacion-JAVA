import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        this.prestamos = new ArrayList<>();
    }

    public void añadirPrestamo(Prestamo p) {
        this.prestamos.add(p);
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public ArrayList<Prestamo> getPrestamosDeUsuario(Usuario u) {
        ArrayList<Prestamo> res = new ArrayList<>();
        for (Prestamo p : prestamos) {
            if (p.getU().equals(u)) {
                res.add(p);
            }
        }
        return res;
    }

    public ArrayList<Prestamo> getPrestamosDeTrabajador(Trabajador t) {
        ArrayList<Prestamo> res = new ArrayList<>();
        for (Prestamo p : prestamos) {
            if (p.getT() != null && p.getT().equals(t)) {
                res.add(p);
            }
        }
        return res;
    }
}
