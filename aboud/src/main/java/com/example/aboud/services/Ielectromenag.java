package com.example.aboud.services;

import com.example.aboud.model.Electromenager;

import java.util.List;

public interface Ielectromenag {

    void ajouterElectromenag(Electromenager electromenag);

    void supprimerElectromenag(Electromenager electromenag);

    void modifierElectromenag(Electromenager electromenag);

    Electromenager getElectromenagById(Long id);

    List<Electromenager> getAllElectromenag();

    List<Electromenager> getElectromenagByType(String type);

    List<Electromenager> getElectromenagByMarque(String marque);
}
