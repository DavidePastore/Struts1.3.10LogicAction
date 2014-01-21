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
public class LogicAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
		//Il mapping identificato dalla stringa "success"
		//si trova in struts-config.xml
		return mapping.findForward("success");
	}

}
