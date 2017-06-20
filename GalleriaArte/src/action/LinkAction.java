package action;

import com.opensymphony.xwork2.ActionSupport;

public class LinkAction extends ActionSupport
{

	private static final long serialVersionUID = -2613425890762568273L;


	
	public String home()
	{
		return "home";
	}
	
	public String menu()
	{
		return "menu";
	}
	
	public String footer()
	{
		return "footer";
	}
}
