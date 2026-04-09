package main;

public class Curso {
	 private String nombreCurso;
	    private double nota1, nota2, nota3;

	    public void setNombreCurso(String nombreCurso) {
	        this.nombreCurso = nombreCurso;
	    }

	    public void setNota1(double nota) {
	        if (nota >= 0 && nota <= 100) this.nota1 = nota;
	    }

	    public void setNota2(double nota) {
	        if (nota >= 0 && nota <= 100) this.nota2 = nota;
	    }

	    public void setNota3(double nota) {
	        if (nota >= 0 && nota <= 100) this.nota3 = nota;
	    }

	    public double promedio() {
	        return (nota1 + nota2 + nota3) / 3;
	    }

	    public String estado() {
	        return promedio() >= 61 ? "Aprobado" : "Reprobado";
	    }
}
