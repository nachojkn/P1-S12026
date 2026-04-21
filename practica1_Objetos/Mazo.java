package practica1_Objetos;

import java.util.Random;

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

    public void mostrarMazo(){
        for (int i = 0; i < this.cartas.length; i++) {
            cartas[i].mostrarCarta();
        }
    }


    public void mezclarMazo(){
        Carta aux = new Carta(0,0);
        for(int i = 0; i < this.cartas.length; i++){
            aux.numero = this.cartas[i].numero;
            aux.palo = this.cartas[i].palo;
            Random rnd = new Random();
            int posRnd = rnd.nextInt(0,40);
            cartas[i].numero = cartas[posRnd].numero;
            cartas[i].palo = cartas[posRnd].palo;
            cartas[posRnd].numero = aux.numero;
            cartas[posRnd].palo = aux.palo;
        }
    }

    static void main() {
        Mazo mazo = new Mazo();
        Mazo copiaMazo = mazo.copiar();
        int cartaSeleccionada = 28;
        System.out.println("Carta nro "+cartaSeleccionada+" del mazo principal: Número " + mazo.cartas[cartaSeleccionada].numero + "; Palo: " + mazo.cartas[cartaSeleccionada].palo);

        System.out.println("Carta nro "+cartaSeleccionada+" del mazo copia: Número " + copiaMazo.cartas[cartaSeleccionada].numero + "; Palo: " + copiaMazo.cartas[cartaSeleccionada].palo);

        System.out.println("La siguiente carta sería: ");
        mazo.cartas[cartaSeleccionada+1].mostrarCarta();

        mazo.mostrarMazo();
        mazo.mezclarMazo();
        System.out.println("Mazo mezclado: ");
        mazo.mostrarMazo();

    }
}
