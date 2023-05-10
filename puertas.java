public class puertas {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();

        System.out.println("El número de puertas del coche es: " + miCoche.getNumPuertas());
    }
}
