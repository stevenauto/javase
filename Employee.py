from inc.steven.Jython import EmployeeType

class Employee(EmployeeType):
   def __init__(self):
      self.first = "steven"
      self.last  =  "li"
      self.id = "721"

   def getEmployeeFirst(self):
      return self.first

   def getEmployeeLast(self):
      return self.last

   def getEmployeeId(self):
      return self.id
      
   def setEmployeeId(self,id):
      self.id=id
def getNunmberValue(seed):
    v0 = 0
    for i in range(1,seed+1):
        v0 +=i
    return v0