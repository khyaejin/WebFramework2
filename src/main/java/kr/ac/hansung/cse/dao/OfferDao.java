package kr.ac.hansung.cse.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import kr.ac.hansung.cse.model.Offer;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class OfferDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Offer getOffer(String name) {
        return entityManager.createQuery("SELECT o FROM Offer o WHERE o.name = :name", Offer.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    // R
    public Offer getOffer(int id) {
        return entityManager.find(Offer.class, id);
    }

    // R
    public List<Offer> getOffers() {
        return entityManager.createQuery("SELECT o FROM Offer o", Offer.class)
                .getResultList();
    }

    // C
    public void insert(Offer offer) {
        entityManager.persist(offer);
    }

    // U
    public void update(Offer offer) {
        entityManager.merge(offer);
    }

    // D
    public void delete(int id) {
        Offer offer = entityManager.find(Offer.class, id);
        if (offer != null) {
            entityManager.remove(offer);
        }
    }
}