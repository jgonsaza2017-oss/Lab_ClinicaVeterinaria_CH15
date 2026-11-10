public class Main {
    public static void main(String[] args) {

        // 1. Fichas con referencia polimorfica
        Perro firulais = new Perro("Firulais", 3, "Carlos", "Labrador");
        Gato michi = new Gato("Michi", 2, "Ana", true);
        Ave piolin = new Ave("Piolin", 1, "Laura", 120.0);
        Conejo tambor = new Conejo("Tambor", 1, "Sofia");

        Animal[] animales = { firulais, michi, piolin, tambor };

        System.out.println("--- FICHAS DE ATENCION ---");
        for (Animal animal : animales) {
            animal.imprimirFicha();
        }

        // 2. Registro de vacunas
        System.out.println("\n--- REGISTRO DE VACUNAS ---");
        firulais.registrarVacuna("Rabia");
        firulais.registrarVacuna("Multiple");
        michi.registrarVacuna("Triple Felina");

        System.out.println(firulais.getNombre() + " tiene " + firulais.getVacunasAplicadas() + " vacunas.");
        System.out.println(michi.getNombre() + " tiene " + michi.getVacunasAplicadas() + " vacunas.");

        // 3. Calculo de polizas de seguro
        System.out.println("\n--- POLIZAS DE SEGURO ---");
        Clinica vetCare = new Clinica("VetCare Central", "Calle 100 #15-20");

        Asegurable[] asegurables = { firulais, michi, vetCare };

        for (Asegurable asegurable : asegurables) {
            System.out.println("Poliza: " + asegurable.obtenerNumeroPoliza() +
                    " | Prima: $" + asegurable.calcularPrimaSeguro());
        }
    }
}