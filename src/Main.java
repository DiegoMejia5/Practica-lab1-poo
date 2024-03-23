import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean continuar = true;

        while (true) {
            System.out.println("Calculadora");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");
            int opcion = read.nextInt();
            if (opcion == 5) {
                return;
            }
            System.out.println("Ingrese el primer numero: ");
            double a = (double) read.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            double b = (double) read.nextInt();
            PrintStream var1;
            double var2;

            switch (opcion) {

                case 1:
                    var1 = System.out;
                    var2 = sumar(a, b);
                    var1.println("La respuesta es: " + var2);
                    break;

                case 2:
                    var1 = System.out;
                    var2 = restar(a, b);
                    var1.println("La respuesta es: " + var2);
                    break;

                case 3:
                    var1 = System.out;
                    var2 = multiplicar(a, b);
                    var1.println("La respuesta es: " + var2);
                    break;

                case 4:
                    var1 = System.out;
                    var2 = dividir(a, b);
                    var1.println("La respuesta es: " + var2);
                    break;
            }
        }
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}

