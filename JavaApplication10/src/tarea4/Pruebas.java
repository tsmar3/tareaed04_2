/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

public class Pruebas {

    public static int diasEnMesArray(int mes, int anio) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = 0;

        if (mes > 0 && mes < 13) {

            dias = diasPorMes[mes];

            if (mes == 2 && esBisiesto(anio)) {
                dias++;
            }
        }
        return dias;
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static double kmhAms(double kmh) {
        return kmh / 3.6;
    }

    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }

    public static double gradosARadianes(int grados, int minutos, int segundos) {
        return gradosARadianes(grados + (minutos / 60.0) + (segundos / 3600.0));
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * alCuadrado(radio);
    }

    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double alCuadrado(double num) {
        return Math.pow(num, 2.0);
    }

    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(alCuadrado(cateto1) + alCuadrado(cateto2));
    }

    public static double catetoA(double hipotenusa, double cateto) {
        return Math.sqrt(alCuadrado(hipotenusa) - alCuadrado(cateto));
    }

    public static double mphAKmh(double mph) {
        return mph * 1.60934;
    }

    public static double kmhAMph(double kmh) {
        return kmh / 1.60934;
    }

}
