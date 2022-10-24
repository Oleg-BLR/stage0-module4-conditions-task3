package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void main(String[] args) {
        isFirstAliquot(6, 6);
    }
    public static void isFirstAliquot(int first, int second) {
        if (first == 5) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
