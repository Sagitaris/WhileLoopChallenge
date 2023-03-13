public class Main {

    public static void main(String[] args) {

        int i = 4;
        int countEven = 0;
        int countAll = 0;
        while (i <= 20) {
            i++;
            countAll++;
            if (isEvenNumber(i)) {
                System.out.println(i);
                countEven++;
            }

            if (countEven >= 5) {
                break;
            }
        }

        System.out.println("The total number of odd numbers found = " + (countAll - countEven));
        System.out.println("The total number of even numbers found = " + countEven);
    }

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
