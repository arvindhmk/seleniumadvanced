package reexecutefailtestcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

//reflect api
public class transformanalyzer implements IAnnotationTransformer
{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testmethod)
	{
		annotation.setRetryAnalyzer(retryanalyzer.class);
	}
}
