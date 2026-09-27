class Employee 
{ 
static int empid=500; 
static void emp1() 
{ 
empid++; 
System.out.println("Employee id:"+empid); 
} 
} 
class Sample 
{ 
public static void main(String args[]) 
{ 

Employee.emp1(); 
Employee.emp1(); 
Employee.emp1(); 
Employee.emp1(); 
Employee.emp1(); 
Employee.emp1(); 
} 
}
