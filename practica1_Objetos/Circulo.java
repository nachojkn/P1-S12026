package practica1_Objetos;

public class Circulo{
	double radio;
	Punto centro;

	// ======== ITEM A ==========

	Circulo(double centro_x, double centro_y, double radio){
		this.centro = new Punto(centro_x,centro_y);
		this.radio = radio;
	}

	// ======== ITEM B ==========

	void imprimir(){
		System.out.println("Centro x: "+this.centro.x + " | Centro y: "+ this.centro.y + " | Radio: "+ this.radio);
	}

	// ======== ITEM C ==========

	double perimetro(){
		return this.radio*2*Math.PI;
	}

	double superficie(){
		return Math.pow(this.radio*2, 2)*Math.PI;
	}

	// ======== ITEM D ==========

	void escalar(double factor){
		this.radio = this.radio * factor;
	}

	// ======== ITEM E ==========

	// ======== ITEM F ==========




	public static void main(){
		Circulo circ1 = new Circulo(100, 200, 80);
		Circulo circ2 = new Circulo(500, 400, 120);

		circ1.imprimir();
		circ2.imprimir();
	}
}

