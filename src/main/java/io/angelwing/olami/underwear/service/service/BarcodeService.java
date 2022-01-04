package io.angelwing.olami.underwear.service.service;

import io.angelwing.olami.underwear.service.model.Barcode;
import io.angelwing.olami.underwear.service.model.UnderwearCollection;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;


    public interface BarcodeService {

        Collection<Barcode> findAll();

        Optional<Barcode> findById(UUID id);

        Barcode save(Barcode barcode);

    }
