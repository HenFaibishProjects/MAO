import org.testng.annotations.Test;

import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.DeployTestEnv;
import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.DropTables;
import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.InitialValues;

public class StartNG {
	

	@Test
	public  void mainng() throws Exception {
		InitialValues initialValues = new InitialValues();
		//DropTables.doit();
		initialValues.initialValuesIntoDB();
		

	}

}
