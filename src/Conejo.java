public class Conejo extends Animal {

    public Conejo(String nombre, int edad, String nombreDueno) {
        super(nombre, edad, nombreDueno);
    }

    @Override
    public double calcularCostoConsulta() {
        // Tarifa fija de $35.000
        return 35000;
    }
}