package test;

import com.tibco.be.ws.scs.SCSException;
import com.tibco.be.ws.scs.impl.repo.svn.mytest.*;

public class MainTest {

	public static void main(String[] args) throws SCSException {
		GIT git =new GIT();
	System.out.println(git);
		//git.list("https://svn.tibco.com/svn/be/trunk/QA/ManualTests/WebStudio/BE-23757/", "pnawal", "Oct%2017", true, "CreditCardApplication",
			//	"");
	}

}