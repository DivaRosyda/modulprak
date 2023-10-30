import java.util.Scanner;

/**
 * Kelas KonversiSuhu berisi metode untuk mengkonversi suhu dari Celsius ke Fahrenheit, Kelvin, dan Reamur.
 */
public class KonversiSuhu {
    /**
     * Metode untuk mengkonversi suhu dari Celsius ke Fahrenheit.
     * @param celcius suhu dalam derajat Celsius
     * @return suhu dalam derajat Fahrenheit
     */
    public static double konversiFahrenheit(double celcius) {
        return (9.0/5.0 * celcius) + 32;
    }

    /**
     * Metode untuk mengkonversi suhu dari Celsius ke Kelvin.
     * @param celcius suhu dalam derajat Celsius
     * @return suhu dalam derajat Kelvin
     */
    public static double konversiKelvin(double celcius) {
        return celcius + 273.15;
    }

    /**
     * Metode untuk mengkonversi suhu dari Celsius ke Reamur.
     * @param celcius suhu dalam derajat Celsius
     * @return suhu dalam derajat Reamur
     */
    public static double konversiReamur(double celcius) {
        return celcius * (4.0/5.0);
    }

    /**
     * Metode utama untuk menjalankan program konversi suhu.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("## Program Java Konversi Suhu ##");
        System.out.println("==================================");
        System.out.println();
        System.out.print("Input Suhu Celsius: ");
        double celcius = input.nextDouble();
        double fahrenheit = konversiFahrenheit(celcius);
        double kelvin = konversiKelvin(celcius);
        double reamur = konversiReamur(celcius);
        System.out.println(celcius + " derajat Celcius = " + fahrenheit + " derajat Fahrenheit");
        System.out.println(celcius + " derajat Celcius = " + kelvin + " derajat Kelvin");
        System.out.println(celcius + " derajat Celcius = " + reamur + " derajat Reamur");
    }
}