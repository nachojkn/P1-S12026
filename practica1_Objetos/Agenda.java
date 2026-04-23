package practica1_Objetos;

// ===================  EJERCICIO 9 ====================

public class Agenda {
    Persona[] contactos;
    String[] telefonos;

    // ITEM A
    public Agenda(int tamanio){
        this.contactos = new Persona[tamanio];
        this.telefonos = new String[tamanio];
    }

    // ITEM B
    public Agenda guardar( Persona contacto, String telefono){
        for (int i = 0; i < this.contactos.length; i++) {
            if (this.contactos[i] == null){
                this.contactos[i] = contacto;
                this.telefonos[i] = telefono;
                return this;
                }
            }
        Agenda agendaExpandida = this.agrandarAgenda(this.contactos.length*2); // Es buena practica multiplicar el tamaño del arreglo en lugar de ir sumando 1x1, es mas eficiente
        agendaExpandida.contactos[agendaExpandida.contactos.length-1] = contacto;
        agendaExpandida.telefonos[agendaExpandida.contactos.length-1] = telefono;
        return agendaExpandida;
    }

    // ITEM C
    public void eliminar(Persona contacto){

    }

    private Agenda agrandarAgenda(int tamanio){
        Agenda nuevaAgenda = new Agenda(tamanio);
        for (int i = 0; i < this.contactos.length; i++) {
            nuevaAgenda.contactos[i] = this.contactos[i];
            nuevaAgenda.telefonos[i] = this.telefonos[i];
        }
        return nuevaAgenda;
    }

    public void mostrarAgenda(){
        for (int i = 0; i < this.contactos.length; i++) {
            if (this.contactos[i] != null){
            System.out.println("Posición de agenda "+i+" Nombre: "+this.contactos[i].nombre);
            System.out.println(" Edad: "+this.contactos[i].edad);
            }
        }
    }


    static void main() {
        Agenda agenda = new Agenda(2);
        Persona persona1 = new Persona("P1", 23);
        Persona persona2 = new Persona("P2", 12);
        Persona persona3 = new Persona("P3", 36);

        agenda.guardar(persona1, "123456");
        agenda.guardar(persona2, "123456");
        Agenda nuevaAgenda = agenda.guardar(persona3, "123456");
        Agenda nuevaAgenda1 = nuevaAgenda.guardar(persona3, "123456");
        Agenda nuevaAgenda2 = nuevaAgenda1.guardar(persona3, "123456");
        Agenda nuevaAgenda3 = nuevaAgenda2.guardar(persona3, "123456");
        nuevaAgenda3.mostrarAgenda();

        System.out.println("Longitud Agenda 1: "+agenda.contactos.length);
        System.out.println("Longitud Agenda 2: "+nuevaAgenda3.contactos.length);
    }
}
