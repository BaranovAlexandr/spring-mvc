package web.DAO;

import web.model.Car;

import java.util.List;

public interface DAOi {
    public List<Car> getCarList(int count);
}
