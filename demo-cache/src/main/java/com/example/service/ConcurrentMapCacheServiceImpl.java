package com.example.service;

import com.example.component.AppleComponent;
import com.example.component.PealComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcurrentMapCacheServiceImpl extends AbstractCacheServiceImpl {
    private static final Logger logger = LoggerFactory.getLogger(ConcurrentMapCacheServiceImpl.class.getName());
    private AppleComponent appleComponent;

    private PealComponent pealComponent;

    public ConcurrentMapCacheServiceImpl() {
        logger.info("init ccccccccccccccccccccccccccc");
    }

    public ConcurrentMapCacheServiceImpl(AppleComponent appleComponent, PealComponent pealComponent) {
        this.appleComponent = appleComponent;
        this.pealComponent = pealComponent;
    }

    public AppleComponent getAppleComponent() {
        return appleComponent;
    }

    public void setAppleComponent(AppleComponent appleComponent) {
        this.appleComponent = appleComponent;
    }

    public PealComponent getPealComponent() {
        return pealComponent;
    }

    public void setPealComponent(PealComponent pealComponent) {
        this.pealComponent = pealComponent;
    }










    public void remove(Object key) {
    }


    public void remove(Object key, String tenantId) {
    }


    public void remove(Object key, String tenantId, String structureId) {
    }

    public  void clear(){}
}