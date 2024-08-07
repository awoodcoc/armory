package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.accessories.*;
import com.awoodcock.armory.data.ar.*;
import com.awoodcock.armory.models.ar.AR;
import com.awoodcock.armory.models.ar.Barrel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ARService {

    // REPOSITORY
    private final ARRepository arRepository;

    // AR
    private final BarrelRepository barrelRepository;

    private final BCGRepository bcgRepository;

    private final ChargingHandleRepository chargingHandleRepository;

    private final HandguardRepository handguardRepository;

    private final LowerRepository lowerRepository;

    private final PistolGripRepository pistolGripRepository;

    private final StockRepository stockRepository;

    private final TrigRepository trigRepository;

    private final UpperRepository upperRepository;

    // Accessories
    private final MagazineRepository magazineRepository;

    private final OpticRepository opticRepository;

    private final SlingRepository slingRepository;

    // CONSTRUCTOR
    @Autowired
    public ARService (ARRepository arRepository, BarrelRepository barrelRepository,
                      BCGRepository bcgRepository, ChargingHandleRepository chargingHandleRepository,
                      HandguardRepository handguardRepository, LowerRepository lowerRepository,
                      PistolGripRepository pistolGripRepository, StockRepository stockRepository,
                      TrigRepository trigRepository, UpperRepository upperRepository,
                      MagazineRepository magazineRepository, OpticRepository opticRepository,
                      SlingRepository slingRepository) {
        this.arRepository = arRepository;
        this.barrelRepository = barrelRepository;
        this.bcgRepository = bcgRepository;
        this.chargingHandleRepository = chargingHandleRepository;
        this.handguardRepository = handguardRepository;
        this.lowerRepository = lowerRepository;
        this.pistolGripRepository = pistolGripRepository;
        this.stockRepository = stockRepository;
        this.trigRepository = trigRepository;
        this.upperRepository = upperRepository;
        this.magazineRepository = magazineRepository;
        this.opticRepository = opticRepository;
        this.slingRepository = slingRepository;
    }

    // CRUD OPERATIONS for AR class

    // CREATE
//    public AR addAR(String name, String description, int barrelId,
//                    int BCGId, int chargingHandleId, int handguardId,
//                    int lowerId, int pistolGripId, int stockId,
//                    int trigId, int upperId, int magazineId, int opticId,
//                    int slingId) {
//        AR ar = new AR();
//        ar.setName(name);
//        ar.setDescription(description);
//        Optional<Barrel> barrel = barrelRepository.findById(barrelId);
//        if(barrel.isEmpty()) {
//            System.out.println("Invalid barrel: " + barrelId);
//        } else {
//            Barrel b = barrel.get();
//            ar.setBarrel(b);
//        }
//
//        return ARRepository.save(ar);
//    }

    // READ
    public AR getARbyId(int id) {
        Optional<AR> ar = arRepository.findById(id);
        return ar.orElse(null);
    }

    // UPDATE

    // DELETE
    public String deleteBarrel(int id) {
        if (arRepository.findById(id).isPresent()) {
            arRepository.deleteById(id);
            return "AR successfully deleted.";
        }
        return "AR not found within database.";
    }
}



