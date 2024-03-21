//Ejercicio 5: Pasar de días, horas y minutos a segundos. Escribe un metodo que reciba los siguientes datos: días, horas y minutos. Y retorne con la cantidad de segundos totales que son esos datos.


public static long diasHorasMinutosToSegundos(int días, int horas, int minutos) {
    return días * 24 * 60 * 60 + horas * 60 * 60 + minutos * 60;
}