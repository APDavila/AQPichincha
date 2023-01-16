import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/compra.feature",glue="steps")
public class RunCompraTest extends AbstractTestNGCucumberTests{

	
}
