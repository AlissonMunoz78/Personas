public class PersonaPrivada {
    String nombre;
    int edad;
    double altura;

    public PersonaPrivada(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;

    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura);
    }

    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}


