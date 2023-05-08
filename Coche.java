public class Coche {
    private int numPuertas;

    public Coche() {
        numPuertas = 0;
    }

    public void incrementarPuertas() {
        numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}

public class main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();

        System.out.println("El número de puertas del coche es: " + miCoche.getNumPuertas());
    }
}