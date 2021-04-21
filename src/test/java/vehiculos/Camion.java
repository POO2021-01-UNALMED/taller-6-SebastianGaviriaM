package vehiculos;

public class Camion extends Vehiculo{
	int ejes;
	static int contadorCamiones = 0;
	public Camion() {
		super();
	}
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {	
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		contadorCamiones++;
	}
	
	int getContadorCamiones() {
		return contadorCamiones;
	}
	
	void serEjes(int ejes) {
		this.ejes = ejes;
	}
	
	int getEjes() {
		return ejes;
	}
	
	
}
