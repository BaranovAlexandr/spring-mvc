package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class UserSerice {

    public List<Car> cars(int i) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Nissan", "X-Trail", 2012));
        carList.add(new Car("Ford", "Fusion", 2008));
        carList.add(new Car("Volvo", "S80", 2005));
        carList.add(new Car("Chevrolet", "lacetti", 2007));
        carList.add(new Car("VAZ", "2106", 1980));
        if (i > 5) {
            i = 5;
        }
        return  new ArrayList<>(carList.subList(0,i));
    }

    public static void main(String[] args) {
       List<Car> x = new UserSerice().cars(7);
       for (Car car : x) {
           System.out.println(car);
       }


    }
}
