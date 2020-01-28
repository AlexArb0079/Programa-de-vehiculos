package vehiculos;

public class Automovil extends VehiculoAMotor {
	
	private boolean baul; 
	
	public Automovil(String marca, String modelo, int NroDeRuedas, String Color, int AnoDeFabricacion,
			float velocidadMaxima, boolean baul) {
		super(marca, modelo, NroDeRuedas, Color, AnoDeFabricacion, velocidadMaxima);
		
		this.setBaul(baul);
		
	}

	public boolean isBaul() {
		return baul;
	}

	public void setBaul(boolean baul) {
		this.baul = baul;
	}

	
	
	

}
