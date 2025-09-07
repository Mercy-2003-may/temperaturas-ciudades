public class RegistroTemperaturas {
    public static void main(String[] args) {
        // Datos: ciudades, semanas, días
        String[] ciudades = {"Quito", "Guayaquil", "Cuenca"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int semanas = 2;

        // Matriz 3D: [ciudad][semana][día]
        double[][][] temperaturas = {
            {   // Quito
                {18.5, 19.0, 20.1, 21.3, 19.5, 18.9, 20.0}, // Semana 1
                {22.0, 21.5, 20.3, 23.1, 22.8, 21.0, 20.7}  // Semana 2
            },
            {   // Guayaquil
                {25.0, 26.3, 27.5, 28.1, 27.0, 26.5, 25.9}, // Semana 1
                {28.5, 29.0, 30.2, 31.1, 30.7, 29.5, 28.8}  // Semana 2
            },
            {   // Cuenca
                {15.5, 16.0, 16.8, 17.3, 16.5, 15.9, 16.2}, // Semana 1
                {18.0, 18.5, 19.2, 19.7, 18.9, 18.3, 18.8}  // Semana 2
            }
        };

        // Bucle anidado para recorrer las ciudades y semanas
        for (int c = 0; c < ciudades.length; c++) {
            System.out.println("=== Ciudad: " + ciudades[c] + " ===");
            
            for (int s = 0; s < semanas; s++) {
                double suma = 0;
                int diasSemana = dias.length;
                
                for (int d = 0; d < diasSemana; d++) {
                    suma += temperaturas[c][s][d];
                }
                
                double promedio = suma / diasSemana;
                System.out.printf("Semana %d: %.2f ºC%n", (s + 1), promedio);
            }
            System.out.println();
        }
    }
}
