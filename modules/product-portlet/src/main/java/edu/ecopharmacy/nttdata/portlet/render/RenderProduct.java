package edu.ecopharmacy.nttdata.portlet.render;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.List;
import java.util.Objects;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import edu.ecopharmacy.nttdata.bean.ProductBean;
import edu.ecopharmacy.nttdata.constants.ProductPortletKeys;
import edu.ecopharmacy.nttdata.service.ProductLocalService;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ProductPortletKeys.PRODUCT,
			"mvc.command.name=productRender"
		},
		service = MVCRenderCommand.class
	)
public class RenderProduct implements  MVCRenderCommand {
	
	private static final Log LOG = LogFactoryUtil.getLog(RenderProduct.class);
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		LOG.info("/fase render");
		String returnView = "/view.jsp";
		String option = ParamUtil.getString(renderRequest, "option");
		if(Objects.equals(option, "back")) {
			LOG.info("/fase render "+ option);
			returnView = "/view.jsp";
		}
		if(Objects.equals(option, "lista")) {
				returnView = "/list.jsp";
			try {
				List<ProductBean> response = service.getProductsAll();
				if(response.size() >0) {
					renderRequest.setAttribute("productList", response);
					renderRequest.setAttribute("count", response.size());
				}
			} catch (Exception e) {
				LOG.error("ERROR EN LA LISTA DE PRODUCTOS"+ e.getMessage());
			}
			
				
		}
		if(Objects.equals(option, "inventory")) {
			returnView = "/add-inventory.jsp";
		}
	
		LOG.info("jsp: "+returnView);
		return returnView;
	}

	@Reference
	private ProductLocalService service;
}
