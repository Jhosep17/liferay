package edu.ecopharmacy.nttdata.contact.portlet.render;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import edu.ecopharmacy.nttdata.contact.constants.ContactPortletKeys;


@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + ContactPortletKeys.CONTACT,
			"mvc.command.name=contactRender"
		},
		service = MVCRenderCommand.class
	)
public class ContactRender implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return null;
	}

}
