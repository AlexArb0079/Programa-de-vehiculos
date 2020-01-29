package vehiculos;

public class VehiculoAMotor extends Vehiculo {
	
	protected float velocidadMaxima;
	
	public VehiculoAMotor(String marca, String modelo, int NroDeRuedas, String Color, int AnoDeFabricacion, float velocidadMaxima) {
		super(marca, modelo, NroDeRuedas, Color, AnoDeFabricacion);
		
		this.setVelocidadMaxima(velocidadMaxima); 
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String showVehiculo() {
		return super.showVehiculo() + "\nvelocidad maxima: " + this.velocidadMaxima;
	}
	
}
