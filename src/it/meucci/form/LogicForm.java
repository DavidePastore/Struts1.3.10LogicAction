/**
 * 
 */
package it.meucci.form;

import org.apache.struts.action.ActionForm;

/**
 * @author <a href="https://github.com/DavidePastore">DavidePastore</a>
 *
 */
public class LogicForm extends ActionForm {
	
	private String number;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

}
