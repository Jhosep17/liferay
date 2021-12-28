package edu.ecopharmacy.nttdata.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import edu.ecopharmacy.nttdata.constants.ProductPortletKeys;
import edu.ecopharmacy.nttdata.service.ProductLocalService;

/*Fase action con el nombre asiganado en nuestro view.jsp*/
@Component(
		immediate = true, 
		property = { 
			"javax.portlet.name=" + ProductPortletKeys.PRODUCT,
			"mvc.command.name=productForm" 
		}, 
		service = MVCActionCommand.class
	)
public class ProductAction extends BaseMVCActionCommand {
	
	@Reference
	private ProductLocalService service;

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		String name = ParamUtil.getString(actionRequest, "nombre");
		String description = ParamUtil.getString(actionRequest, "descripcion");
		String category = ParamUtil.getString(actionRequest, "categoria");
		Double price = ParamUtil.getDouble(actionRequest, "precio");
		String images = ParamUtil.getString(actionRequest, "imagen");
		
		service.saveProduct(name, description, category, price, images);
		
		if(!Validator.isNull(name) && !Validator.isNull(description) && !Validator.isNull(category) && !Validator.isNull(price) && !Validator.isNull(images)){
			actionResponse.getRenderParameters().setValue("mvcPath", "/finish.jsp");
		}
	}
	
	

}
