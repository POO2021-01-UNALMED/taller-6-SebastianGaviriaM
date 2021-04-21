package vehiculos;

public class Veh�culo {
	String placa;
	int puertas;
	float velocidadMaxima;
	String nombre;
	long precio;
	float peso;
	String tracci�n;
	Fabricante fabricante;
	public static int conVehiculos = 0;
	
	Veh�culo(){
		super();
	}
	
	Veh�culo(String placa, int puertas, float velocidadMaxima, String nombre, long precio, float peso, String traccion, Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.tracci�n = traccion;
		this.fabricante = fabricante;
		
		this.fabricante.numeroVentas++;
		this.fabricante.pais.numeroVentas++;
		conVehiculos++;
	}
	
	public String vehiculosPorTipo() {
		return("Automoviles: " + Autom�vil.contadorAuto + "\n"
				+ "Camionetas: " + Camioneta.contadorCamioneta + "\n"
				+ "Camiones: " + Camion.contadorCamiones);
	}
	
	
	
	void setPlaca(String placa) {
		this.placa = placa;
	} 
	String getPlaca() {
		return placa;
	}
	
	
	void setPuertas(int puertas) {
		this.puertas = puertas;
	} 
	int getPuertas() {
		return puertas;
	}
	
	
	void setvelocidadMaxima(float velMax) {
		this.velocidadMaxima = velMax;
	}
	float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	String nombre() {
		return nombre;
	}
	
	
	void setPrecio(long precio) {
		this.precio = precio;
	} 
	long getPrecio() {
		return precio;
	}
	
	
	void setPeso(float peso) {
		this.peso = peso;
	} 
	float getPeso() {
		return peso;
	}
	
	
	void setTraccion(String traccion) {
		this.tracci�n = traccion;
	} 
	String getTraccion() {
		return tracci�n;
	}
	
	
	void setFabricante(Fabricante fab) {
		this.fabricante = fab;
	} 
	Fabricante getFabricante() {
		return fabricante;
	}
	

}
