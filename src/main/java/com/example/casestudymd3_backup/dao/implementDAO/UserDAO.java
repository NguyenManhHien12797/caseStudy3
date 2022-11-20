package com.example.casestudymd3_backup.dao.implementDAO;

import com.example.casestudymd3_backup.config.ConnectionDB;
import com.example.casestudymd3_backup.dao.interfaceDAO.IManagerDAO;
import com.example.casestudymd3_backup.model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IManagerDAO<Users> {
    Connection connection = ConnectionDB.getConnect();

    @Override
    public List<Users> selectAll() throws SQLException, ClassNotFoundException {
        List<Users> usersList = new ArrayList<>();
        String QUERY = "SELECT * FROM account;";
        try(PreparedStatement statement = connection.prepareStatement(QUERY)){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){

            }
        }
        return null;
    }

    @Override
    public void create(Users users) {


    }


    public boolean checkUser(){
        boolean isExist= false;

        return isExist;
    }
    @Override
    public Users select(int idg_num) {
        return null;
    }

    @Override
    public void update(int id, Users users) {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public void update(Users o) {

    }

    @Override
    public List<Users> search(String search) {
        return null;
    }
}
