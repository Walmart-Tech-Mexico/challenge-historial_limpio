public class Main {
    public static void main(String[] args) {
        // Reto para el desarrollador:
        // 1. Implementar la función limpiarHistorial para eliminar duplicados y entradas vacías del historial.
        // 2. La función debe recibir un array de Strings con el historial de navegación.
        // 3. La función debe retornar un array de Strings con el historial limpio, sin duplicados ni entradas vacías, manteniendo el orden original en la medida de lo posible.

        String[] historial = {"pagina1", "pagina2", "pagina1", "", "pagina3", "pagina2", ""};

        // Probar la función limpiarHistorial
        String[] historialLimpio = limpiarHistorial(historial);

        // Imprimir el historial limpio
        System.out.println("Historial Limpio:");
        for (String pagina : historialLimpio) {
            System.out.println(pagina);
        }
    }

    public static String[] limpiarHistorial(String[] historial) {
        // TODO: Implementar la lógica para limpiar el historial
        return null; //  Devolver el historial limpio
    }