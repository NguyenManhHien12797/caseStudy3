package com.example.casestudymd3_backup.dao.interfaceDAO;

import java.sql.SQLException;
import java.util.List;

public interface ILoginDAO<E> {
    List<E> selectAll() throws SQLException, ClassNotFoundException;


    E select(int id_num);



    E searchAccount(String name,String pass);

}
