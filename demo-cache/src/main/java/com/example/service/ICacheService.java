package com.example.service;

public interface ICacheService extends IBaseCacheService {
	
	public abstract void remove(Object key);

	public abstract void remove(Object key, String tenantId);

	public abstract void remove(Object key, String tenantId, String structureId);
	
}