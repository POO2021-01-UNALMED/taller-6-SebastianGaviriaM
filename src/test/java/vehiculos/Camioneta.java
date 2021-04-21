package vehiculos;

public class Camioneta extends Vehículo {
	boolean volco;
	static int contadorCamioneta = 0;
	
	public Camioneta() {
		super();
	}
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		contadorCamioneta++;
	}
	
	int getContadorCamioneta() {
		return contadorCamioneta;
	}
	
	void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	boolean isVolco() {
		return volco;
	}
	
}
