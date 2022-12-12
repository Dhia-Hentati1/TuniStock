package com.example.aboud.services;


import com.example.aboud.model.Electromenager;
import com.example.aboud.repository.ElectromenagRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectromenagService implements Ielectromenag {

    @Autowired
    ElectromenagRepository electromenagRepository;


    @Override
    public void ajouterElectromenag(Electromenager electromenag) {
        electromenagRepository.save(electromenag);
    }

    @Override
    public void supprimerElectromenag(Electromenager electromenag) {
        electromenagRepository.delete(electromenag);
    }

    @Override
    public void modifierElectromenag(Electromenager electromenag) {
        electromenagRepository.save(electromenag);
    }

    @Override
    public Electromenager getElectromenagById(Long id) {
        return electromenagRepository.findById(id).get();
    }

    @Override
    public List<Electromenager> getAllElectromenag() {
        return electromenagRepository.findAll();
    }

    @Override
    public List<Electromenager> getElectromenagByType(String type) {
        return electromenagRepository.findByType(type);
    }


    @Override
    public List<Electromenager> getElectromenagByMarque(String marque) {
        return electromenagRepository.findByMarque(marque);
    }








}
