package peaksoft;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /** 0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
         Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.
         */


        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] ints = new int[10];
        randomNum(random, ints, linkedList, arrayList);
        LinkedList<Integer> sortLinked = test(linkedList);
        ArrayList<Integer> sortArrayList = test(arrayList);
        System.out.print("array: ");
        forEachElementary(test(ints));
        System.out.println();
        System.out.println("Sort arraylist: " + sortArrayList);
        System.out.println("sort LinkedList: " + linkedList);


    }

    private static void forEachElementary(int[] ints) {
        for (int integer : ints) {
            System.out.print(integer + " ");
        }
    }

    static void randomNum(Random random, int[] ints, LinkedList<Integer> linkedList, ArrayList<Integer> arrayList) {

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(2);
            linkedList.add(random.nextInt(2));
            arrayList.add(random.nextInt(2));
        }

    }

    private static LinkedList<Integer> test(LinkedList<Integer> linkedList) {
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return linkedList;
    }

    private static ArrayList<Integer> test(ArrayList<Integer> arrayList) {
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return arrayList;
    }

    private static int[] test(int[] ints) {

        for (int i = ints.length - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (ints[j] > ints[j + 1]) {
                    int counter = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = counter;
                }
            }
        }
        return ints;
    }
}



