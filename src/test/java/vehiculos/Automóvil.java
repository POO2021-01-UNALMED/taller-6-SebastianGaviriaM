package vehiculos;

public class Autom�vil extends Veh�culo{
	int puestos;
	static int contadorAuto = 0;
	
	public Autom�vil(){
		super();
	}
	public Autom�vil(String placa, String nombre, long precio, float peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		contadorAuto++;
	}
	
	int getContadorAuto() {
		return contadorAuto;
	}
	
	void setPuestos(int puestos) {
	}
	int getPuestos() {
		return puestos;
	}
	
	public String toString() {
		return this.puertas + " Sisaaas " + this.nombre + this.tracci�n;
	}
}
