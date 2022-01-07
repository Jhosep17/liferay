package edu.ecopharmacy.nttdata.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import edu.ecopharmacy.nttdata.constants.ProductPortletKeys;
@Component(
		immediate = true, 
		property = { 
			"javax.portlet.name=" + ProductPortletKeys.PRODUCT,
			"mvc.command.name=inventoryForm" 
		}, 
		service = MVCActionCommand.class
	)
public class InventoryAction extends BaseMVCActionCommand {
	private static final Log LOG = LogFactoryUtil.getLog(InventoryAction.class);
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			System.out.println("Fase Action Inventory");
		} catch (Exception e) {
			LOG.error("REGISTRO FALLIDO :"+e.getMessage());
		}
	}

}
