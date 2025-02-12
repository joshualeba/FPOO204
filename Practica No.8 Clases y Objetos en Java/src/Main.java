public class Main {
    public static void main(String[] args) {
        // Creamos objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan();
        Spartan reach = new Spartan();

        // Asisgnamos los atributos del objeto
        jefeMaestro.nombre = "John 117";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal = "Rifle de asalto.";

        // Usar sus métodos de jefe maistro
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar(" Elite ");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        // Asisgnamos los atributos de otro objeto
        reach.nombre = "Emile";
        reach.salud = 150;
        reach.escudo = 50;
        reach.armaPrincipal = "Aguijoneador.";

        // Usar sus métodos para reach
        reach.mostrarInfo();
        reach.atacar(" Grunt ");
        reach.recargarArma(5);
        reach.correr(true);
    }
}// Llave de la clase