package io.angelwing.olami.underwear.service.repository;

import io.angelwing.olami.underwear.service.model.Barcode;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Repository
public class BarcodeRepositoryImpl implements BarcodeRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<Barcode> findAll() {
        return entityManager.createQuery("from Barcode" , Barcode.class).getResultList();
    }

    @Override
    public Optional<Barcode> findById(UUID id) {
        return Optional.ofNullable(entityManager.find(Barcode.class , id));
    }

    @Override
    public Barcode save(Barcode barcode) {
        entityManager.persist(barcode);
        entityManager.flush();
        return barcode;
    }

}
