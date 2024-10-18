
public class PersonaPublica {
    String direccion;
    String telefono;
    String email;

    public PersonaPublica(String direccion, String telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    private void cambiarDireccion(String direccion){
        System.out.println("Nueva Direccion: " + direccion);
    }

    private void mostarTelefono(){
        System.out.println("Telefono: " + telefono);
    }

}
