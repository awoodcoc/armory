package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import com.awoodcock.armory.models.accessories.Magazine;
import com.awoodcock.armory.models.accessories.Optic;
import com.awoodcock.armory.models.accessories.Sling;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AR extends AbstractEntity {

    // PROPERTIES
    @ManyToOne
    @JoinColumn(name = "barrel_id")
    private Barrel barrel;

    @ManyToOne
    @JoinColumn(name = "bcg_id")
    private BCG bcg;

    @ManyToOne
    @JoinColumn(name = "chargingHandle_id")
    private ChargingHandle chargingHandle;

    @ManyToOne
    @JoinColumn(name = "handguard_id")
    private Handguard handguard;

    @ManyToOne
    @JoinColumn(name = "lower_id")
    private Lower lower;

    @ManyToOne
    @JoinColumn(name = "pistolGrip_id")
    private  PistolGrip pistolGrip;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "trigger_id")
    private Trigger trigger;

    @ManyToOne
    @JoinColumn(name = "upper_id")
    private Upper upper;

    @ManyToOne
    @JoinColumn(name = "magazine_id")
    private Magazine magazine;

    @ManyToOne
    @JoinColumn(name = "optic_id")
    private Optic optic;

    @ManyToOne
    @JoinColumn(name = "sling_id")
    private Sling sling;

    // CONSTRUCTORS
    public AR (){}

    public AR(Barrel barrel, BCG bcg, ChargingHandle chargingHandle,
              Handguard handguard, Lower lower, PistolGrip pistolGrip,
              Stock stock, Trigger trigger, Upper upper, Magazine magazine,
              Optic optic, Sling sling) {
        this.barrel = barrel;
        this.bcg = bcg;
        this.chargingHandle = chargingHandle;
        this.handguard = handguard;
        this.lower = lower;
        this.pistolGrip = pistolGrip;
        this.stock = stock;
        this.trigger = trigger;
        this.upper = upper;
        this.magazine = magazine;
        this.optic = optic;
        this.sling = sling;
    }

    // GETTERS AND SETTERS
    public Barrel getBarrel() {
        return barrel;
    }

    public void setBarrel(Barrel barrel) {
        this.barrel = barrel;
    }

    public BCG getBcg() {
        return bcg;
    }

    public void setBcg(BCG bcg) {
        this.bcg = bcg;
    }

    public ChargingHandle getChargingHandle() {
        return chargingHandle;
    }

    public void setChargingHandle(ChargingHandle chargingHandle) {
        this.chargingHandle = chargingHandle;
    }

    public Handguard getHandguard() {
        return handguard;
    }

    public void setHandguard(Handguard handguard) {
        this.handguard = handguard;
    }

    public Lower getLower() {
        return lower;
    }

    public void setLower(Lower lower) {
        this.lower = lower;
    }

    public PistolGrip getPistolGrip() {
        return pistolGrip;
    }

    public void setPistolGrip(PistolGrip pistolGrip) {
        this.pistolGrip = pistolGrip;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    public Upper getUpper() {
        return upper;
    }

    public void setUpper(Upper upper) {
        this.upper = upper;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public Optic getOptic() {
        return optic;
    }

    public void setOptic(Optic optic) {
        this.optic = optic;
    }

    public Sling getSling() {
        return sling;
    }

    public void setSling(Sling sling) {
        this.sling = sling;
    }
}
