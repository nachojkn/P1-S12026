package practica0;

import java.util.Scanner;

public class p0 {

// =========== INICIO Funciones de Asistencia ===========
    static int scanInt(String question) {
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    static double scanDouble() {
        System.out.println("Input a Double:");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
    static float scanFloat(String question) {
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        return scan.nextFloat();
    }
    static String scanString(String question) {
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    static char scanChar() {
        System.out.println("Input a Char:");
        Scanner scan = new Scanner(System.in);
        return scan.next().charAt(0);
    }

// =========== FIN Funciones de Asistencia ===========



// =========== Funciones de Ejercicios ===========
    static void ej01() {
        System.out.println("Hola, mundo!");
    }
    static void ej02() {
        String name = scanString("Ingrese su nombre: ");
        System.out.println("Hola, "+ name);
    }
    static void ej03() {
        int x = scanInt("Ingrese un entero: ");
        int y = scanInt("Ingrese otro entero: ");
        imprimirSuma(x,y);
/*
        int x = scanInt("Ingrese un entero: ");
        int y = scanInt("Ingrese otro entero: ");
        System.out.println("La suma es: " + (x+y));*/
    }
    static void ej04() {
        System.out.println(1/2);
        System.out.println(1.0/2.0);
        System.out.println(1.0/2);
        System.out.println(1/2.0);
        //System.out.println("1"/"2"); No funciona, es division de strings
        System.out.println(1+2);
        System.out.println("1"+"2");
        System.out.println(16/2*4); // Division tiene prioridad sobre multiplicacion
        System.out.println(16/(2*4));
    }
    static void ej05() {
        float x = scanFloat("Ingrese un número: ");
        float y = scanFloat("Ingrese otro número: ");
        imprimirPromedio(x,y);
/*        float x = scanFloat("Ingrese un número: ");
        float y = scanFloat("Ingrese otro número: ");
        System.out.println((x+y)/2);*/
    }
    static void imprimirSuma(int a, int b) { //Ejercicio 6, hace modificacion sobre 3
        System.out.print("La suma es: ");
        System.out.println(a+b);
    }
    static void imprimirPromedio(float a, float b) { //Ejercicio 7, hace modificacion sobre 5
        System.out.print("El promedio es: ");
        System.out.println((a+b)/2);
    }
    static void ponerNota() {
        double x = scanDouble();
        double y = scanDouble();

        double prom = (x+y)/2;
        if (prom>=7){
            System.out.println("Promocionado");
        } else if (prom>=4) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Debe recuperar");
        }

    }
    static void imprimirFecha(int dia, int mes, int anio) {
        String[] months = {"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int mes_index = mes-1;
        System.out.println(dia + " de "+ months[mes_index]+" de "+ anio);
    }
    static void sumatoria(int n) {
        int resultado = 0;
        for (int i=1;i<=n;i++){
            resultado = resultado + i;
        }
        System.out.println(resultado);
    }
    static void sumatoriaPares(int n) {
        int resultado = 0;
        for (int i=0;i<=n;i += 2){
            resultado = resultado + i;
        }
        System.out.println(resultado);
    }
    static double potencia(double x, int a) {
        int cont = 1;
        double resultado = x;
        if (a == 0) {
            return 1;
        } else {
            while (cont < a) {
                resultado = resultado * x;
                cont++;
            }
            return resultado;
        }
    }
    static double factorial(int n) {
        int resultado = 1;
        if (n == 0){
            return 1;
        }else {
            for (int i=1;i<=n;i++){
                resultado = resultado * i;
            }

        }
        return resultado;
    }
    static int cantCifras(int n) {
        int cont = 0;
        int div = 1;
        while (div < n){
            div = div * 10;
            cont++;
        }
        return cont;
    }
    static boolean esDivisible(int n, int m) {
        return n % m == 0;
    }
    static String reversa(String text) {
        String revText = "";

        for (int i = text.length()-1; i>=0;i--){
            revText = revText + text.charAt(i);
        }
        return revText;
    }
    static int cantidadApariciones(String word, char c) {
        int wordLen = word.length();
        int answer = 0;
        for (int i = 0; i < wordLen; i++) {
            if (word.charAt(i) == c){
                answer++;
            }
        }
        return answer;
    }
    static int cantidadVocales(String word) {
        char[] vocales = {'a','e','i','o','u'};
        int answer = 0;
        for (int i = 0; i < vocales.length; i++) {
            answer = answer + cantidadApariciones(word, vocales[i]);
        }
        return answer;
    }
    static boolean esAbecedaria(String text) {
        int textLen = text.length();
        int cont = 1;
        if (textLen == 1){
            return true;
        } else if (textLen == 2) {
            return text.charAt(0) < text.charAt(1);
        }else {
            for (int i = 0; i < textLen-2; i++) {
                if (text.charAt(i) < text.charAt(i+1)) {
                    cont++;
                }
            }
        }

        return cont == textLen-1;
    }
    static boolean esCapicua(String word) {
        int wordLen = word.length();
        int contMatch = 0;
        int mitadWord = wordLen/2; //Math.floorDiv(wordLen,2);

        for (int i = 0; i < mitadWord; i++){
            if (word.charAt(i) == word.charAt(wordLen - 1 - i)){
                contMatch++;
            }else{
                return false;
            }

        }

        return contMatch == mitadWord;

    }
    static boolean essinRepetidos(String text) {
        int cont = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(text.charAt(i), i+1)==-1){
                cont++;
            }else {
                return false;
            }
        }
        return cont == text.length();
    }
    static String sinRepetidos(String text) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(text.charAt(i), i+1)==-1) {
                answer.append(text.charAt(i));
            }
        }
        return answer.toString();
    }
    static boolean puedeColocarse(String a, String b, String c) {
        // todo: se debe poder hacer mas facil con indexOf
        boolean aFits = false;
        for (int i = 0; i < b.length()-2; i++) {
            for (int j = 0; j < a.length(); j++) {
                if (b.charAt(i) == a.charAt(j)) {
                    aFits = true;
                }
            }
            if (aFits){
                for (int j = 0; j < c.length(); j++) {
                    if (b.charAt(i+2) == c.charAt(j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static int maximo(int[] a) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > answer) {
                answer = a[i];
            }
        }
        return answer;
    }



    static void main(String[] args) {
        System.out.println(puedeColocarse("aaaaaa", "bbbbaba","aa"));
    }
// =========== MAIN ===========
}



/*
     CONFIGURAR MI CUENTA DE GIT EN LA COMPU
     INSTALAR BASH Y CORRER EL COMANDO --> git config --global user.name (poner entre comillas nombre completo)
     CORRER EL COMANDO --> git config --global user.email (poner entre comillas email)
     Hacer un repo en github y seguir el paso a paso de creacion de repo (importante inicializarlo en la carpeta correcta, no en escritorio por ej)
     git remote add origin <link del repo que da github>
     git status --> Los archivos que estan en rojo es porque no estan siendo trackeados por git (no está siguiendo sus cambios)
     git add .  --> agrega todas los archivos y subdirectorios en el directorio
     git commit -m "" --> es la manera de confirmar los cambios en el repo; entre comillas el mensaje de que se cambio en el doc; corto e impropio
     lo que se graba con commit solo se hace localmente
     git push --set-upstream origin main --> De esta forma se carga todo el proyecto (revisar)
     git push -u origin main --> La forma normal de subir los cambios del commit
*/

/*
    Para copiar un repo, abrirlo en github, copiar el link que figura en el desplegable "Code", abrir bash en la carpeta donde quiero "pegarlo"/descargarlo y poner "git clone <link de descarga>
*
*

    En JAVA los tipos primitivos tienen valores predeterminados
    --> int = 0
    --> boolean = false
    --> string = null
    --> int[] (arreglos) = null
    --> char[] (arreglos) = null

    Un arreglo se inicializa --> cuenta = new int[4];
    esto crea un arreglo de 4 ints pero sin valores asignados, por lo que se inicializan con ceros

    ALIASING --> PREGUNTA DE PARCIAL --> Es cuando dos variables referencian al mismo objeto (son dos nombres para una misma direccion de memoria)
    Esto suele pasar cuando se quieren copiar arreglos; en vez de hacer int[] b = a; siendo a un arreglo, se tiene que hacer int[] b = a.clone();
        o copiar "manualmente" los valores con un for
* */