

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Cajero {



    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);



        char opcion;

        int lado1;
        int lado2;


       String nombre= JOptionPane.showInputDialog("PORFAVOR DIGITE SU NOMBRE");

        System.out.println("deseas calcular (\n 1:area,\n 2:perimetro \n 3:hipotenusa )");
        opcion=sc.next().charAt(0);

        switch (opcion){

            case '1':
                System.out.println("selecionaste la opcion area");

                System.out.println("digite el primer numero del lado");
                lado1=sc.nextInt();

                System.out.println("digite el segundo numero del lado ");
                lado2=sc.nextInt();

                double area=(lado1*lado2)/2;
                System.out.println("el valor del area es :"+area);
                break;



        }








            }














}
