package inc.steven.Jython;

import org.python.core.PyException;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.core.PyString;

public class SimpleEmbedded {
	   public static void main(String[] args) throws PyException {
	        
	        // Java
	        EmployeeType eType = (EmployeeType) JythonFactory.getInstance().getJavaObjectFromJythonFile("inc.steven.Jython.EmployeeType", "C:/Users/root/workspace/javase/Employee.py");
	        System.out.println("Employee Name is: " + eType.getEmployeeFirst() + " " + eType.getEmployeeLast());
	        System.out.println("Employee ID is: " + eType.getEmployeeId());
	        
	        // Jython
	        PyObject pyObject = JythonFactory.getInstance().getPyObjectFromJythonFile("Employee", "C:/Users/root/workspace/javase/Employee.py");
	        System.out.println("Employee ID = "+pyObject.invoke("getEmployeeId"));
	        System.out.println("Modify Employee id");
	        pyObject.invoke("setEmployeeId",new PyString("1999"));
	        System.out.println("Employee ID = "+pyObject.invoke("getEmployeeId")+"after modified");
	        
	        // Jython Function
	        PyFunction pyFunction = JythonFactory.getInstance().getPyFunctionFromJythonFile("getNunmberValue", "C:/Users/root/workspace/javase/Employee.py");
	        System.out.println("***="+pyFunction.__call__(new PyInteger(10)));
	        
	    }

}
