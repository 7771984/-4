// Создать LinkedList целых чисел (заполнить случайными числами).
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Задание_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Random random = new Random();
        for (Integer i = 0; i < 10; i ++) {
            ll.add(random.nextInt(10));
        }
        System.out.print(ll);
        int temp = 0;
        while (temp != ll.size() - 1) {
            ll.add(ll.size()-temp, ll.getFirst());
            ll.removeFirst();
            temp++;
        }
        System.out.println("\nInverted list = " + ll);
    } 
}