public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        int resultado = sumarNumeros(num1, num2, num3);

        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static int sumarNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

