package vehiculos;

public class Camion extends VehiculoAMotor {
	
	private String TamanoDelAcoplado;

	public Camion(String marca, String modelo, int NroDeRuedas, String Color, int AnoDeFabricacion,
			float velocidadMaxima, String TamanoDelAcoplado) {
		super(marca, modelo, NroDeRuedas, Color, AnoDeFabricacion, velocidadMaxima);
		
		this.setTamanoDelAcoplado(TamanoDelAcoplado);
	}

	public String getTamanoDelAcoplado() {
		return TamanoDelAcoplado;
	}

	public void setTamanoDelAcoplado(String tamanoDelAcoplado) {
		TamanoDelAcoplado = tamanoDelAcoplado;
	}

}
