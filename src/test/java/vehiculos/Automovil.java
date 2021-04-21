package vehiculos;

public class Automovil extends Vehiculo{
	int puestos;
	static int contadorAuto = 0;
	
	public Automovil(){
		super();
	}
	public Automovil(String placa, String nombre, long precio, float peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		contadorAuto++;
	}
	
	int getContadorAuto() {
		return contadorAuto;
	}
	
	void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	int getPuestos() {
		return puestos;
	}

}
