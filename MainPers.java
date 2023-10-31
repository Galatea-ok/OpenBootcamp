public class MainPers {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Utilizamos los setters para asignar valores a las propiedades
        persona.setEdad(25);
        persona.setNombre("Juan Pérez");
        persona.setTelefono("123456789");

        // Utilizamos los getters para mostrar las propiedades por consola
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}

