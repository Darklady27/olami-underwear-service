package io.angelwing.olami.underwear.service.repository;

import io.angelwing.olami.underwear.service.model.Underwear;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UnderwearRepositoryImpl implements UnderwearRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<Underwear> findAll() {
        return entityManager.createQuery("from Underwear" , Underwear.class).getResultList();
    }

    @Override
    public Optional<Underwear> findById(final UUID id) {
        return Optional.ofNullable(entityManager.find(Underwear.class , id));
    }

    @Override
    public Underwear save(final Underwear underwear) {
        entityManager.persist(underwear);
        entityManager.flush();
        return underwear;
    }
}
