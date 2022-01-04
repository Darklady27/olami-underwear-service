package io.angelwing.olami.underwear.service.service;

import io.angelwing.olami.underwear.service.model.UnderwearMake;
import io.angelwing.olami.underwear.service.repository.UnderwearMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class UnderwearMakeServiceImpl implements UnderwearMakeService {

    private final UnderwearMakeRepository  underwearMakeRepository;

    @Autowired
    public UnderwearMakeServiceImpl(UnderwearMakeRepository underwearMakeRepository) {
        this .underwearMakeRepository = underwearMakeRepository;
    }
    @Override
    public Collection<UnderwearMake> findAll() {
        return underwearMakeRepository.findAll();
    }

    @Override
    public Optional<UnderwearMake> findById(UUID id) {
        return underwearMakeRepository.findById(id);
    }

    @Override
    public UnderwearMake save(UnderwearMake underwearMake) {
        return underwearMakeRepository.save(underwearMake);
    }





}
