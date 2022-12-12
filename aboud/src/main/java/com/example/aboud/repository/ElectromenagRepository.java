package com.example.aboud.repository;

import com.example.aboud.model.Electromenager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElectromenagRepository extends JpaRepository<Electromenager,Long > {
    List<Electromenager> findByType(String type);

    List<Electromenager> findByMarque(String marque);
}
