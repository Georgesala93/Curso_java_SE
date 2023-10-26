import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Integer response;
        do {
            System.out.println("Selecciona el numero de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Seleccionaste Movies ");
                    break;
                case 2:
                    System.out.println("Seleccionaste Series ");
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
            }

        } while (response != 0);
        System.out.println("Se termino el prgrama");
    }
}
