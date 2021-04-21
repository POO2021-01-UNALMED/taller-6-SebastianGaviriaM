package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	String nombre;
	Pais pais;
	int numeroVentas = 0;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	
	
	public Fabricante(String nombre, Pais pais){
		this.nombre = nombre;
		this.pais = pais;
		
	}
	
	public static Fabricante fabricaMayorVentas(){
        Fabricante mas = fabricantes.get(0);
        for(int i=0;i<fabricantes.size();i++){
            if(fabricantes.get(i).numeroVentas > mas.numeroVentas){
                mas = fabricantes.get(i);
            }
        }
        return mas;
    }
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

}
