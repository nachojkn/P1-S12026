package practica1_Objetos;

/*
* Todo metodo constructor debe llamarse igual que la clase
*
* */

public class ejemploFecha {
        int dia;
        int mes;
        int anio;

    // EJEMPLO DE CONSTRUCTOR
    public ejemploFecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    void imprimir(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
    }

    boolean esVerano(){
        return (this.dia >= 21 && this.mes == 12) || (this.mes == 1) || (this.mes == 2 && this.dia < 21);
    }

    static boolean bicieso( int anio ){
        if(anio % 4 == 0 && anio % 100 == 0){
            return true;
        } else if (anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //todo PRINCIPIO ========  Ejercicios para practicar: clase Fecha

    static int diasDelMes (int mes, int anio){
        if(bicieso(anio) && mes == 2){
            return 29;
        } else if (mes == 2) {
            return 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        } else {
            return 31;
        }

    } // es static
    boolean esValida(){return false;}; // no es static, porque toma los datos de la instancia de la clase
    void avanzarDia(){
        this.dia++;
    } // no es static, modifica el dato de dia dentro de la instancia
    boolean antesQue(ejemploFecha otra){
        return (this.anio < otra.anio || (this.mes < otra.mes && this.anio == otra.anio) || (this.dia < otra.dia && this.mes == otra.mes && this.anio == otra.anio) );
    } // no es static porque necesita comparar los valores del objeto de parametro contra los de la instancia

    //todo FIN ========  Ejercicios para practicar: clase Fecha

    public static void main(){
        ejemploFecha f = new ejemploFecha(10,1,2000);
        ejemploFecha f2 = new ejemploFecha(11,1,2000);
        f.imprimir();
        System.out.println(f.esVerano());
        System.out.println(diasDelMes(4, 2024));
        System.out.println(f.antesQue(f2));

    }


}

