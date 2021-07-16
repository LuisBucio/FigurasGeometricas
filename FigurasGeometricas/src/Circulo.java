
public class Circulo extends FigurasGeometricas {
	
	float radio ;
	double pi = Math.PI;
	
	public float areaCirculo() {
		
		float aCirculo = (float) (pi * (radio * radio));
		return aCirculo;
	}

}
