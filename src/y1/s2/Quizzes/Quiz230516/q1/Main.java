package y1.s2.Quizzes.Quiz230516.q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] h) {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new X1BmwCar());
        list.add(new X6BmwCar());
        list.add(new X1BmwCar());
        list.add(new X6BmwCar());

        for (int i = 0; i < list.size(); i++) {
            list.get(i).drive();
        }
    }
}
