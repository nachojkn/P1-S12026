package practica1_Objetos;

public class Punto {
	double x;
	double y;

	// ======== ITEM A ==========

	Punto(){
		this.x = 0;
		this.y = 0;
	}

	// ======== ITEM B ==========

	Punto(double x, double y){
		this.x = x;
		this.y = y;
	}

	// ======== ITEM C ==========

	void imprimir(){
		System.out.println("Coordenada X: "+this.x+" | Coordenada Y: "+this.y);
	}

	// ======== ITEM D ==========

	void desplazar(double desp_x, double desp_y){
		this.x += desp_x;
		this.y += desp_y;
	}

	// ======== ITEM E ==========

	static double distancia(Punto p1, Punto p2){
		return Math.sqrt( Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}


	public static void main(){
		Punto p1 = new Punto(10, 10);
		Punto p2 = new Punto(25, 10);
		p1.imprimir();
		p2.imprimir();
		System.out.println(distancia(p1,p2));

	}


}
