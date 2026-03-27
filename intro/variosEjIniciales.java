package intro;

// IMPORTACIONES

import java.util.Scanner;

// CLASES
class variosEjIniciales {

public static void print(String text){
    System.out.println(text);
}

public static String pedirNombre() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Escribi tu nombre: ");
    return scan.nextLine();
}

public static void saludar(String name){
    print("Hello, "+ name);
}

public static int intInput(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input an integer: ");
    return scan.nextInt();
}

public static int sumExperiment(int a, int b){
    return a+b;
}

public static void countDown(int n) {
        int num = n;
        while (num > 0) {
            if (num > 1) {
                System.out.print(num + ", ");
            } else {
                System.out.print(num + "\n");
            }
            num--;
        }
}


public static void countUp(int n){
        for (int i = 1; i<= n; i++){
            if (i < n) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
}

public static void spellingBee(String text){
    int len = text.length();
    for (int i=0; i<len; i++){
        char c = text.charAt(i);
        System.out.print(c + " ");
    }
    System.out.print("\n");
    int j = 0;
    while(j < len){
        System.out.print(text.charAt(j) + " ");
        j++;
    }
    System.out.print("\n");
}

public static void wordLength(){
    System.out.println("Input a word:");
    Scanner scanner = new Scanner(System.in);
    String word = scanner.next();
    System.out.println("The word "+ word +" has "+ word.length() + " letters");
}

public static void wordCompare(String word1, String word2){
    if (word1.equals(word2)) {
        System.out.println("Son idénticas");
    } else {
        System.out.println("Son distintas");
    }
}


public static void main (String[] args) {
    //spellingBee("test");
    //wordLength();
    //countDown(5);
    //countUp(5);
    wordCompare("hola", "hola");
}
}


/*
FUNCIONES DE INTERES
En un string "test"
--> test.indexOf('a') busca la primer aparicion del char pasado por el argumento, si no aparece devuelve -1
    --> Tambien puede tomar un char + int para buscar la segunda, tercera, etc posicion donde aparece ese char: test.indexOf('a',4)

--> .toUpperCase()
--> .toLowerCase()


*/

/*
String FraseDeUnaLinea = scan.nextLine();
String PrimerPalabraIntroducida = scan.nextLine();
int NumeroEnteroIntroducido = scan.nextInt();
float NumeroDecimalIntroducido = scan.nextFloat();
*/

/*
    saludar(pedirNombre());
    int a = intInput();
    int b = intInput();
    System.out.println(sumExperiment(a,b));
    if (((a % 2) == 0) && ((b % 2) != 0)) {
        print("a es par y b es impar");
    } else {
        if (((a % 2) != 0) && ((b % 2) == 0)){
        print("a es impar y b es par");
        } else {
            if (a % 2 == 0){
                print("Ambos son par");
            } else {
                print("Ambos son impar");
                }
            }
        }*/
