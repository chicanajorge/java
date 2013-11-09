package pe.edu.cibertec.user.action;


import pe.edu.cibertec.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;
 
public class UserAction extends ActionSupport{

	//DI via Spring
	UserBo userBo;
	
	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		
		/*WebApplicationContext context =
			WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
		
		UserBo userBo1 = (UserBo)context.getBean("userBo");
		userBo1.printUser();*/
		
		userBo.printUser();
		
		return SUCCESS;
		
	}
}