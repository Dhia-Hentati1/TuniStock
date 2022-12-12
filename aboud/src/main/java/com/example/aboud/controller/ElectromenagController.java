package com.example.aboud.controller;


import com.example.aboud.model.Electromenager;
import com.example.aboud.services.ElectromenagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ElectromenagController {

    @Autowired
    ElectromenagService ielectromenag;

    @PostMapping("/addElectromenag")
    public void addElectromenag(@RequestBody Electromenager electromenag){
        ielectromenag.ajouterElectromenag(electromenag);
    }


    @DeleteMapping("/deleteElectromenag/{id}")
    public void deleteElectromenag(@PathVariable Long id){
        Electromenager electromenag = ielectromenag.getElectromenagById(id);
        ielectromenag.supprimerElectromenag(electromenag);
    }

    @GetMapping("/getElectromenagById/{id}")
    public Electromenager getElectromenagById(@PathVariable Long id){
        return ielectromenag.getElectromenagById(id);
    }



    @GetMapping("/getElectromenagByType/{type}")
    public Iterable<Electromenager> getElectromenagByType(@PathVariable String type){
        return ielectromenag.getElectromenagByType(type);
    }

    @PutMapping("/updateElectromenag")
    public void updateElectromenag(@RequestBody Electromenager electromenag){
        ielectromenag.modifierElectromenag(electromenag);
    }

    @GetMapping("/getAllElectromenag")
    public Iterable<Electromenager> getAllElectromenag(){
        return ielectromenag.getAllElectromenag();
    }



    @GetMapping("/getElectromenagByMarque/{marque}")
    public Iterable<Electromenager> getElectromenagByMarque(@PathVariable String marque){
        return ielectromenag.getElectromenagByMarque(marque);
    }












}
