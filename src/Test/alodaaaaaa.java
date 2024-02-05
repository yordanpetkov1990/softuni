package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class alodaaaaaa {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>(List.of(1, 2, 3, 4, 5)));

        Thread thread1 = new Thread(() -> {

                list.add(6);

        });

        Thread thread2 = new Thread(() -> {
                list.add(7);

        });

        Thread thread3 = new Thread(() -> {

                list.add(8);


        });

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println(list);



    }
}
