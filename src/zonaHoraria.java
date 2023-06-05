import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class zonaHoraria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Obtener fecha y hora actual del sistema
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZoneId zonaActual = ZoneId.systemDefault();
        DateTimeFormatter formateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Fecha y hora actual en tu zona horaria: " + zonaActual);
        System.out.println(currentDateTime.format(formateTime));

        String[] zonasDisponibles = { "Europe/Madrid", "America/New_York", "Asia/Tokyo" };

        // Mostrar las zonas horarias disponibles
        System.out.println("\nZonas horarias disponibles:");
        for (int i = 0; i < zonasDisponibles.length; i++) {
            System.out.println((i + 1) + ". " + zonasDisponibles[i]);
        }

        // Solicitar al usuario seleccionar una zona horaria
        System.out.print("\nSelecciona el número de la zona horaria para ver la fecha y hora actual: ");
        int selectedZoneIndex = sc.nextInt();

        if (selectedZoneIndex >= 1 && selectedZoneIndex <= zonasDisponibles.length) {
            String selectedZoneId = zonasDisponibles[selectedZoneIndex - 1];
            ZoneId selectedZone = ZoneId.of(selectedZoneId);

            // Obtener fecha y hora actual en la zona horaria seleccionada
            LocalDateTime selectedDateTime = LocalDateTime.now(selectedZone);
            System.out.println("\nFecha y hora actual en la zona horaria seleccionada (" + selectedZoneId + "):");
            System.out.println(selectedDateTime.format(formateTime));
        } else {
            System.out.println("Selección inválida.");
        }

        sc.close();// Cerrar sc para liberar recursos
    }
}