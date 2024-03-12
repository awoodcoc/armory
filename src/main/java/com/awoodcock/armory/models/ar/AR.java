package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import com.awoodcock.armory.models.accessories.Magazine;
import com.awoodcock.armory.models.accessories.Optic;
import com.awoodcock.armory.models.accessories.Sling;

public class AR extends AbstractEntity {

    // PROPERTIES
    private Barrel barrel;

    private BCG bcg;

    private ChargingHandle chargingHandle;

    private Handguard handguard;

    private Lower lower;

    private  PistolGrip pistolGrip;

    private Stock stock;

    private Trigger trigger;

    private Upper upper;

    private Magazine magazine;

    private Optic optic;

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
