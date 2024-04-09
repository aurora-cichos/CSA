/**
 * Represents the salary for a person
 */
public class Salary {
  private double annual;
  public void setAnnualSalary(double salary) { 
     annual = salary;
  } // end set salary
  public double getAnnualSalary() {
     return annual;
  } // end get salary
  public String toString() {
     return "$" + annual;
  }	// end toString
}

