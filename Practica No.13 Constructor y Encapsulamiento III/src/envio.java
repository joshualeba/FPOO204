public class envio {

    // Atributos
    private int codigoEnvio;
    private String destino;
    private float peso;

    // Constructor
    public envio(int codigoEnvio, String destino, float peso){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    // Getters y setters
    public int getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(int codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}