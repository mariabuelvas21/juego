import java.util.Scanner;

public class JUEGO {
    public static void main(String[] args) {
        personaje personaje1 = null;
        personaje personaje2 = null;
        Scanner leer = new Scanner(System.in);
        int resput, opc;

        do {
            System.out.println("Bienvenido a people fights");
            System.out.println("Bienvenido Jugador 1");
            System.out.println("1. Ver detalles de personajes");
            System.out.println("2. Elegir");
            resput = leer.nextInt();

            switch (resput) {

                case 1:

                    Mary.detalles();
                    System.out.println();

                    Antonio.detalles();
                    break;

                case 2:
                    int numero;
                    System.out.println("Elige tu personaje");
                    System.out.println("1. Mary");
                    System.out.println("2. Antonio");
                    numero = leer.nextInt();
                    if (numero == 1) {
                        personaje1 = new Mary();
                        System.out.println("Elegiste a Mary");
                    } else if (numero == 2) {
                        personaje1 = new Antonio();
                        System.out.println("Elegiste a Antonio");
                    }
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        } while (resput != 2);
        leer.next();

        do {
            System.out.println("Bienvenido a peoples fights");
            System.out.println("Bienvenido jugador 2");
            System.out.println("1. detalles personajes");
            System.out.println("2. Elegir");
            resput = leer.nextInt();
            switch (resput) {
                case 1:
                    Mary.detalles();

                    Antonio.detalles();

                    break;
                case 2:
                    System.out.println("Elegir jugador");
                    System.out.println("1. mary");
                    System.out.println("2. Antonio");

                    opc = leer.nextInt();
                    if (opc == 1) {
                        personaje2 = new Mary();
                    } else {
                        personaje2 = new Antonio();
                    }
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        } while (resput != 2);

        personaje1.estado();
        personaje2.estado();
        do {
            System.out.println("Que deseas realizar jugador 1");
            System.out.println("1: Atacar");
            System.out.println("2: Curarse");
            resput = leer.nextInt();
            if (resput == 1) {
                atacar(personaje2, personaje1);
                System.out.println("la vida del jugador 1 es " + personaje1.salud);
                System.out.println("la vida del jugador 2 es " + personaje2.salud);
            } else {
                curar(personaje1);
            }
            System.out.println("Que deseas realizar jugador 2");
            System.out.println("1: Atacar");
            System.out.println("2: Curarse");
            resput = leer.nextInt();
            if (resput == 1) {
                atacar(personaje1, personaje2);
                System.out.println("la vida del jugador 1 es " + personaje1.salud);
                System.out.println("la vida del jugador 2 es " + personaje2.salud);
            } else {
                curar(personaje2);
            }
            personaje1.estado();
            personaje2.estado();
            leer.next();
            limpiar();
        } while (personaje1.salud > 0 && personaje2.salud > 0);
        if (personaje2.salud <= 0) {
            System.out.println("Gano el jugador 1");
        } else {
            System.out.println("Gano el jugador 2");
        }
    }

    static void limpiar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void atacar(personaje uno, personaje dos) {
        uno.salud = uno.salud - dos.fuerza;
    }

    static void curar(personaje uno) {
        uno.salud = uno.salud + uno.regeneracion;

    }
}
