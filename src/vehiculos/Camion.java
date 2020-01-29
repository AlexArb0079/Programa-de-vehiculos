package vehiculos;

public class Camion extends VehiculoAMotor {
	
	private String tamanoDelAcoplado;

	public Camion(String marca, String modelo, int NroDeRuedas, String Color, int AnoDeFabricacion,
			float velocidadMaxima, String TamanoDelAcoplado) {
		super(marca, modelo, NroDeRuedas, Color, AnoDeFabricacion, velocidadMaxima);
		
		this.setTamanoDelAcoplado(TamanoDelAcoplado);
	}

	public String getTamanoDelAcoplado() {
		return tamanoDelAcoplado;
	}

	public void setTamanoDelAcoplado(String tamanoDelAcoplado) {
		this.tamanoDelAcoplado = tamanoDelAcoplado;
	}

	@Override
	public String showVehiculo() {
		return super.showVehiculo() + "\nTamaño del acoplado: " + this.tamanoDelAcoplado;
	}
	
}
