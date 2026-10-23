package dif_e_Integracion;

public class Main {
    public static void main(String[] args) {
        // Definimos los parámetros de prueba
        double a = 0.0;
        double b = 1.0;
        double tolerancia = 1e-6;

        System.out.println("=== COMPARATIVA DE MÉTODOS DE INTEGRACIÓN NUMÉRICA ===");
        System.out.println("Intervalo: [" + a + ", " + b + "]");
        System.out.println("Tolerancia: " + tolerancia + "\n");

        // 1. Ejecutar Trapecio Compuesto
        long inicioTrapecio = System.currentTimeMillis();
        double resultadoTrapecio = TrapecioCompuesto.integrarConTolerancia(a, b, tolerancia);
        long finTrapecio = System.currentTimeMillis();

        System.out.println("-- Método del Trapecio Compuesto --");
        System.out.println("Resultado de la integral: " + resultadoTrapecio);
        System.out.println("Tiempo de ejecución: " + (finTrapecio - inicioTrapecio) + " ms\n");

        // 2. Ejecutar Simpson 1/3 Compuesto
        long inicioSimpson = System.currentTimeMillis();
        double resultadoSimpson = SimpsonCompuesto.integrarConTolerancia(a, b, tolerancia);
        long finSimpson = System.currentTimeMillis();

        System.out.println("-- Método de Simpson 1/3 Compuesto --");
        System.out.println("Resultado de la integral: " + resultadoSimpson);
        System.out.println("Tiempo de ejecución: " + (finSimpson - inicioSimpson) + " ms\n");

        System.out.println("=====================================================");
        System.out.println("¡Pruebas ejecutadas con éxito para el reporte!");
    }
}