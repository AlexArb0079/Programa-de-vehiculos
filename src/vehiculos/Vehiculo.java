package vehiculos;

public class Vehiculo {

	protected String marca;
	protected String modelo;
	protected int NroDeRuedas;
	protected String Color;
	protected int AnoDeFabricacion;
	protected int velocidad;
	
	public Vehiculo(String marca, String modelo, int NroDeRuedas, String Color, int AnoDeFabricacion) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setNroDeRuedas(NroDeRuedas);
		this.setColor(Color);
		this.setAnoDeFabricacion(AnoDeFabricacion);
		
		velocidad = 0;
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
		return NroDeRuedas;
	}

	public void setNroDeRuedas(int nroDeRuedas) {
		NroDeRuedas = nroDeRuedas;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getAnoDeFabricacion() {
		return AnoDeFabricacion;
	}

	public void setAnoDeFabricacion(int anoDeFabricacion) {
		AnoDeFabricacion = anoDeFabricacion;
	}
	
	//TODO:
	public void acelerar() {
		
	}
	
	public void frenar() {
		
	}
	
	
}
