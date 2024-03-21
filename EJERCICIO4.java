//Ejercicio 4: Cálculo de perímetro de circunferencia, área del círculo, y volumen de la esfera. Suponiendo que pi = 3.1416. Escribe un metodo que reciba el radio y el tipo de calculo, y retorne el cálculo del perímetro de la circunferencia (2pir) o el área del círculo (pir2 ) o el volumen de la esfera (V = 4pi*r3 /3). 

public static String segundosToDiasHorasMinutos(long segundos, String tipo) {
    long dias = segundos / (24 * 60 * 60);
    segundos %= (24 * 60 * 60);
    long horas = segundos / (60 * 60);
    segundos %= (60 * 60);
    long minutos = segundos / 60;
    segundos %= 60;
    if (tipo.equalsIgnoreCase("dias")) {
        return String.valueOf(dias);
    } else if (tipo.equalsIgnoreCase("horas")) {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    } else if (tipo.equalsIgnoreCase("minutos")) {
        return String.format("%02d:%02d", minutos, segundos);
    } else {
        throw new IllegalArgumentException("Tipo no válido: " + tipo);
    }
}