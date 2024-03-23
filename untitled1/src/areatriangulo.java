
import javax.swing.JOptionPane;
import java.util.Scanner;

public class areatriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        opciones(sc);

    }

    public static void opciones(Scanner sc) {
        char opcion;

        String nombre = JOptionPane.showInputDialog("POR FAVOR DIGITE SU NOMBRE");

        System.out.println("¿Qué deseas calcular?:\n 1:area, \n 2;perimetro, \n 3:Hipotenusa ");
        opcion = sc.next().charAt(0);




            switch (opcion) {
                case '1':
                    calcularArea();
                    break;
                case '2':
                    calcularPerimetro();
                    break;
                case '3':
                    calcularHipotenusa();
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        public static void calcularArea () {
            System.out.println("Has seleccionado la opción para calcular el área.");

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la longitud del primer lado del triángulo:");
            int lado1 = sc.nextInt();

            System.out.println("Ingrese la longitud del segundo lado del triángulo:");
            int lado2 = sc.nextInt();

            double area = (lado1 * lado2) / 2.0;
            System.out.println("El área del triángulo es: " + area);
        }

        public static void calcularPerimetro () {
            System.out.println("Has seleccionado la opción para calcular el perímetro.");

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la longitud del primer lado del triángulo:");
            int lado1 = sc.nextInt();

            System.out.println("Ingrese la longitud del segundo lado del triángulo:");
            int lado2 = sc.nextInt();

            System.out.println("Ingrese la longitud del tercer lado del triángulo:");
            int lado3 = sc.nextInt();

            int perimetro = lado1 + lado2 + lado3;
            System.out.println("El perímetro del triángulo es: " + perimetro);
        }

        public static void calcularHipotenusa () {
            System.out.println("Has seleccionado la opción para calcular la hipotenusa.");

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la longitud del primer cateto:");
            double cateto1 = sc.nextDouble();

            System.out.println("Ingrese la longitud del segundo cateto:");
            double cateto2 = sc.nextDouble();

            double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
            System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
        }

    }

