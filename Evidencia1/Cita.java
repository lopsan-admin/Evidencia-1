import java.time.LocalDateTime;

public class Cita {
    public Cita(String citaMedico, String citaPaciente, String citaFecha, String citaMotivo){
        medico =citaMedico;
        paciente =citaPaciente;
        fecha =citaFecha;
        motivo = citaMotivo;
    }

    public String toString(){
        return "Medico: " + medico + " Paciente: " + paciente + " Fecha Hora: " + fecha
                + " Motivo Consulta: " + motivo;
    }

    private final String medico;
    private final String paciente;
    private final String fecha;
    private final String motivo;
}