public class Main {
    public static void main(String[] args) {
        SpartanII jefeMaestro = new SpartanII("John", 100, "Rifle de asalto", 0);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();

        SpartanIII Trakalon = new SpartanIII("Lalo", 100, "Espadita", 30);
        Trakalon.mostrarInfo();
        Trakalon.usarCamuflajeActivo();
        Trakalon.atacar("Sheinbaum");
        Trakalon.recibirDano(35);
        Trakalon.recargarEscudo();

        SpartanIV Turip = new SpartanIV("Alberto", 100, "Espadita", 30);
        Turip.mostrarInfo();
        Turip.atacar("Xóchitl");
        Turip.usarPropulsores();
        Turip.recibirDano(60);
        Turip.recargarEscudo();
    }
}