package dev.java.db.daos;

import dev.java.db.model.TMFeedback;
import org.hibernate.Session;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class TMFeedbackDao extends AbstractDao<TMFeedback> {
    public TMFeedbackDao(Session session) {
        super(session);
    }

    @Override
    public List<TMFeedback> getSortedEntitiesPage(int pageNumber, String sortedField,
                                                  boolean order, int itemsNumberInPage) {
        CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();
        CriteriaQuery<TMFeedback> query = criteriaBuilder.createQuery(TMFeedback.class);
        Root<TMFeedback> root = query.from(TMFeedback.class);

        if (order) {
            query = query.select(root).orderBy(criteriaBuilder.asc(root.get(sortedField)));
        } else {
            query = query.select(root).orderBy(criteriaBuilder.desc(root.get(sortedField)));
        }

        TypedQuery<TMFeedback> typedQuery = getSession().createQuery(query);
        typedQuery.setFirstResult((pageNumber - 1) * itemsNumberInPage);
        typedQuery.setMaxResults(itemsNumberInPage);

        return typedQuery.getResultList();
    }

    @Override
    public List<TMFeedback> getFilteredEntitiesPage(String... params) {
        return null;
    }

    @Override
    public TMFeedback getEntityById(long id) {
        return getSession().get(TMFeedback.class, id);
    }
}
