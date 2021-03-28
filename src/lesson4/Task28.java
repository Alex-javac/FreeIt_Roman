package lesson4;

import java.util.Arrays;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.
public class Task28<T extends Number> {
    T[] t;

    public Task28(T[] t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Task28{" +
                "t=" + Arrays.toString(t) +
                '}';
    }

    public T getT(int index) {
        return t[index];
    }

    public static void main(String[] args) {
        Integer [] i = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        Task28 task28Integer = new Task28(i);
        System.out.println(task28Integer.toString());
        System.out.println(task28Integer.getT(1));

        Long[] l = new Long[]{10L, 20L, 30L, 40L};

        Task28 task28Long = new Task28(l);
        System.out.println(task28Long.toString());
        System.out.println(task28Long.getT(1));

        int[] ints ={9,8,7,6,5,4,3,2,1};
        //Task28 task28Int = new Task28(ints);
    }
}
