public class vehiculo {
    // Atributos
    private String placa;
    private String modelo;
    private double capacidadCarga;
    private conductor conductor;

    // Constructor
    public vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public conductor getConductor() {
        return conductor;
    }

    // Metodo para asignar conductor
    public void asignarConductor(conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
        } else {
            System.out.println("El conductor ya ha sido asignado y no puede modificarse.");
        }
    }
}