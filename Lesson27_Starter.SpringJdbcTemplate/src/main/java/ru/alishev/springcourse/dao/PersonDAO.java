package ru.alishev.springcourse.dao;

import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class PersonDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


@Transactional
    public List<Person> index() {
        Session session = sessionFactory.getCurrentSession();

    return session.createQuery("select p from Person p", Person.class).getResultList();


    }
    @Transactional (readOnly = true)
    public Person show(int id) {
        Session session = sessionFactory.getCurrentSession();
        return null;
    }

    public void save(Person person) {

    }

    public void update(int id, Person updatedPerson) {

    }

    public void delete(int id) {

    }
}
