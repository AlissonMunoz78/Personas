import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("INFORMACION PERSONA");
        PersonaPrivada priv1 = new PersonaPrivada("Juan",20,178);
        priv1.mostrarDatos();
        priv1.esMayorDeEdad();

        PersonaPublica pub1 = new PersonaPublica("San Juan","0984761009","personapu@gmail.com");
        System.out.println("Ingrese la nueva direccion: ");
        String ndirecc = ingreso.nextLine;

        pub1.
    }
}