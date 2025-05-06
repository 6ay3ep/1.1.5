package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl udhi = new UserDaoHibernateImpl();
        udhi.saveUser("Bob", "Doe", (byte) 22);
        List<User> users = udhi.getAllUsers();
        users.forEach(System.out::println);
    }
}
