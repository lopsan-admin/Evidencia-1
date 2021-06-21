public class Medico {
    public Medico(String medicoNombre, String medicoEspecialidad){
        nombre =medicoNombre;
        especialidad =medicoEspecialidad;
    }

    public String toString(){
        return "Medico: " + nombre + " Especialidad: " + especialidad;
    }

    private final String nombre;
    private final String especialidad;
}