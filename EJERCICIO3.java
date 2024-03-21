//Ejercicio 3: Cambio de dólares a euros. Suponiendo que 1 euro = 1.33250 dólares. Escribe un metodo que reciba un número de dólares y retorne el calculo del cambio en euros

public static double cambiarDolaresAEuros(double dolares) {
    double tasaCambio = 1.33250;
    double euros = dolares * tasaCambio;
    return euros;
}