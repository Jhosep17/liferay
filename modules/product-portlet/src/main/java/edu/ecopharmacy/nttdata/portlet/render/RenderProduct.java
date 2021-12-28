package edu.ecopharmacy.nttdata.portlet.render;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Objects;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import edu.ecopharmacy.nttdata.constants.ProductPortletKeys;

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
		
		String returnView = "/view.jsp";
		String option = ParamUtil.getString(renderRequest, "option");
		
		if(Objects.equals(option, "back")) {
			returnView = "/view.jsp";
		}
		LOG.info("jsp: "+returnView);
		return returnView;
	}

}
