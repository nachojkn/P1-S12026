package practica1_Objetos;

public class invarianteRepYvisibilidad {
    /*
    *  IREP -- Invariante de Representacion
    *
    * Repaso: una instancia es un concepto válido de un clase (Fecha, Rectangle, etc)
    * --> Las variables de instancia de un objeto represenan su estado actual
    * --> Cualquier concepto válido de un objeto puede ser descrito por su conjunto de variables de instancia
    *
    * La invariante de representacion se denomina a un conjunto de condiciones que se deben cumplir para que un objeto sea valido
    * --> Por ejemplo, en una fecha ningun valor puede ser negativo (ni dia, ni mes ni el año); un mes no puede ser 13, un dia no puede ser 32 o +... etc
    * Este conjunto de condiciones definen a la clase Fecha y todas sus intancias, nuestro código debe salvaguardar su Invariante de Representacion. Esto garantiza que se generen objetos validos.
    *
    * Visibilidad
    * La visibilidad de una variable es "desde donde" se puede ver o acceder a una variable
    *
    * MODIFICADORES DE VISIBILIDAD:
    * - public: visible desde cualquier parte del proyecto
    * - private: visible sólo desde dentro de la clase
    * - package: -valor default- visible solo desde clases que esten dentro del mismo paquete
    * - proected: visible desde la misma clase y cualquiera de sus subclases
    *
    *  ---> Ver SETers y GETers
    *
    * La visibilidad se restringe para evitar que se modifiquen las variables de instancia de un objeto
    * Sin estas restricciones podría ocurrir que los objetos que fueron modificados no cumplan con su invariante de representacion
    *
    *
    * PRE-CONDICION: es una condicion que debe ser verdadera antes que un método se ejecute.
        --> Ejemplo: para setear un nuevo dia en una instancia de Fecha, el int ingresado debe ser positivo.
    *
    * POST-CONDICION: es una condicion que debe ser verdadera luego que un método se ejecute.
    *   --> Ejemplo: luego de ser ejecutado el metodo, la fecha no podría ser nunca el día 30 del mes de febrero.
    *               o luego de ejecutar un método "Transferir" la cuenta de banco debe tener un saldo menor al inicial
    *
    * todo ======================= Hay un documento con definiciones, estudiar para parcialito ========================
    *
    * */




    public static void  main(){

    }
}
