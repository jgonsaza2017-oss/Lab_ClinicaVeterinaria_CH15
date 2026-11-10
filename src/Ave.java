public class Ave extends Animal {
    private double pesoGramos;

    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta() {
        // $28.000 base + $100 por cada gramo de peso
        return 28000 + (100 * this.pesoGramos);
    }
}
