package com.example.casestudymd3_backup.dao.interfaceDAO;



import com.example.casestudymd3_backup.model.Users;

import java.util.List;

public interface IUserDAO {
    List<Users> getAll();

    void add(Users users);

    boolean update(int id, Users users);

    boolean delete(int id);

    Users findById(int id);

    public List<Users> selectAllUsers();
    String findPassByAccount(String account, String email);
    boolean updateByUser(String account,Users users);
    int findByUser(Users users);
}
