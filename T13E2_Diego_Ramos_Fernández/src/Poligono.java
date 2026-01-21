import java.util.Arrays;

public class Poligono {

    // Máximo número de lados permitido
    public final int MAX_LADOS = 15;

    protected Punto[] puntos;
    protected int numLados;

    public Poligono() {
        this.numLados = 0;
        this.puntos = new Punto[numLados];
    }

    public Poligono(int n) {
        this.numLados = n;
        this.puntos = new Punto[n];
    }

    public Poligono(int n, Punto[] p) {
        this.numLados = n;
        this.puntos = new Punto[n];
        for (int i = 0; i < n; i++) {
            this.puntos[i] = new Punto(p[i]);
        }
    }

    public Poligono(Poligono p) {
        this.numLados = p.numLados;
        this.puntos = new Punto[p.numLados];
        for (int i = 0; i < p.numLados; i++) {
            this.puntos[i] = new Punto(p.puntos[i]);
        }
    }

    public int getNumLados() {
        return numLados;
    }

    public Punto[] getPuntos() {
        return puntos;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public void setPuntos(Punto[] puntos) {
        this.puntos = puntos;
        this.numLados = puntos.length;
    }

    @Override
    public String toString() {
        String salida = getClass().getSimpleName() + " de " + this.numLados + " lados.\n";
        for (int i = 0; i < this.numLados; i++) {
            salida += "Punto " + (i + 1) + ": " + this.puntos[i].toString() + "\n";
        }
        return salida;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        Poligono p = (Poligono) obj;
        return this.numLados == p.numLados && Arrays.equals(this.puntos, p.puntos);
    }
}
