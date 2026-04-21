package practica1_Objetos;

public class Mazo {
    Carta[] cartas;

    public Mazo(){
        this.cartas = new Carta[40];
        int j = 0;
        for (int p = 0; p <= 3; p++) {
            for (int i = 1; i <=7; i++){
                cartas[j] = new Carta(p, i);
                j++;
            }
            for (int i = 10; i <= 12; i++) {
                cartas[j] = new Carta(p,i);
                j++;
            }
        }
    }

/*
* Para hacer un metodo .copiar() para los mazos, no se deben copiar los objetos de un array a otro de forma directa, eso provoca aliasing.
* Para hacer una copia correcta se debe acceder a los valores de cada carta (en este caso, numero y palo) y asignarlo a las nuevas cartas
*
* */

    public Mazo copiar(){
        Mazo nuevoMazo = new Mazo();
        for(int i = 0; i < this.cartas.length; i++){
            if(this.cartas[i] == null){
                nuevoMazo.cartas[i] = null;
            } else {
                nuevoMazo.cartas[i] = new Carta(this.cartas[i].palo, this.cartas[i].numero);
            }
        }
        return nuevoMazo;
    }


    static void main() {
        Mazo mazo = new Mazo();
        Mazo copiaMazo = mazo.copiar();
        System.out.println("Carta nro 10 del mazo principal: " + mazo.cartas[9].numero + mazo.cartas[9].palo);
        System.out.println("Carta nro 10 del mazo copia: " + copiaMazo.cartas[9].numero + copiaMazo.cartas[9].palo);
    }
}
