import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una de las siguientes opciones:\n 1.Añadir contacto\n 2.Mostrar contactos\n 3.Buscar contacto\n 4.Salir");
        int opcionSelect = sc.nextInt();

        switch (opcionSelect) {
            case 1:
                System.out.println("has seleccionado la opción " + opcionSelect);
                break;
            case 2:
                System.out.println("has seleccionado la opción " + opcionSelect);
                break;
            case 3:
                System.out.println("has seleccionado la opción " + opcionSelect);
                break;
            case 4:
                System.out.println("has seleccionado la opción " + opcionSelect);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
