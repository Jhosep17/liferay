/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package edu.ecopharmacy.nttdata.service.impl;

import com.liferay.portal.aop.AopService;

import java.util.List;

import edu.ecopharmacy.nttdata.model.Inventory;
import edu.ecopharmacy.nttdata.service.base.InventoryLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the inventory local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>edu.ecopharmacy.nttdata.service.InventoryLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InventoryLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=edu.ecopharmacy.nttdata.model.Inventory",
	service = AopService.class
)
public class InventoryLocalServiceImpl extends InventoryLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>edu.ecopharmacy.nttdata.service.InventoryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>edu.ecopharmacy.nttdata.service.InventoryLocalServiceUtil</code>.
	 */
	
	public Inventory saveInventory(long productId,long sedeId,int stock) {
		long inventoryId = counterLocalService.increment(Inventory.class.getName());
		Inventory inventory = super.createInventory(inventoryId);
		inventory.setProductId(productId);
		inventory.setSedeId(sedeId);
		inventory.setStock(stock);
		return super.addInventory(inventory);
	}
	
	public List<Inventory> getListInventorySede(long sede){
		return inventoryPersistence.findBySedeId(sede);
	}
	


}