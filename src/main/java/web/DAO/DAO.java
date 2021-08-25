package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class DAO implements DAOi {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Nissan", "X-Trail", 2012));
        carList.add(new Car("Ford", "Fusion", 2008));
        carList.add(new Car("Volvo", "S80", 2005));
        carList.add(new Car("Chevrolet", "lacetti", 2007));
        carList.add(new Car("VAZ", "2106", 1980));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count > 5) {
            count = 5;
        }
        if (count == 0) {
            return carList;
        }
        return new ArrayList<>(carList.subList(0, count));
    }

}
