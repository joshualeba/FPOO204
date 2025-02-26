public class conductores {
    // Atributos
    private String nombre;
    private int identificacion;
    private String licencia;

    // Constructor
    public conductores(String nombre, int identificacion, String licencia){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}