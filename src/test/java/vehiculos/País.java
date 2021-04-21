package vehiculos;
import java.util.ArrayList;
public class Pa�s {
	String nombre;
	int numeroVentas = 0;
	private static ArrayList<Pa�s> paises = new ArrayList<>();
	
	
	public Pa�s(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public static Pa�s paisMasVendedor(){
		Pa�s mas = paises.get(0);
		for (int i=0;i<paises.size();i++) {
			if(paises.get(i).numeroVentas>mas.numeroVentas) {
				mas = paises.get(i);
			}
		}
		return mas;
		
	}
	
	public int getnumeroVentas(){
		return numeroVentas;
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
