public class vehiculo {
    // Atributos
    private String placa;
    private int capacidadCarga;
    private String modelo;

    public String getPlaca() {
        return placa;
    }

    // Constructor
    public vehiculo(String placa, String modelo, int capacidadCarga){
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    // Getters y Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}