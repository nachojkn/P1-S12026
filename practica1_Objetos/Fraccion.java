package practica1_Objetos;

public class Fraccion {
    int numerador;
    int denominador;

    // =========== ITEM A ============
    Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // =========== ITEM B ============

    void imprimir(){
        System.out.println("La fracción es: "+this.numerador+"/"+this.denominador+" = "+this.numerador/this.denominador);
    }

    // =========== ITEM C ============

    void invertirSigno(){
        this.numerador = - this.numerador;
    }


    // =========== ITEM D ============

    void invertir(){
        int aux = this.numerador;
        this.numerador = this.denominador;
        this.denominador = aux;
    }


    // =========== ITEM E ============

    double aDouble(){
        return (double) this.numerador / this.denominador;
    }

    // =========== ITEM F ============
    static int mcd(int a, int b) {
        if (b == 0){
            return a;
        } else {
            int r = a % b;
            return mcd(b, r);
        }
    }

    void reducir(){
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador = this.numerador / mcd;
        this.denominador = this.denominador / mcd;
    }


    // =========== ITEM G ============

    static Fraccion producto(Fraccion f1, Fraccion f2){
        int a = f1.numerador * f2.numerador;
        int b = f1.denominador * f2.denominador;

        int mcd = mcd(a,b);
        Fraccion answer = new Fraccion(a/mcd, b/mcd);
        return answer;
    }


    // =========== ITEM H ============

    static Fraccion suma(Fraccion f1, Fraccion f2){
        int a = f1.numerador + f2.numerador;
        int b = f1.denominador + f2.denominador;

        int mcd = mcd(a,b);

        Fraccion answer = new Fraccion(a/mcd, b/mcd);
        return answer;
    }



    public static void main(){
        int numerador = 6;
        int denominador = 8;

        Fraccion frac = new Fraccion(numerador, denominador);
        Fraccion frac2 = new Fraccion(numerador+4, denominador+2);
        frac.imprimir();
        frac2.imprimir();
        suma(frac,frac2).imprimir();
    }
}
