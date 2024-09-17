package com.awoodcock.armory.controllers.ar;

import com.awoodcock.armory.models.ar.ChargingHandle;
import com.awoodcock.armory.service.ar.ChargingHandleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("charging-handles")
@CrossOrigin
public class ChargingHandleController {

    @Autowired
    ChargingHandleService chargingHandleService;

    // GET MAPPING
    @GetMapping("{/id}")
    public ResponseEntity<ChargingHandle> getChargingHandleById(@PathVariable int id) {
        ChargingHandle chargingHandle = chargingHandleService.getChargingHandleById(id);
        return (chargingHandle != null) ? ResponseEntity.ok(chargingHandle) : ResponseEntity.notFound().build();
    }

}
