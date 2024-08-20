package db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import model.CheckAreaBean;

import java.util.Collection;

public class CheckDAOImpl implements CheckDAO {
    private jakarta.persistence.EntityManager entityManager = JPAUtils.getFactory().createEntityManager();

    @Override
    public void addNewResult(CheckAreaBean result) {
        entityManager = JPAUtils.getFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(result);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void updateResult(Long bus_id, CheckAreaBean result) {
        entityManager = JPAUtils.getFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(result);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public CheckAreaBean getResultById(Long result_id) {
        entityManager = JPAUtils.getFactory().createEntityManager();
        try {
            return entityManager.find(CheckAreaBean.class, result_id);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Collection<CheckAreaBean> getResults() {
        entityManager = JPAUtils.getFactory().createEntityManager();
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<CheckAreaBean> criteriaQuery = criteriaBuilder.createQuery(CheckAreaBean.class);
            Root<CheckAreaBean> root = criteriaQuery.from(CheckAreaBean.class);
            criteriaQuery.select(root);
            return entityManager.createQuery(criteriaQuery).getResultList();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void deleteResult(CheckAreaBean result) {
        entityManager = JPAUtils.getFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.contains(result) ? result : entityManager.merge(result));
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void clearResults() {
        entityManager = JPAUtils.getFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.createQuery("DELETE FROM CheckAreaBean").executeUpdate();
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }
}
