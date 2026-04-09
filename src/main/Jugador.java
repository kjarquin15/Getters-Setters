package main;

public class Jugador {
	  private String nombre;
	    private int puntajeActual;
	    private int puntajeMaximo;

	    public void setNombre(String nombre) { this.nombre = nombre; }

	    public void setPuntajeActual(int puntaje) {
	        if (puntaje >= 0) {
	            this.puntajeActual = puntaje;
	        }
	    }

	    public void actualizarPuntaje(int nuevoPuntaje) {
	        if (nuevoPuntaje >= 0) {
	            puntajeActual = nuevoPuntaje;
	            if (nuevoPuntaje > puntajeMaximo) {
	                puntajeMaximo = nuevoPuntaje;
	            }
	        }
	    }
}
