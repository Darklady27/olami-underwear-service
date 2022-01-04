package io.angelwing.olami.underwear.service.repository;

import io.angelwing.olami.underwear.service.model.Barcode;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface BarcodeRepository {

    Collection<Barcode> findAll();

    Optional<Barcode> findById(UUID id);

    Barcode save(Barcode barcode);
}
