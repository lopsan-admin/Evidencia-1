public class Paciente {
    public Paciente(String pacienteNombre){
        nombre =pacienteNombre;
    }

    public String toString(){
        return "Paciente: " + nombre;
    }

    private final String nombre;
}
