package main;

public class Factura {
	 private String codigoFactura;
	    private String descripcion;
	    private int cantidad;
	    private double precioUnitario;

	    public void setCodigoFactura(String codigo) { this.codigoFactura = codigo; }
	    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	    public void setCantidad(int cantidad) {
	        if (cantidad > 0) this.cantidad = cantidad;
	    }

	    public void setPrecioUnitario(double precio) {
	        if (precio > 0) this.precioUnitario = precio;
	    }

	    public double calcularTotal() {
	        return cantidad * precioUnitario;
	    }

	    public void mostrarFactura() {
	        System.out.println("Código: " + codigoFactura);
	        System.out.println("Descripción: " + descripcion);
	        System.out.println("Cantidad: " + cantidad);
	        System.out.println("Precio Unitario: " + precioUnitario);
	        System.out.println("Total: " + calcularTotal());
	    }
}
