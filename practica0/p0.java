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
    static int maximoIndice(int[] a) {
        int answer = 0;
        int answerIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > answer) {
                answer = a[i];
                answerIndex = i;
            }
        }
        return answerIndex;
    }
    static int suma(int[] a) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }
        return answer;
    }
    static boolean estaOrdenado(int[] a) {
        int matches = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i+1] <= a[i]){
                return false;
            }
        }
        return true;
    }
    static double promedio(double[] a) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum/a.length;
    }
    static int sumatoriaRec(int n) {
        if (n == 0){
            return 0;
        } else {
            return n + sumatoriaRec(n-1);
        }
    }
    static int sumatoriaParesRec(int n) {
        if (n == 0){
            return 0;
        }else if (n % 2 == 0) {
            return n + sumatoriaParesRec(n-2);
        } else{
            return sumatoriaParesRec(n-1);
        }
    }
    static int potenciaRec(double x, int n) {
        if (n == 0){
            return 1;
        }else {
            return (int) x * potenciaRec(x, n-1);
        }
    }
    static int factorialRec(int n) {
        if (n == 0){
            return 1;
        } else {
            return n * factorialRec(n-1);
        }
    }

    static int fibrec(int n) {
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibrec(n-2) + fibrec(n-1);
        }
    }

    static int fibiter(int n) {
        int fib = 0;
        int fibi = 1;
        for (int i = 1; i < n; i++) {
            fib = fibi + fib;
            fibi = fib;
        } //mal
        return fib;
    }

    static void collatz(int n) {
        if (n == 1){
            System.out.println("Collatz end");
        }else if (n % 2 == 0){
            System.out.println(n/2);
            collatz(n/2);
        } else if (n % 2 == 1) {
            System.out.println(3 * n + 1);
            collatz(3*n+1);
        }
    }

    static int mcd(int a, int b) {
        if (b == 0){
            return a;
        } else {
            int r = a % b;
            return mcd(b, r);
        }
    }

    static String resto(String word) {
        return word.substring(1);
    }

    static void ej34(String text) {
        // Hecho sin resto
        String ans = "";
        for (int i = 0; i < text.length()-1; i++) {
            ans += text.charAt(i) + "*";
        }
        ans += text.charAt(text.length()-1);
        System.out.println(ans);
    }

    static String ej35(String text) {
        String ans = text.charAt(0)+"";
        /*for (int i = 1; i < text.length()-1; i++) {
            if ((text.charAt(i) != text.charAt(i + 1)) && text.charAt(i) != ans.charAt(ans.length() - 1)) {
                ans += text.charAt(i);
            } else if (text.charAt(i+1) != ans.charAt(ans.length() - 1)) {
                ans += text.charAt(i+1);
            }
        }*/
        int txtLen =  text.length();
        for (int i = 1; i < txtLen-1; i++) {
            if (ans.charAt(ans.length()-1) != resto(text).charAt(0)) {
                ans += resto(text).charAt(0);
            }
            text = resto(text);
        }

        return ans;

    }

    static String reverseRecursive(String text) {
        if(text.isEmpty()){
            return "";
        } else{
            return reverseRecursive(resto(text)) + text.charAt(0);
        }
    }

    static int sumarUnoHasta(int n) {
        if (n == 1){
            return n;
        }else {
            return n + sumarUnoHasta(n-1);
        }
    }

    static int sumarEntre(int n1, int n2) {
        if(n1 == n2){
            return n1;
        } else if(n1 < n2){
            return  n2 + sumarEntre(n1, n2-1);
        } else {
            return  n1 + sumarEntre(n1-1, n2);
        }
    }

    static void imprimirUnoHasta(int n){
        while(n>=1){
            System.out.println(n);
            n -= 1;
        }
    }

    static int prodCifras(int n) {
        if(n % 10 == 0 && n < 10){
            return n;
        } else if(n % 10 != 0){
            return (n%10) * prodCifras(n/10);
        } else {
            return prodCifras(n/10);
        }
    }

    static String estaPrimera(String s1, String s2) {
        if(s1.isEmpty()) {
            return s1;
        } else if(s2.isEmpty()) {
            return s2;
        } else if (s1.charAt(0) < s2.charAt(0)){
            return s1;
        } else if (s1.charAt(0) > s2.charAt(0)) {
            return s2;
        } else {
            return s1.charAt(0) + estaPrimera(resto(s1), resto(s2));
        }
    }

    static String imprimirEspaciado(String text) {
        if (text.length() == 1){
            return text;
        }else {
            return text.charAt(0) + " " + imprimirEspaciado(resto(text));
        }
    }

    static String rotacion(String s, int n) {
        if (n == 0){
            return s;
        } else {
            return rotacion(resto(s) + s.charAt(0), n-1);
        }
    }


    static String[] restoArreglos(String[] arreglo) {
        String[] newArray =  new String[arreglo.length -1];
        for (int i = 1; i < arreglo.length; i++) {
            newArray[i-1] = arreglo[i];
        }
        return newArray;
    }

// =========== MAIN ===========

    static void main(String[] args) {
        double[] n = {26,25};
        System.out.println(rotacion("siempre", 3));

    }
// =========== MAIN ===========
}



