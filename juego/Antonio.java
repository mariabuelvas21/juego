public class Antonio extends personaje {
    public Antonio() {
        nombre = "Antonio";
        fuerza = 100;
        salud = 900;
        habilidad = 350;
        regeneracion=80;
    }

    public static void detalles() {
        System.out.println("Las estadisticas de Antonio son:");
        System.out.println("fuerza: 100");
        System.out.println("salud 900");
        System.out.println("habilidad 350");

    }
}
