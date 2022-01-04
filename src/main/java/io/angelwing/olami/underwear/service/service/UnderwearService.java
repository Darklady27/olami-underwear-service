package io.angelwing.olami.underwear.service.service;

import io.angelwing.olami.underwear.service.model.Underwear;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface UnderwearService {

  Collection<Underwear> findAll();

  Optional<Underwear> findById(UUID id);

  Underwear save(Underwear underwear);
}
