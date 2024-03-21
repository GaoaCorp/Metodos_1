//Ejercicio 1: Cálculo de precios con descuento Escribe un metodo que reciba el precio de un producto y el tanto por ciento de descuento, y te diga el precio con descuento. Por ejemplo, si el precio es 300 y el descuento 20, el metodo retorna que el precio final con descuento es de 240.

public static double calcularPrecioConDescuento(double precio, double descuento) {
    double porcentaje = descuento / 100;
    double precioFinal = precio - (precio * porcentaje);
    return precioFinal;
}