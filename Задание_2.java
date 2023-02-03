import java.util.LinkedList;

// Создать очередь с помощью LinkedList и реализовать следующие методы:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// Вызвать полученные методы и убедиться в их работоспособности.


public class Задание_2 {
    public static void main(String[] args) {
        int [] list = { 1, 4, 9, 7, 5, 3 };

        LinkedList < Integer > linkList = new LinkedList <> ();
        for (Integer temp : list) {
            linkList.add(temp);
        }

        System.out.println("\nСоздаем очередь с помощью LinkedList: " + (linkList));

        enqueue(linkList, 37);
        System.out.println("\nПомещаем элемент в конец очереди: ");
        System.out.println(linkList);
        System.out.println("\nВозвращаем первый элемент из очереди и удаляем его: " + dequeue(linkList));
        System.out.println(linkList);
        System.out.println("\nВозвращаем первый элемент из очереди, не удаляя: " + first(linkList));
        System.out.println(linkList);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}

