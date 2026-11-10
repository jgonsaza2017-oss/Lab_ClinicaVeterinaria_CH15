import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private List<String> vacunas;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
        this.vacunas = new ArrayList<>();
    }

    @Override
    public double calcularCostoConsulta() {
        // $45.000 base + $3.000 por cada año de edad
        return 45000 + (3000 * this.edad);
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        // $80.000 anuales por cada año de edad
        return 80000.0 * this.edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + this.nombre.toUpperCase();
    }
}