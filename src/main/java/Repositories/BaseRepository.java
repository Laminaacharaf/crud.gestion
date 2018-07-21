/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import static com.rintio.commons.constants.DatabaseConstants.QUERY_PREFIX;
import com.rintio.commons.models.Criterias;
import com.rintio.commons.utils.NativeQueryResultsMapper;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author ATANDA
 * @param <T>
 */
//ON GERE LES METHODES QUI ONT DES PROPRIETES EN COMMUNS
public class BaseRepository<T> {

    private EntityManager em;
    private String unitPersistence;
    private EntityManagerFactory emf;
    private Class entityClass;

    public BaseRepository() {

    }

    public BaseRepository(String unitPersistence, Class c) {
        this.unitPersistence = unitPersistence;
        emf = Persistence.createEntityManagerFactory(this.unitPersistence);
        this.em = emf.createEntityManager();
        this.entityClass = c;
    }

    public EntityManager getEntityManager() {
        return this.em;
    }

    public Boolean create(T entity) throws SQLException {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(entity);
        getEntityManager().getTransaction().commit();
        return true;
    }

    public void delete(T type) {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(type);
        getEntityManager().getTransaction().commit();

    }

    public boolean deleteById(int id) {
        this.getEntityManager().getTransaction().begin();
        getEntityManager().remove(getEntityManager().find(entityClass, id));
        getEntityManager().getTransaction().commit();
        return true;
    }

    public List<T> findByProperty(String propertyName, Object value) throws SQLException {

        String className = entityClass.getSimpleName();
        String str = "select obj from " + className + " obj where obj." + propertyName + "=:param";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("param", value);
        List<T> result = query.getResultList();
        return result;
    }

    public List<T> findAll() {

        String className = entityClass.getSimpleName();
        String str = "select obj FROM " + className + " obj";
        Query query = getEntityManager().createQuery(str);
        List<T> result = query.getResultList();
        return result;
    }

    public void update(T t) {
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(t);
        getEntityManager().getTransaction().commit();
    }

    public List<T> getDataByCriteria(Criterias criterias, String entityPrefix) {
        String request = criterias.getAsStringQuery(entityPrefix);
        String className = entityClass.getSimpleName();

        String s = "SELECT " + entityPrefix + " FROM " + className + " " + entityPrefix + " WHERE " + request;
        Query query = getEntityManager().createQuery(s);
        List<T> result = query.getResultList();
        return result;
    }

    public List<T> getDataByCriteria(Criterias criterias) {
        return getDataByCriteria(criterias, QUERY_PREFIX);
    }

    public List<T> getDataByCriteria(Criterias criterias, String entityPrefix, int page, int size) {
        String request = criterias.getAsStringQuery(entityPrefix);
        String className = entityClass.getSimpleName();

        String s = "SELECT " + entityPrefix + " FROM " + className + " " + entityPrefix + " WHERE " + request;
        Query query = getEntityManager().createQuery(s);
        query.setFirstResult(page);
        query.setMaxResults(size);
        List<T> result = query.getResultList();
        return result;
    }

    public List<T> getDataByCriteria(Criterias criterias, int page, int size) {
        return getDataByCriteria(criterias, QUERY_PREFIX, page, size);
    }

    public List<T> getDataByCriteria(Criterias criterias, String entityPrefix, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException, com.rintio.commons.exceptions.DatabaseException {
        String request = criterias.getAsStringQuery(entityPrefix);
        String fullClassname = entityClass.getName();
        String className = entityClass.getSimpleName();

        String selectedFields = "SELECT ";

        for (int i = 0; i < fields.size(); i++) {
            String field = fields.get(i);
            if (i != fields.size() - 1) {
                selectedFields = selectedFields + " " + entityPrefix + "." + field + ", ";
            } else {
                selectedFields = selectedFields + " " + entityPrefix + "." + field;
            }
        }

        selectedFields = selectedFields + " FROM " + className + " " + entityPrefix + " WHERE " + request;

        Query query = getEntityManager().createQuery(selectedFields);
        List<Object[]> objects = query.getResultList();

        List<T> results = NativeQueryResultsMapper.map(objects, fields, entityClass);

        return results;
    }

    public List<T> getDataByCriteria(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException, com.rintio.commons.exceptions.DatabaseException {
        return getDataByCriteria(criterias, QUERY_PREFIX, fields);
    }

    public List<T> getDataByCriteria(String entityPrefix, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException, com.rintio.commons.exceptions.DatabaseException {
        String fullClassname = entityClass.getName();
        String className = entityClass.getSimpleName();

        String selectedFields = "SELECT ";

        for (String field : fields) {
            selectedFields = selectedFields + ", " + entityPrefix + "." + field;
        }

        selectedFields = selectedFields + " FROM " + className + " " + entityPrefix;

        Query query = getEntityManager().createQuery(selectedFields);
        List<Object[]> objects = query.getResultList();

        List<T> results = NativeQueryResultsMapper.map(objects, fields, entityClass);

        return results;
    }

    public List<T> getDataByCriteria(List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException, com.rintio.commons.exceptions.DatabaseException {
        return getDataByCriteria(QUERY_PREFIX, fields);
    }

    public List<T> getDataByCriteria(Criterias criterias, String entityPrefix, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException, com.rintio.commons.exceptions.DatabaseException {
        String request = criterias.getAsStringQuery(entityPrefix);
        String className = entityClass.getSimpleName();

        String selectedFields = "SELECT ";

        for (String field : fields) {
            selectedFields = selectedFields + ", " + entityPrefix + "." + field;
        }

        selectedFields = selectedFields + " FROM " + className + " " + entityPrefix + " WHERE " + request;

        Query query = getEntityManager().createQuery(selectedFields);
        query.setFirstResult(page);
        query.setMaxResults(size);
        List<Object[]> objects = query.getResultList();

        List<T> results = NativeQueryResultsMapper.map(objects, fields, entityClass);

        return results;
    }

    public List<T> getDataByCriteria(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException, com.rintio.commons.exceptions.DatabaseException {
        return getDataByCriteria(criterias, QUERY_PREFIX, fields, page, size);
    }

}
