package io.angelwing.olami.underwear.service.repository;

import io.angelwing.olami.underwear.service.model.UnderwearMake;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UnderwearMakeRepositoryImpl implements UnderwearMakeRepository{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Collection<UnderwearMake> findAll() {
        return entityManager.createQuery("from UnderwearMake" , UnderwearMake.class).getResultList();
    }

    @Override
    public Optional<UnderwearMake> findById(final UUID id) {
        return Optional.ofNullable(entityManager.find(UnderwearMake.class , id));
    }

    @Override
    public UnderwearMake save(final UnderwearMake underwearMake) {
        entityManager.persist(underwearMake);
        entityManager.flush();
        return underwearMake;
    }

}
