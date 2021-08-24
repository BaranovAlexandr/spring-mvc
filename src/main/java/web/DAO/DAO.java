package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Nissan", "X-Trail", 2012));
        carList.add(new Car("Ford", "Fusion", 2008));
        carList.add(new Car("Volvo", "S80", 2005));
        carList.add(new Car("Chevrolet", "lacetti", 2007));
        carList.add(new Car("VAZ", "2106", 1980));
    }

    public List<Car> getCarList(int count) {
        if (count > 5) {
            count = 5;
        }
        return new ArrayList<>(carList.subList(0, count));
    }

}
