package io.angelwing.olami.underwear.service.repository;

import io.angelwing.olami.underwear.service.model.UnderwearMake;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface UnderwearMakeRepository {

    Collection<UnderwearMake> findAll();

    Optional<UnderwearMake> findById(UUID id);

    UnderwearMake save(UnderwearMake underwearMake);
}
