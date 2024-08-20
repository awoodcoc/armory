package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.accessories.*;
import com.awoodcock.armory.data.ar.*;
import com.awoodcock.armory.models.accessories.Magazine;
import com.awoodcock.armory.models.accessories.Optic;
import com.awoodcock.armory.models.accessories.Sling;
import com.awoodcock.armory.models.ar.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
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
    public AR addAR(String name, String description, int barrelId,
                    int BCGId, int chargingHandleId, int handguardId,
                    int lowerId, int pistolGripId, int stockId,
                    int trigId, int upperId, int magazineId, int opticId,
                    int slingId) {
        AR ar = new AR();
        ar.setName(name);
        ar.setDescription(description);
        Optional<Barrel> barrel = barrelRepository.findById(barrelId);
        if(barrel.isEmpty()) {
            System.out.println("Invalid barrel: " + barrelId);
        } else {
            Barrel b = barrel.get();
            ar.setBarrel(b);
        }
        Optional<BCG> bcg = bcgRepository.findById(BCGId);
        if(bcg.isEmpty()) {
            System.out.println("Invalid BCG: " + BCGId);
        } else {
            BCG b = bcg.get();
            ar.setBcg(b);
        }
        Optional<ChargingHandle> chargingHandle = chargingHandleRepository.findById(chargingHandleId);
        if(chargingHandle.isEmpty()) {
            System.out.println("Invalid Charging Handle: " + chargingHandleId);
        } else {
            ChargingHandle c = chargingHandle.get();
            ar.setChargingHandle(c);
        }
        Optional<Handguard> handguard = handguardRepository.findById(handguardId);
        if(handguard.isEmpty()) {
            System.out.println("Invalid Handguard: " + handguardId);
        } else {
            Handguard h = handguard.get();
            ar.setHandguard(h);
        }
        Optional<Lower> lower = lowerRepository.findById(lowerId);
        if(lower.isEmpty()) {
            System.out.println("Invalid Lower: " + lowerId);
        } else {
            Lower l = lower.get();
            ar.setLower(l);
        }
        Optional<PistolGrip> pistolGrip = pistolGripRepository.findById(pistolGripId);
        if(pistolGrip.isEmpty()) {
            System.out.println("Invalid Pistol Grip: " + pistolGripId);
        } else {
            PistolGrip p = pistolGrip.get();
            ar.setPistolGrip(p);
        }
        Optional<Stock> stock = stockRepository.findById(stockId);
        if(stock.isEmpty()) {
            System.out.println("Invalid Stock: " + stockId);
        } else {
            Stock s = stock.get();
            ar.setStock(s);
        }
        Optional<Trig> trig = trigRepository.findById(trigId);
        if(trig.isEmpty()) {
            System.out.println("Invalid Trigger: " + trigId);
        } else {
            Trig t = trig.get();
            ar.setTrigger(t);
        }
        Optional<Upper> upper = upperRepository.findById(upperId);
        if(upper.isEmpty()) {
            System.out.println("Invalid Upper: " + upperId);
        } else {
            Upper u = upper.get();
            ar.setUpper(u);
        }
        Optional<Magazine> magazine = magazineRepository.findById(magazineId);
        if(magazine.isEmpty()) {
            System.out.println("Invalid Magazine: " + magazineId);
        } else {
            Magazine m = magazine.get();
            ar.setMagazine(m);
        }
        Optional<Optic> optic = opticRepository.findById(opticId);
        if(optic.isEmpty()) {
            System.out.println("Invalid Optic: " + opticId);
        } else {
            Optic o = optic.get();
            ar.setOptic(o);
        }
        Optional<Sling> sling = slingRepository.findById(slingId);
        if(sling.isEmpty()) {
            System.out.println("Invalid Sling: " + slingId);
        } else {
            Sling s = sling.get();
            ar.setSling(s);
        }
        return arRepository.save(ar) ;
    }

    // READ
    public AR getARbyId(int id) {
        Optional<AR> ar = arRepository.findById(id);
        return ar.orElse(null);
    }

    // UPDATE
    public void updateAR(int id, AR ar) {
        Optional<AR> oldAR = arRepository.findById(id);
        if (oldAR.isEmpty()){
            System.out.println("Invalid AR: " + id);
        } else {
            AR updatedAR = oldAR.get();
            updatedAR.setName(ar.getName());
            updatedAR.setDescription(ar.getDescription());
            updatedAR.setBarrel(ar.getBarrel());
            updatedAR.setBcg(ar.getBcg());
            updatedAR.setChargingHandle(ar.getChargingHandle());
            updatedAR.setHandguard(ar.getHandguard());
            updatedAR.setPistolGrip(ar.getPistolGrip());
            updatedAR.setLower(ar.getLower());
            updatedAR.setStock(ar.getStock());
            updatedAR.setTrigger(ar.getTrigger());
            updatedAR.setUpper(ar.getUpper());
            updatedAR.setMagazine(ar.getMagazine());
            updatedAR.setOptic(ar.getOptic());
            updatedAR.setSling(ar.getSling());
            arRepository.save(updatedAR);
        }
    }
    // DELETE
    public String deleteBarrel(int id) {
        if (arRepository.findById(id).isPresent()) {
            arRepository.deleteById(id);
            return "AR successfully deleted.";
        }
        return "AR not found within database.";
    }
}



