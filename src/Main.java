public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1.");
        int[] costs1 = {11_000, 10_000, 12_000, 14_000, 13_000};
        int sum1 = 0;
        for (int i = 0; i < costs1.length; i++) {
            sum1 += costs1[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей.");
        System.out.println();


        System.out.println("Exercise 2.");
        int[] costs2 = {11_000, 10_000, 12_000, 14_000, 13_000};
        int maxPayment = -1;
        int minPayment = 100_000_000;
        for (int i = 0; i < costs2.length; i++) {
            if (costs2[i] > maxPayment) {
                maxPayment = costs2[i];
            }
            if (costs2[i] < minPayment) {
                minPayment = costs2[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayment
                + " рублей. Минимальная сумма трат за неделю " + minPayment + " рублей.");
        System.out.println();


        System.out.println("Exrcise 3.");
        float[] costs3 = {11_000, 10_000, 12_000, 14_000, 13_000};
        float sum3 = 0;
        for (int i = 0; i < costs3.length; i++) {
            sum3 += costs3[i];
        }
        sum3 = sum3 / costs3.length;
        System.out.println("Средняя сумма трат за месяц составила " + sum3 + " рублей" +
                " в неделю.");
        System.out.println();


        System.out.println("Exercise 4.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}