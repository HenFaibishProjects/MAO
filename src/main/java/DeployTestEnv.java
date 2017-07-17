import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.InitialValues;
import com.Mao.BackEndDev.businessObjects.itionalData.otherContents.DropTables;

public class DeployTestEnv {
	
	
	
	public static void deployEnv() throws Exception{
		DropTables.doit();
		new InitialValues();
	}

}
