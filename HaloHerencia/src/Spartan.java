public class Spartan extends Soldado {
    private int escudo;
    public Spartan(String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma);
        this.escudo = escudo;
    }

    public void recargarEscudo(){
        escudo = 100;
        System.out.println("El Spartan " + nombre + " recargó su escudo al máximo.");
    }

    @Override
    public void recibirDano(int dano){
        if(escudo > 0){
            escudo -= dano;
            if(escudo < 0){
                salud += escudo;
                escudo = 0;
            }
            System.out.println("El spartan " + nombre + " recibió daño.\nEscudo: " + escudo + "\nSalud: " + salud);
        } else {
            super.recibirDano(dano);
        }
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escudo: " + this.escudo);
    }
}