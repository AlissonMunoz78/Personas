public class PersonaPublica {
    public String direccion;
    public String telefono;
    public String email;

    public PersonaPublica(String direccion, String telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    private void cambiarDireccion(String direccion) {
        this.direccion = direccion;
        System.out.println("Nueva Dirección: " + direccion);
    }

    private void mostrarTelefono() {
        System.out.println("Teléfono: " + telefono);
    }

    public void actualizarDireccion(String nuevaDireccion) {
        cambiarDireccion(nuevaDireccion);
    }

    public void verTelefono() {
        mostrarTelefono();
    }
}
