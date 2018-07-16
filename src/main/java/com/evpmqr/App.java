package com.evpmqr;

import com.evpmqr.db.model.Employee;
import com.evpmqr.db.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Employee person = new Employee("Eric", "Vue", 1);

        session.save(person);
        session.getTransaction().commit();
        List<?> results = session.createQuery("FROM Employee as E").list();
        results.forEach(l -> System.out.println(l.toString()));
        HibernateUtil.shutdown();
    }
}
