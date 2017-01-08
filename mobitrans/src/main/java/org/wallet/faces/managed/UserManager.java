package org.wallet.faces.managed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.wallet.account.Account;
import org.wallet.account.AccountService;

@ManagedBean
@SessionScoped
public class UserManager extends SpringBeanAutowiringSupport {

	@Autowired
	AccountService accountService;
		
	private UserManager(){
	}

	public Account getCurrentUser() {
		return accountService.getCurrentUser();
	}
	
	public Boolean isLogged(){
		Account account = accountService.getCurrentUser();
		if(account == null)
			return false;
		return true;
	}
	
	public String logout() {

		FacesContext.getCurrentInstance().getExternalContext()
		.invalidateSession();

		//LOGGER.info("logout successful for '{}'", identifier);
		return "/logout";
	}
	
}
