package io.angelwing.olami.underwear.service.service;

import io.angelwing.olami.underwear.service.model.UnderwearCollection;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface UnderwearCollectionService {

        Collection<UnderwearCollection> findAll();

        Optional<UnderwearCollection> findById(UUID id);

        UnderwearCollection save(UnderwearCollection underwearCollection);
    }
