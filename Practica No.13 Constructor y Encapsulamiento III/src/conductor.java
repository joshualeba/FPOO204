public class conductor {
    // Atributos privados
    private String nombre;
    private String identificacion;
    private String licencia;

    // Constructor
    public conductor(String nombre, String identificacion, String licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    // Métodos getter (no hay setters para identificacion y licencia)
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getLicencia() {
        return licencia;
    }
}