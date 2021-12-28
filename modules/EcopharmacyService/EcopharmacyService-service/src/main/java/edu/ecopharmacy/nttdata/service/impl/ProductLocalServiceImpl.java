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
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

import edu.ecopharmacy.nttdata.model.Product;
import edu.ecopharmacy.nttdata.service.base.ProductLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>edu.ecopharmacy.nttdata.service.ProductLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=edu.ecopharmacy.nttdata.model.Product",
	service = AopService.class
)
public class ProductLocalServiceImpl extends ProductLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>edu.ecopharmacy.nttdata.service.ProductLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>edu.ecopharmacy.nttdata.service.ProductLocalServiceUtil</code>.
	 */
	
	public Product saveProduct(String name,String description,String category, Double price, String image) {
		long productId = counterLocalService.increment(Product.class.getName());
		Product product = super.createProduct(productId);
		product.setName(name);
		product.setDescription(description);
		product.setCategory(category);
		product.setPrice(price);
		product.setImages(image);
		if(!Validator.isNull(name)) {
			System.out.println(name);
			System.out.println(description);
			System.out.println(category);
			System.out.println(price);
			System.out.println(image);
		}
		return  super.addProduct(product);
	}
	
	
	
	public List<Product> getListProduct(String name){
		return productPersistence.findByProductName(name);
	}
}