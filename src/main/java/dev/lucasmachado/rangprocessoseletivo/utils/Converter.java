package dev.lucasmachado.rangprocessoseletivo.utils;

public class Converter {

    public static Integer stringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
