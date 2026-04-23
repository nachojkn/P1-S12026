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



	// ======== ITEM F ==========

	public static void main(){
		Punto p1 = new Punto(4.5, 5.92);
		p1.imprimir();
		p1.desplazar(10,10);
		p1.imprimir();
 ;
	}


}
