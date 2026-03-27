package intro;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class EjFunc_1 {
    public static int cantDivisores(int x){
        int cont = 0;
        for (int i=1;i<=x;i++){
            if (x % i==0 ){
                cont++;
            }
        }
        //System.out.println("La cantidad de divisores enteros es: "+ cont);
        return cont;
    }

    public static boolean esPrimo(int x){ // 37 true, 633 false, 3592 false
        if (cantDivisores(x) == 2){
            return true;
        }else{
            return false;
        }
    }

    public static int siguientePrimo(int x) { // sigPrim de 8: 11 | 230: 233 | 3527: 3529
        while (!esPrimo(x + 1)) {
            x++;
        }
        return x+1;
    }

    public static int factorial(int x){ // fact 3: 6 | 7: 5040 | 16: 2004189184 ||| Mayor N° posible --> el que de como resultado el limite de int
        int fact = 1;
        for (int i=x; i>0;i--){
            fact = i*fact;
        }
        return fact;
    }

    public static int digitCounter(int x){
        int i = 1;
        int count = 0;
        while(x / i >0){
            count++;
            i = i*10;
        }
        return count;
    }


    public static int commonDenominators(int x, int y){
        List<Integer> denomX = new ArrayList<>();
        List<Integer> denomComun = new ArrayList<>();

        for (int i=1;i<=x;i++){
            if (x % i==0 ){
                denomX.add(i);
            }
        }
        for(int j = 0;j<denomX.size();j++){
            if (y % denomX.get(j) == 0){
                denomComun.add(denomX.get(j));
            }
        }
        //System.out.println(denomComun);
        return denomComun.size();
    }

    public static String adivinador(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Adivine un N° entre 1 y 10");
        int intento = scan.nextInt();

        Random rnd = new Random();
        int answer = rnd.nextInt((10 - 1 + 1) + 1); //random entre 1 y 10 --> random.nextInt(max - min) + min;


        if (intento == answer){
            return "Ganó";
        } else {
            return "Perdió";
        }
    }

    public static String adivinadorVariosInt() {
        Scanner scan = new Scanner(System.in);

        Random rnd = new Random();
        int min = 1;
        int max = 10;
        int answer = rnd.nextInt((max - min + 1)) + min; //random entre 1 y 10 --> random.nextInt(max - min) + min;

        int cantIntentos = 3;
        int cont = 1;
        System.out.println("Adivine un N° entre 1 y 10");
        int intento = scan.nextInt();

        while (cont < cantIntentos) {
            if (intento == answer) {
                return "Ganó";
            } else {
                cont++;
                if (intento < answer) {
                    System.out.println("El N° que busca es mayor." + "\n" + "Intente nuevamente:");
                } else {
                    System.out.println("El N° que busca es menor." + "\n" + "Intente nuevamente:");
                }
                intento = scan.nextInt();
            }
        }
        return "Perdió";
    }

    public static void main(){
        // cantDivisores(); // divisores de 45: 6 | 2374: 4 | 3529: 2 (prime)
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Input an int: ");
        int x = scan.nextInt();
        System.out.println("Input another int: ");
        int y = scan.nextInt();
        */

        //System.out.println(esPrimo(x));
        //System.out.println(siguientePrimo(x));
        //System.out.println(factorial(x));
        //System.out.println(digitCounter(x));
        //System.out.println(commonDenominators(x,y));
        //System.out.println(adivinador());
        System.out.println(adivinadorVariosInt());

    }
}
