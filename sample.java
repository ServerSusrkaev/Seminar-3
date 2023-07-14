import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        //Library lib = new Library();
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите количетсво элементов списка: ");
        int listSize = input.nextInt();

        // Создание рандомного списка и выведениена эеран:
        ArrayList<Integer> list = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            list.add(i, (int) (Math.random() * listSize) + 1);
        }
        System.out.print(list);
        System.out.println();
        
        //EvenNumDel(list);
        //minValue(list);
        //maxValue(list);
        //mergeValue(list, listSize);
    }

    static void EvenNumDel(ArrayList<Integer> list) {
        Iterator<Integer> col = list.iterator();
        while(col.hasNext()){
        if (col.next() % 2 == 0) {col.remove();}
        }
        System.out.println(list);
    }

    static void minValue(ArrayList<Integer> list){
        System.out.println(Collections.min(list));
    }

    static void maxValue(ArrayList<Integer> list){
        System.out.println(Collections.max(list));
    }

    static void mergeValue(ArrayList<Integer> list, int size){
        Iterator<Integer> col = list.iterator();
        int number = 0;
        while (col.hasNext()) {
            number += col.next();
        }
        double res = (double) number / size;
        System.out.printf("%.1f", res);
    }
}
