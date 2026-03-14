/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 * 
 * @author MARIA
 * @version 5
 * @since 1.1
 * 
 */
public class Utilidades {

    /**
     * Comprueba si el año es bisiesto. Este método realiza operaciones para la comprobación.
     * @param anio
     * @return true/false
     */
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    /**
     * De km/hora a metros/seg. Este método pasa de kilómetros/hora a metros/segudo
     * @param kmh
     * @return double con el valor
     */
    public static double kmhAms(double kmh) {
        return kmh / 3.6;
    }

    /**
     * Pasa de grados a radianes. Este método pasa de grados a radianes.
     * @param grados
     * @return double con el valor
     */    
    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }

    /**
     * Pasa de grados a radianes. Se le pasan los grados, minutos y segundos.
     * @param grados
     * @param minutos
     * @param segundos
     * @return double con el valor
     */
    public static double gradosARadianes(int grados, int minutos, int segundos) {
        return gradosARadianes(grados + (minutos / 60.0) + (segundos / 3600.0));
    }

    /**
     * Pasa de grados Celsius a grados Fahrenheit. Convierte grados Celsius en en grados Farhenheit.
     * @param celsius
     * @return double con el valor
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Pasa de grados Fahrenheit a grados Celsius. Convierte grados Farhenheit en en grados Celsius.
     * @param fahrenheit
     * @return double con el valor
     */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Área del círculo. Obtiene el área del círculo dado el radio.
     * @param radio
     * @return double con el valor
     */
    public static double areaCirculo(double radio) {
        return Math.PI * alCuadrado(radio);
    }

    /**
     * Longitud de la circunferencia. Obtiene la longitud de la circunferencia dado el radio.
     * @param radio
     * @return double con el valor
     */
    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    /**
     * Cuadrado de un número. Devuelve el cuadrado de un número
     * @param num
     * @return double con el valor
     */
    public static double alCuadrado(double num) {
        return Math.pow(num, 2.0);
    }

    /**
     * Teorema de Pitágoras. Devuelve la hipontenusa dados los dos catetos.
     * @param cateto1
     * @param cateto2
     * @return double con el valor
     */
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(alCuadrado(cateto1) + alCuadrado(cateto2));
    }

    /**
     * Teorema de Pitágoras. Devuelve un cateto dada la hipontenusa y el otro cateto.
     * @param hipotenusa
     * @param cateto
     * @return double con el valor
     */
    public static double catetoA(double hipotenusa, double cateto) {
        return Math.sqrt(alCuadrado(hipotenusa) - alCuadrado(cateto));
    }

    /**
     * De millas por hora a kilómetros por hora. 
     * @param mph
     * @return double con el valor
     */
    public static double mphAKmh(double mph) {
        return mph * 1.60934;
    }

    /**
     * De kilómetros por hora a millas por hora. 
     * @param kmh
     * @return double con el valor
     */
    public static double kmhAMph(double kmh) {
        return kmh / 1.60934;
    }

}
