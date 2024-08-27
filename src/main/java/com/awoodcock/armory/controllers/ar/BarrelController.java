package com.awoodcock.armory.controllers.ar;

import com.awoodcock.armory.models.ar.Barrel;
import com.awoodcock.armory.service.ar.BarrelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("barrels")
@CrossOrigin
public class BarrelController {

    @Autowired
    BarrelService barrelService;

    // GET MAPPING
    @GetMapping("{/id}")
    public ResponseEntity<Barrel> getBarrelById(@PathVariable int id) {
        Barrel barrel = barrelService.getBarrelById(id);
        return (barrel != null) ? ResponseEntity.ok(barrel) : ResponseEntity.notFound().build();
    }

    @GetMapping("/view-barrels")
    public List<Barrel> viewBarrels() {
        return barrelService.getAllBarrels();
    }

    // POST MAPPING
    @PostMapping("/add")
    public ResponseEntity<Barrel> addBarrel(@RequestBody Barrel barrel) throws URISyntaxException {
        Barrel savedBarrel = barrelService.addBarrel(barrel);
        return ResponseEntity.created(new URI("/barrels" + savedBarrel.getId())).body(savedBarrel);
    }

    // DELETE MAPPING
    @DeleteMapping("{/id}")
    public ResponseEntity deleteBarrel (@PathVariable int id) {
        barrelService.deleteBarrel(id);
        return ResponseEntity.ok().build();
    }

}
