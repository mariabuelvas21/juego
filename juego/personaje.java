public abstract class personaje {
    String nombre;
    int fuerza;
    int salud;
    int habilidad;
    int regeneracion;

    public void estado(){
        System.out.println("El personaje "+nombre);
        System.out.println("fuerza "+fuerza);
        System.out.println("salud "+salud);
        System.out.println("habilidad "+habilidad);
        System.out.println("regeneracion "+regeneracion);
    }
}
