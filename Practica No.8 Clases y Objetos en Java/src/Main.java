public class Main {
    public static void main(String[] args) {

        //Instanciar un objeto de la clase Spartan
        Spartan jefeMaestro = new Spartan("Rifle de asalto MA5B", 90, "Jefe Maestro", 100);
        Spartan George = new Spartan("Martillo Gravitatorio", 100, "George", 100);

        //Uasr sus metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        //Uasr sus metodos
        George.mostrarInfo();
        George.atacar("covenant");
        George.recargarArma(15);
        George.correr(true);
    }

    public Main() {
    }
} //La clase Main termina aqui