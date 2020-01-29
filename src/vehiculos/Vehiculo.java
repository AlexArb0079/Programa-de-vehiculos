package vehiculos;

public class Vehiculo {

	protected String marca;
	protected String modelo;
	protected int nroDeRuedas;
	protected String color;
	protected int anoDeFabricacion;
	protected int velocidad;
	
	public Vehiculo(String marca, String modelo, int NroDeRuedas, String Color, int AnoDeFabricacion) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setNroDeRuedas(NroDeRuedas);
		this.setColor(Color);
		this.setAnoDeFabricacion(AnoDeFabricacion);
		
		setVelocidad(0);
	}	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNroDeRuedas() {
		return nroDeRuedas;
	}

	public void setNroDeRuedas(int nroDeRuedas) {
		this.nroDeRuedas = nroDeRuedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnoDeFabricacion() {
		return anoDeFabricacion;
	}

	public void setAnoDeFabricacion(int anoDeFabricacion) {
		this.anoDeFabricacion = anoDeFabricacion;
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void acelerar() {
		this.setVelocidad(this.getVelocidad() + 50);
	}
	
	public void frenar() {
		this.setVelocidad(this.getVelocidad() - 20);
	}
	
	public String showVehiculo() {
		return "Marca: " + this.marca + 
				"\nModelo: " + this.modelo + 
				"\nNumero de ruedas: " + this.nroDeRuedas + 
				"\nColor: " + this.color + 
				"\nAño de fabricacion: " + this.anoDeFabricacion;
	}
	
}
