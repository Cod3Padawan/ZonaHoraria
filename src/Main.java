import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Formatear la hora
        LocalTime hora = LocalTime.of(12, 55);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormateada = hora.format(formatoHora);
        System.out.println(horaFormateada); // Salida: 12:55

        // Formatear la fecha
        LocalDate fecha = LocalDate.of(2023, 5, 18);
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fecha.format(formatoFecha);
        System.out.println(hora + " " + fechaFormateada); // Salida: 18/05/2023
    }
}
