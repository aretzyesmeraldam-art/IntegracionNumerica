package dif_e_Integracion;

public class TrapecioCompuesto {

    // Función matemática a integrar (por ejemplo: f(x) = e^(-x^2) o sin(x))
    public static double funcion(double x) {
        return Math.sin(x); // Puedes cambiar esta función por la que te hayan pedido en clase
    }

    // Método para calcular el ancho de cada subintervalo h
    public static double calcularH(double a, double b, int n) {
        return (b - a) / n;
    }

    // Método principal del Trapecio Compuesto para comparar con Simpson
    public static double integrarConTolerancia(double a, double b, double tolerancia) {
        int n = 1;
        double h = calcularH(a, b, n);
        double integralAnterior = (h / 2.0) * (funcion(a) + funcion(b));
        double errorAbsoluto = 999.0;

        while (errorAbsoluto > tolerancia) {
            n *= 2;
            h = calcularH(a, b, n);
            double sumaIntermedios = 0.0;

            for (int k = 1; k < n; k++) {
                sumaIntermedios += funcion(a + k * h);
            }

            double integralNueva = (h / 2.0) * (funcion(a) + 2 * sumaIntermedios + funcion(b));
            errorAbsoluto = Math.abs(integralNueva - integralAnterior);
            integralAnterior = integralNueva;
        }

        return integralAnterior;
    }
}
