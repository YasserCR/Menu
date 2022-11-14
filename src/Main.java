import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opt = "";
    do{
        System.out.println("-----Menu-----");
        System.out.println("a) Calcular el promedio de un estudiante");
        System.out.println("b) Obtener la edad del estudiante");
        System.out.println("c) Obtener el número mayor y el menor de una secuencia");
        System.out.println("d) Calcular el monto a pagar para la impresión de un trabajo");
        System.out.println("e) Calcular el cambio que debe dar un empleado cuando le cobre a un cliente");
        System.out.println("f) Salir");
        opt = sc.next();

        switch (opt){
            case "a":
                System.out.println("Ingresa el numero de materias del alumno");
                int materias = sc.nextInt();
                double materiasArray[] = new double[materias];
                double accum = 0;
                for (int i = 0; i < materias; i++) {
                    System.out.println("Ingresa la calificacion de la materia: " + (i + 1));
                    materiasArray[i] = sc.nextInt();
                    accum += materiasArray[i];
                }
                double promedio = accum/materias;
                System.out.println("El promedio del alumno es de: "+String.format("%.2f",promedio));
                break;

            case "b":
                System.out.println("Ingresa el año de nacimiento del alumno");
                int edad = sc.nextInt();
                System.out.println("La edad del alumno es de: "+(2022-edad)+" años");
                break;

            case "c":
                System.out.println("Ingresa el tamaño de la secuencia");
                int secuencia = sc.nextInt();
                int numerosSecuencia[] = new int[secuencia];
                for (int i = 0; i < secuencia; i++) {
                    System.out.println("Ingresa el numero: " + (i + 1));
                    numerosSecuencia[i] = sc.nextInt();
                }
                System.out.println("El número menor de la secuencia es: "+ Arrays.stream(numerosSecuencia).min().getAsInt());
                System.out.println("El numero mayor de la secuencia es: "+ Arrays.stream(numerosSecuencia).max().getAsInt());
                break;
            case "d":
                System.out.println("Ingresa el costo por impresión");
                double precio = sc.nextDouble();
                System.out.println("Ingesa la cantidad de impresiones");
                double impresiones = sc.nextDouble();
                System.out.println("El total a pagar por las impresones es de $"+impresiones*precio);
                break;
            case "e":
                System.out.println("Ingresa el monto total a pagar");
                double total = sc.nextDouble();
                System.out.println("Ingresa el monto dada por el usuario");
                double monto = sc.nextDouble();
                System.out.println("El cambio del cliente es de $"+(monto-total));
                break;
            default:
                System.out.println("Por favor, selecciona una opcion valida");
        }

    } while (!opt.equals("f"));

    }
}