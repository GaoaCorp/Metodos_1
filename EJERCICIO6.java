//Ejercicio 6: Pasar de segundos a días, horas y minutos. Escribe un metodo que reciba los segundos y el tipo, y le retorne el número de días o horas o minuto



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