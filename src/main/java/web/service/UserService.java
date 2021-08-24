package web.service;

import web.DAO.DAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final DAO dao = new DAO();

    public List<Car> getCars(int count) {
        return dao.getCarList(count);
    }
}
