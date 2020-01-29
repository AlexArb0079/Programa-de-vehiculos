package mainPackage;

import java.util.ArrayList;

import vehiculos.Automovil;
import vehiculos.Bicicleta;
import vehiculos.Camion;
import vehiculos.Motocicleta;
import vehiculos.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(new Automovil("Nissan", "N08", 4 , "Azul", 2008, 250.5f, true));
		vehiculos.add(new Automovil("Mercedes", "M09", 4 , "Rojo", 2009, 260.5f, false));
		vehiculos.add(new Automovil("Opel", "O10", 4 , "Verde", 2010, 270.5f, false));
		vehiculos.add(new Camion("Jack", "J11", 6 , "Celeste", 2011, 280.5f, "200"));
		vehiculos.add(new Camion("Ford", "F12", 8 , "Rosado", 2012, 290.5f, "220"));
		vehiculos.add(new Camion("Chino", "C13", 10 , "Manzana", 2013, 300.5f, "240"));
		vehiculos.add(new Motocicleta("Harley", "H14", 2 , "Indigo", 2014, 310.5f));
		vehiculos.add(new Motocicleta("Zanella", "Z15", 2 , "Fuego", 2015, 320.5f));
		vehiculos.add(new Motocicleta("Yumbo", "Y16", 2 , "Agua", 2016, 330.5f));
		vehiculos.add(new Bicicleta("China", "C17", 2 , "Marino", 2017, "Montaña"));
		vehiculos.add(new Bicicleta("HomeBrew", "H18", 3 , "Sangre", 2018, "Paseo"));
		vehiculos.add(new Bicicleta("ChinaSport", "C19", 2 , "Pasto", 2019, "Carrera"));
		
		System.out.println("Listar vehiculos: " + "\n--------------------------------");
			
		for (int i = 0; i < vehiculos.size(); ++i ) {
			System.out.println(vehiculos.get(i).showVehiculo() + "\n--------------------------------");
		}
		
		System.out.println("\nAcelerar vehiculos: " + "\n--------------------------------");
		
		for (int i = 0; i < vehiculos.size(); i+=3 ) {
			System.out.println("Vehiculo marca : " + vehiculos.get(i).getMarca());
			System.out.println("Velocidad inicial : " + vehiculos.get(i).getVelocidad());
			vehiculos.get(i).acelerar();
			System.out.println("Velocidad después de acelerar: " + vehiculos.get(i).getVelocidad());
			vehiculos.get(i).frenar();
			System.out.println("Velocidad después de frenar: " + vehiculos.get(i).getVelocidad() + "\n--------------------------------");
		}
		

	}

}
