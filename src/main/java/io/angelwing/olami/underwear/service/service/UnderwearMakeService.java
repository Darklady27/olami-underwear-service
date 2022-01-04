package io.angelwing.olami.underwear.service.service;

import io.angelwing.olami.underwear.service.model.UnderwearMake;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface UnderwearMakeService {

    Collection<UnderwearMake> findAll();

    Optional<UnderwearMake> findById(UUID id);

    UnderwearMake save(UnderwearMake underwearMake);
}
