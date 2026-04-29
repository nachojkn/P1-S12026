package practica1_Objetos;

public class Circulo{
	double radio;
	Punto centro;

	Circulo(double centro_x, double centro_y, double radio){
		this.centro = new Punto(centro_x,centro_y);
		this.radio = radio;
	}

	void imprimir(){
		System.out.println("Centro x: "+this.centro.x + " | Centro y: "+ this.centro.y + " | Radio: "+ this.radio);
	}

	double perimetro(){
		return 0; // ========== SEGUIR ACA
	}


	public static void main(){
		Circulo circ1 = new Circulo(100, 200, 80);
		Circulo circ2 = new Circulo(500, 400, 120);

		circ1.imprimir();
		circ2.imprimir();
	}
}

