public class Spartan {

    //Atributos del espartan
    private String nombre;
    private int salud;
    private int escudo;
    private String armaPrincipal;

    public Spartan(String armaPrincipal, int escudo, String nombre, int salud) {
        this.armaPrincipal = armaPrincipal;
        this.escudo = escudo;
        this.nombre = nombre;
        this.salud = salud;
    }

    //Metodo del espartan

    public void mostrarInfo(){
        System.out.println("----------Información del espartan----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Escudo: " + escudo);
        System.out.println("Arma Principal: " + armaPrincipal);
        System.out.println("--------------------------------------------");
    }

    public void atacar(String enemigo){
        System.out.println(nombre + " ataca a " + enemigo + " con " + armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restante = 10;
        int total = restante + municiones;
        System.out.println("El arma "+ armaPrincipal + "Tiene "+ total +" municiones");
    }

    public void correr(boolean status){
        if(status){
            System.out.println("El Spartan" + nombre + " esta corriendo");
        }else{
            System.out.println("El Spartan" + nombre + " se detuvo");
        }
    }

    //Zona de   GETTERS y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

}//La clase Spartan termina aqui