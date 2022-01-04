package io.angelwing.olami.underwear.service.service;

import io.angelwing.olami.underwear.service.model.Underwear;
import io.angelwing.olami.underwear.service.repository.UnderwearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class UnderwearServiceImpl implements UnderwearService {

    private final UnderwearRepository underwearRepository;

    @Autowired
    public UnderwearServiceImpl(UnderwearRepository underwearRepository) {
        this.underwearRepository = underwearRepository;
    }

    @Override
    public Collection<Underwear> findAll() {
        return underwearRepository.findAll();
    }

    @Override
    public Optional<Underwear> findById(UUID id) {
        return underwearRepository.findById(id);
    }

    @Override
    public Underwear save(Underwear underwear) {
        return underwearRepository.save(underwear);
    }
}
