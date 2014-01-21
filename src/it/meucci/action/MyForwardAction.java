/**
 * 
 */
package it.meucci.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author <a href="https://github.com/DavidePastore">DavidePastore</a>
 *
 */
public class MyForwardAction extends Action {

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
					throws Exception {
		return mapping.findForward("success");
	}

}
