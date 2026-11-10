public class Clinica implements Asegurable {
    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        // Valor fijo anual de $5.000.000
        return 5000000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + this.nombre.toUpperCase().replace(" ", "");
    }
}