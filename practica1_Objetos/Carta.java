package practica1_Objetos;

public class Carta {
    int palo;
    int numero;

    Carta(int p, int n){
        palo = p;
        numero = n;
    }

    void mostrarCarta(){
        String[] palos = {"Basto", "Copa", "Espada", "Oro"};
        System.out.println(this.numero + " de " + palos[this.palo]);
    }
    static void main() {

    }
}
