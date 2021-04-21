package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	String nombre;
	Pa�s pais;
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
	public Pa�s getPais() {
		return pais;
	}
	public void setPais(Pa�s pais) {
		this.pais = pais;
	}
	

}
