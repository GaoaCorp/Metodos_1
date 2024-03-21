//Ejercicio 2: Cálculo de área y perímetro. Escribe un metodo que reciba los dos lados de un rectángulo y el tipo de calculo y retorne el cálculo del perímetro (suma de los lados) o el área (base por altura)

public static double calcularRectangulo(double lado1, double lado2, String tipoCalculo) {
    if (tipoCalculo.equalsIgnoreCase("area")) {
        return lado1 * lado2;
    } else if (tipoCalculo.equalsIgnoreCase("perimetro")) {
        return 2 * (lado1 + lado2);
    } else {
        throw new IllegalArgumentException("Tipo de calculo no valido");
    }
}