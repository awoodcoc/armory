package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.accessories.MagazineRepository;
import com.awoodcock.armory.data.accessories.OpticRepository;
import com.awoodcock.armory.data.accessories.SlingRepository;
import com.awoodcock.armory.data.ar.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    // READ

    // UPDATE

    // DELETE

}
