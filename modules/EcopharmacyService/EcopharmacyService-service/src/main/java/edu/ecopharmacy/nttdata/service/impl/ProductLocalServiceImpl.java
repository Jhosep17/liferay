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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import edu.ecopharmacy.nttdata.bean.ProductBean;
import edu.ecopharmacy.nttdata.model.Category;
import edu.ecopharmacy.nttdata.model.Product;
import edu.ecopharmacy.nttdata.service.base.ProductLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>edu.ecopharmacy.nttdata.service.ProductLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductLocalServiceBaseImpl
 */
@Component(property = "model.class.name=edu.ecopharmacy.nttdata.model.Product", service = AopService.class)
public class ProductLocalServiceImpl extends ProductLocalServiceBaseImpl {
	private static final Log LOG = LogFactoryUtil.getLog(ProductLocalServiceImpl.class);

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>edu.ecopharmacy.nttdata.service.ProductLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>edu.ecopharmacy.nttdata.service.ProductLocalServiceUtil</code>.
	 */
//ServiceContext serviceContext) throws PortalException
	public Product saveProduct(String name, String description, long category, Double price, String image) {
		LOG.info("Agregando producto en la base de datos");
		long productId = counterLocalService.increment(Product.class.getName());
		Product product = super.createProduct(productId);
		product.setName(name);
		product.setDescription(description);
		product.setCategoryId(category);
		product.setPrice(price);
		/*User user = userLocalService.getUser(serviceContext.getUserId());
		product.setUserId(user.getUserId());*/
		product.setImages(image);
		if (!Validator.isNull(name)) {
			System.out.println(name);
			System.out.println(description);
			System.out.println(category);
			System.out.println(price);
			System.out.println(image);
		}
		
		return super.addProduct(product);
	}

	public List<Product> getListProduct(String name) {
		return productPersistence.findByProductName(name);
	}

	public List<ProductBean> getProductsAll() {

		List<Product> product = productPersistence.findAll();
		List<ProductBean> productbean = new ArrayList<ProductBean>();
		try {
			Category category = null;
			for (Product item : product) {
				category = categoryPersistence.findByCategoryId(item.getCategoryId());
				ProductBean bean = new ProductBean(
						item.getProductId(), 
						item.getName(), 
						item.getDescription(),
						item.getPrice(), 
						item.getImages(), 
						category.getName());
				System.out.println(bean.toString());
				productbean.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return productbean;
	}

}