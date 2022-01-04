package io.angelwing.olami.underwear.service.repository;

import io.angelwing.olami.underwear.service.model.UnderwearCollection;
import io.angelwing.olami.underwear.service.model.UnderwearMake;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UnderwearCollectionRepositoryImpl  implements UnderwearCollectionRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<UnderwearCollection> findAll() {
        return entityManager.createQuery("from UnderwearCollection" , UnderwearCollection.class).getResultList();
    }

    @Override
    public Optional<UnderwearCollection> findById(final UUID id) {
        return Optional.ofNullable(entityManager.find(UnderwearCollection.class , id));
    }

    @Override
    public UnderwearCollection save(final UnderwearCollection underwearCollection) {
        entityManager.persist(underwearCollection);
        entityManager.flush();
        return underwearCollection;

    }
}
