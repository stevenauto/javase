package inc.aruba.Jython;

import org.python.core.PyException;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.core.PyString;

public class SimpleEmbedded {
	   public static void main(String[] args) throws PyException {
	        
	        // Java
	        EmployeeType eType = (EmployeeType) JythonFactory.getInstance().getJavaObjectFromJythonFile("inc.aruba.Jython.EmployeeType", "D:/automation/Employee.py");
	        System.out.println("Employee Name is: " + eType.getEmployeeFirst() + " " + eType.getEmployeeLast());
	        System.out.println("Employee ID is: " + eType.getEmployeeId());
	        
	        // Jython
	        PyObject pyObject = JythonFactory.getInstance().getPyObjectFromJythonFile("Employee", "D:/automation/Employee.py");
	        System.out.println("Employee ID = "+pyObject.invoke("getEmployeeId"));
	        System.out.println("Modify Employee id");
	        pyObject.invoke("setEmployeeId",new PyString("1999"));
	        System.out.println("Employee ID = "+pyObject.invoke("getEmployeeId")+"after modified");
	        
	        // Jython Function
	        PyFunction pyFunction = JythonFactory.getInstance().getPyFunctionFromJythonFile("getNunmberValue", "D:/automation/Employee.py");
	        System.out.println("***="+pyFunction.__call__(new PyInteger(10)));
	        
	    }

}
