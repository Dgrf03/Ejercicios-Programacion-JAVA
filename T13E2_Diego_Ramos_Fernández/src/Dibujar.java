public interface Dibujar {

    // Simula dibujar una línea recta entre dos puntos
    void lineaRecta(Punto p1, Punto p2);

    // Simula dibujar una línea curva entre dos puntos usando un punto de control
    void lineaCurva(Punto p1, Punto p2, Punto control);
}
