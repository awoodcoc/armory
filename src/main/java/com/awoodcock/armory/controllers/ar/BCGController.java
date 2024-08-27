package com.awoodcock.armory.controllers.ar;

import com.awoodcock.armory.models.ar.BCG;
import com.awoodcock.armory.service.ar.BCGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("bolt-carrier-groups")
@CrossOrigin
public class BCGController {


    @Autowired
    BCGService bcgService;

    // GET MAPPING
    @GetMapping("{/id}")
    public ResponseEntity<BCG> getBCGById(@PathVariable int id) {
        BCG bcg = bcgService.getBCGById(id);
        return (bcg != null) ? ResponseEntity.ok(bcg) : ResponseEntity.notFound().build();
    }

    @GetMapping("/view-bcgs")
    public List<BCG> viewBCGs() {
        return bcgService.getAllBCGs();
    }

    // POST MAPPING
    @PostMapping("/add")
    public ResponseEntity<BCG> addBarrel(@RequestBody BCG bcg) throws URISyntaxException {
        BCG savedBCG = bcgService.addBCG(bcg);
        return ResponseEntity.created(new URI("/barrels" + savedBCG.getId())).body(savedBCG);
    }

    // DELETE MAPPING
    @DeleteMapping("{/id}")
    public ResponseEntity deleteBCG (@PathVariable int id) {
        bcgService.deleteBCG(id);
        return ResponseEntity.ok().build();
    }


}

