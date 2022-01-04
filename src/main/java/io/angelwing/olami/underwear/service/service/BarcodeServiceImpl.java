package io.angelwing.olami.underwear.service.service;

import io.angelwing.olami.underwear.service.model.Barcode;
import io.angelwing.olami.underwear.service.repository.BarcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

    @Service
    public class BarcodeServiceImpl implements BarcodeService {

        private final BarcodeRepository BarcodeRepository;

        @Autowired
        public BarcodeServiceImpl(BarcodeRepository BarcodeRepository) {
            this.BarcodeRepository = BarcodeRepository;
        }

        @Override
        public Collection<Barcode> findAll() {
            return BarcodeRepository.findAll();
        }

        @Override
        public Optional<Barcode> findById(UUID id) {
            return BarcodeRepository.findById(id);
        }

        @Override
        public Barcode save(Barcode barcode) {
            return BarcodeRepository.save(barcode);
        }

    }
