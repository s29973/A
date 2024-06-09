import java.util.ArrayList;
import java.util.Collections;

public class MainCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("ModelA", 2010));
        cars.add(new Car("ModelB", 2012));
        cars.add(new Car("ModelC", 2011));
        cars.add(new Car("ModelD", 2013));
        cars.add(new Car("ModelE", 2009));
        cars.add(new Car("ModelF", 2014));
        cars.add(new Car("ModelG", 2008));
        cars.add(new Car("ModelH", 2007));
        cars.add(new Car("ModelI", 2016));
        cars.add(new Car("ModelJ", 2015));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
