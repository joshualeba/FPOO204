public class SpartanIII extends Spartan {
    public SpartanIII(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma, 80);
    }

    public void usarCamuflajeActivo() {
        System.out.println("El Spartan " + nombre + " cuenta acon camuflaje para invisibilidad.");
    }
}