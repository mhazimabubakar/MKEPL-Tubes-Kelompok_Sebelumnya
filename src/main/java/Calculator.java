
/**
 *
 * @author Panji
 */

public class Calculator {

    private int hasilInt;
    private double hasilDouble;

    public Calculator() {
        this.reset();
    }

    public void reset() {
        hasilDouble = 0;
        hasilInt = 0;
    }

    public void add(int a, int b) {
        hasilInt = a + b;
        System.out.println(String.format("Hasil penambahan antara %d dan %d adalah %d", a, b, hasilInt));
    }

    public void subtract(int a, int b) {
        hasilInt = a - b;
        System.out.println(String.format("Hasil pengurangan antara %d dan %d adalah %d", a, b, hasilInt));
    }

    public void multiply(int a, int b) {
        hasilInt = a * b;
        System.out.println(String.format("Hasil perkalian antara %d dan %d adalah %d", a, b, hasilInt));
    }

    public void divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        hasilDouble = (double) a / b;
        System.out.println(String.format("Hasil pembagian antara %d dan %d adalah %f", a, b, hasilDouble));
    }

    public int getHasilInt() {
        return hasilInt;
    }

    public double getHasilDouble() {
        return hasilDouble;
    }

}