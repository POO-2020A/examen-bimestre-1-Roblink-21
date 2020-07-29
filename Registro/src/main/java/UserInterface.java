
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Plane plano;
    private Seat ident;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;

    }

    public void start() {
        Passenger persona = null;
        Seat asignacion = null;

        System.out.println("Ingrese la cantidad de filas:");
        int filas = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese la cantidad de columnas:");
        int colum = Integer.valueOf(scanner.nextLine());

        if ((filas > 20) || (filas < 0)) {
            System.out.println("Ingrese de nuevo (Max: 20 y no se aceptan numeros menores a 0):");
            filas = Integer.valueOf(scanner.nextLine());
        } else if ((colum > 20) || (colum < 0)) {
            System.out.println("Ingrese de nuevo (Max: 8 y no se aceptan numeros menores a 0):");
            filas = Integer.valueOf(scanner.nextLine());
        }

        plano = new Plane(filas, colum);

        System.out.println(plano);
        System.out.println("");

        while (true) {
            //System.out.println("What a joke!");
            System.out.println("¿Qué desea hacer?");
            System.out.println(" 1. Ingresar pasajero");
            System.out.println(" 2. Consultar asiento");
            System.out.println(" 3. Consultar pasajero");
            System.out.println(" X - Salir");
            System.out.println();

            System.out.print("Ingrese la opcion: ");
            String word = scanner.nextLine();

            if (word.equals("X")) {
                break;
            } else if (word.equals("1")) {
                System.out.println("Ingresar un pasajero:");
                System.out.print("Ingrese el nombre del pasajero: ");
                String name = scanner.nextLine();
                System.out.print("Ingrese el apellido del pasajero: ");
                String lastname = scanner.nextLine();

                System.out.print("Ingrese la fila del asiento: ");
                int numb = Integer.valueOf(scanner.nextLine());

                System.out.print("Ingrese la columna del asiento: ");
                String asiento = scanner.nextLine();

                persona = new Passenger(name, lastname);
                asignacion = new Seat(numb, asiento, persona);

                plano.seatSets(asignacion);

                System.out.println("¡Pasajero ingresado!");

                System.out.println(plano);

            } else if (word.equals("2")) {
                System.out.println("Consulta de asiento.");
                System.out.print("Ingrese la fila del asiento: ");
                int nb = Integer.valueOf(scanner.nextLine());

                System.out.print("Ingrese la columna del asiento: ");
                String asit = scanner.nextLine();

                for (Seat p : plano.listado()) {
                    if (p.getRow() == nb && p.getCol().equals(asit)) {
                        System.out.println(p);
                    }
                }

            } else if (word.equals("3")) {
                System.out.println("Consulta de pasajero.");
                System.out.print("Ingrese el nombre y apellido: ");
                String datos = scanner.nextLine();
                String partes[] = datos.split(" ");

            }

        }
    }
}
