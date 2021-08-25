package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.DAO;
import web.DAO.DAOi;
import web.model.Car;

import java.util.List;

@Component
public class UserService {

    private final DAOi dao;

    @Autowired
    public UserService(DAOi dao) {
        this.dao = dao;
    }

    public List<Car> getCars(int count) {
        return dao.getCarList(count);
    }
}
