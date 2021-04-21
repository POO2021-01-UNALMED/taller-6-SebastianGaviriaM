package vehiculos;

public class Vehículo {
	String placa;
	int puertas;
	float velocidadMaxima;
	String nombre;
	long precio;
	float peso;
	String tracción;
	Fabricante fabricante;
	public static int conVehiculos = 0;
	
	Vehículo(){
		super();
	}
	
	Vehículo(String placa, int puertas, float velocidadMaxima, String nombre, long precio, float peso, String traccion, Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.tracción = traccion;
		this.fabricante = fabricante;
		
		this.fabricante.numeroVentas++;
		this.fabricante.pais.numeroVentas++;
		conVehiculos++;
	}
	
	public String vehiculosPorTipo() {
		return("Automoviles: " + Automóvil.contadorAuto + "\n"
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
		this.tracción = traccion;
	} 
	String getTraccion() {
		return tracción;
	}
	
	
	void setFabricante(Fabricante fab) {
		this.fabricante = fab;
	} 
	Fabricante getFabricante() {
		return fabricante;
	}
	

}
