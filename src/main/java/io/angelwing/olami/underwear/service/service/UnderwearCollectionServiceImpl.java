package io.angelwing.olami.underwear.service.service;

import io.angelwing.olami.underwear.service.model.UnderwearCollection;
import io.angelwing.olami.underwear.service.model.UnderwearMake;
import io.angelwing.olami.underwear.service.repository.UnderwearCollectionRepository;
import io.angelwing.olami.underwear.service.repository.UnderwearMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class UnderwearCollectionServiceImpl implements UnderwearCollectionService {


        private final UnderwearCollectionRepository underwearCollectionRepository;

        @Autowired
        public UnderwearCollectionServiceImpl(UnderwearCollectionRepository underwearCollectionRepository) {
            this .underwearCollectionRepository = underwearCollectionRepository;
        }

        @Override
        public Collection<UnderwearCollection> findAll() {
            return underwearCollectionRepository.findAll();
        }

        @Override
        public Optional<UnderwearCollection> findById(UUID id) {
                return underwearCollectionRepository.findById(id);
        }

        @Override
        public UnderwearCollection save(UnderwearCollection underwearCollection) {
                return underwearCollectionRepository.save(underwearCollection);
        }
}
