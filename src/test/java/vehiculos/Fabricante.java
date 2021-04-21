package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	String nombre;
	País pais;
	int numeroVentas = 0;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	
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
	public País getPais() {
		return pais;
	}
	public void setPais(País pais) {
		this.pais = pais;
	}
	

}
