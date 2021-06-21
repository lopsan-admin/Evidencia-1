public class Usuario {

    private final String nombre;
    private final String password;

    public Usuario(String nom, String pass) {
        nombre = nom;
        password = pass;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario otroAdmin = (Usuario)objeto;
            if (nombre.equals(otroAdmin.nombre) && password.equals(otroAdmin.password))
                return true;
            else
                return false;
        }
        else
            return false;
    }

}