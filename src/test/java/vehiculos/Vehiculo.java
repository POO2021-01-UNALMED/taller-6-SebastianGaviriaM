package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	float velocidadMaxima;
	String nombre;
	long precio;
	float peso;
	String tracción;
	Fabricante fabricante;
	public static int conVehiculos = 0;
	
	Vehiculo(){
		super();
	}
	
	public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, long precio, float peso, String traccion, Fabricante fabricante) {
		
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
		return("Automoviles: " + Automovil.contadorAuto + "\n"
				+ "Camionetas: " + Camioneta.contadorCamioneta + "\n"
				+ "Camiones: " + Camion.contadorCamiones);
	}
	
	public static void setCantidadVehiculos(int cant) {
		Vehiculo.conVehiculos = cant;
	}
	public static int getCantidadVehiculos() {
		return conVehiculos;
	}
	
	
	
	public void setPlaca(String placa) {
		this.placa = placa;
	} 
	public String getPlaca() {
		return placa;
	}
	
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	} 
	public int getPuertas() {
		return puertas;
	}
	
	
	public void setvelocidadMaxima(float velMax) {
		this.velocidadMaxima = velMax;
	}
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	public String getNombre() {
		return nombre;
	}
	
	
	public void setPrecio(long precio) {
		this.precio = precio;
	} 
	public long getPrecio() {
		return precio;
	}
	
	
	public void setPeso(float peso) {
		this.peso = peso;
	} 
	public float getPeso() {
		return peso;
	}
	
	
	public void setTraccion(String traccion) {
		this.tracción = traccion;
	} 
	public String getTraccion() {
		return tracción;
	}
	
	
	public void setFabricante(Fabricante fab) {
		this.fabricante = fab;
	} 
	public Fabricante getFabricante() {
		return fabricante;
	}
	

}
