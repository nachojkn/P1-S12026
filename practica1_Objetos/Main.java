package practica1_Objetos;

public class Main{

    static void main(){

        ejemploFecha f = new ejemploFecha(31,12,2001);
        ejemploFecha f2 = new ejemploFecha(11,1,2000);
        //System.out.println(f.esVerano());
        //System.out.println(diasDelMes(4, 2024));
        //System.out.println(f.antesQue(f2));

        f.imprimir();
        f.getDia();
        f.setDia(15);
        f.imprimir();


    }
}
