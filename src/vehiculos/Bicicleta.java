package vehiculos;

public class Bicicleta extends Vehiculo {

	private String tipo;
	
	public Bicicleta(String marca, String modelo, int NroDeRuedas, String Color, int AnoDeFabricacion, String tipo) {
		super(marca, modelo, NroDeRuedas, Color, AnoDeFabricacion);
		
		this.setTipo(tipo);

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override 
	public void acelerar() {
		super.acelerar();
		System.out.println("Pedaleo más rápido");
	}

	@Override
	public String showVehiculo() {
		return super.showVehiculo() + "\nTipo: " + this.tipo;
	}
	
}
