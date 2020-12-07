package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String string1;
        for(int i = 0; i <= 20000; i++) {
            System.out.print(i + " ");
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        /*long start1 = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i <= 20000; i++) {
            sb1.append(i + " ");
        }
        System.out.println(sb1.toString());
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println(timeConsumedMillis);*/
    }

}
