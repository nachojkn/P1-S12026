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

    static void main() {
        // Point p1 = new Point(2,2);
        // Point p2 = new Point(3,3);
        Rectangle rec = new Rectangle(1,1);
        System.out.println(diagonal(rec));
    }
}
