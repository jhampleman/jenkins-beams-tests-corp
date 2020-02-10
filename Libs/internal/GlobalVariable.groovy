package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object mycount
     
    /**
     * <p></p>
     */
    public static Object mybeam
     
    /**
     * <p></p>
     */
    public static Object myuff
     
    /**
     * <p></p>
     */
    public static Object beamFail
     
    /**
     * <p></p>
     */
    public static Object uffFail
     
    /**
     * <p></p>
     */
    public static Object myplan
     
    /**
     * <p></p>
     */
    public static Object variable
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            mycount = selectedVariables['mycount']
            mybeam = selectedVariables['mybeam']
            myuff = selectedVariables['myuff']
            beamFail = selectedVariables['beamFail']
            uffFail = selectedVariables['uffFail']
            myplan = selectedVariables['myplan']
            variable = selectedVariables['variable']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
