public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    // Cada subclase define su propio cálculo según la especie
    public abstract double calcularCostoConsulta();

    // Plantilla común que heredan todas sin reescribir
    public void imprimirFicha() {
        System.out.println("----------------------------------------");
        System.out.println("Ficha de Atencion");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad + " anios");
        System.out.println("Dueno: " + this.nombreDueno);
        System.out.println("Costo Consulta: $" + calcularCostoConsulta());
        System.out.println("----------------------------------------");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}