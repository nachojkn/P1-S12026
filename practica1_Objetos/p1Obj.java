package practica1_Objetos;

import java.awt.*;




public class p1Obj {
    /*
    *
    * Las clases son los MOLDES a partir de los cuales se crean los objetos
    *   Crear una clase ES definir un nuevo tipo de dato (diferente a boolean, int, etc)
    *
    *  TODO OBJETO SON INSTANCIAS DE UNA CLASE:
    * ---> Estado: son propiedades/atributos/variables. ej color, largo
    * ---> Comportamiento: "funciones" que se pueden hacer con el objeto. Mejor llamados metodos
    *
    * Cuando se crea una instancia de una clase, JAVA le asigna una direccion de memoria dentro de la memoria estatica al nombre del objeto, y en la memoria dinamica se le asigna  un espacio para guardar su estado (características del objeto).
    * En el nombre de la instancia creada se coloca una referencia al objeto
    *
    * CONSTRUCTORES
    * Cuando se usa el comando "new", el sistema llama a un metodo especial llamado constructor, que crea el objeto
    *
    * ALIASING --> PREGUNTA DE PARCIAL --> Se le llama aliasing a la situacion donde dos variables referencian a un mismo objeto
    *
    * PREGUNTA DE PARCIAL --> Cual es la diferencia entre comparar variables con "==" y ".equals()"??
    *   --> == Cuando se comparan intancias/valores de tipos complejos, en realidad compara direcciones de memoria; .equals() compara los valores dentro de estas variables
    * Caso particular, en una situacion de aliasing p1 == p2 arrojaría true (si estas son las variables que apuntan a un mismo objeto)
    *
    *
    *
    * Cuando declaramos una variable sin valores, por defecto se le asigna null a esas variables dentro del objeto.
    * si creamos "Point p1;" o "Point p2 = null;" es lo mismo, ambos seran null. Si buscamos acceder a alguna propiedad de alguno de esos objetos la consola arrojará "NullPointerException"
    *
    * Para borrar la referencia a un objeto se le puede asignar null; por ejemplo existe el Point "p1" y le asigno p1 = null;
    *  --> esto provoca que pierda sus propiedades, y el objeto queda sin referencia
    *  --> En este caso, se puede pasar el garbage collector para borrar de la memoria dinámica de todos aquellos objetos sin referencia
    *
    *
    * */



    static double distancia(Point p1, Point p2) {
        double distX = p1.x - p2.x;
        double distY = p1.y - p2.y;
        return Math.sqrt(distX * distX + distY * distY);
    }

    static double diagonal(Rectangle rec){
        Point p1 = new Point(rec.x, rec.y);
        Point p2 = new Point(rec.x + rec.width, rec.y + rec.height);
        return distancia(p1, p2);
    }

    static Point centro(Rectangle rec) {
        double centroX = rec.x + rec.width / 2.0;
        double centroY = rec.y + rec.height / 2.0;
        return new Point((int)centroX, (int)centroY);
    }

    static void main() {
        // Point p1 = new Point(2,2);
        // Point p2 = new Point(3,3);
        Rectangle rec = new Rectangle(6,3);
        System.out.println("s");
    }
}
