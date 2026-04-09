package main;

public class Contacto {
	 private String nombre;
	    private String telefono;
	    private String email;

	    public void setNombre(String nombre) { this.nombre = nombre; }

	    public void setTelefono(String telefono) {
	        if (telefono.length() == 8) {
	            this.telefono = telefono;
	        } else {
	            System.out.println("Teléfono inválido");
	        }
	    }

	    public void setEmail(String email) {
	        if (email.contains("@")) {
	            this.email = email;
	        } else {
	            System.out.println("Email inválido");
	        }
	    }

	    public void mostrarContacto() {
	        System.out.println(nombre + " - " + telefono + " - " + email);
	    }
}
