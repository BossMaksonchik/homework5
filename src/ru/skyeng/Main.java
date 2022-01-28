package ru.skyeng;

public class Main {

    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(" сумма трат за месяц составила " + sum + " рублей");// write your code here


        {
            int[] arr1 = generateRandomArray();
            int min = arr1[0];
            int max = arr1[0];
            for (int i : arr1) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
            System.out.println("Минимальные затраты за месяц " + min + " рублей");
            System.out.println("Максимальные затраты за месяц " + max + " рублей");

        }
        {
            int[] arr2 = generateRandomArray();
            int sum1 = 0;
            for (int i : arr2) {
                sum1 += i;
            }
            float average = sum1 / (float) arr2.length;
            System.out.println(" средняя сумма трат за месяц составила: " + average + " рублей");

        }
        char[] reveseFullName = { 'n', 'a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reveseFullName.length -1; i>=0;i--){
            System.out.println(reveseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
