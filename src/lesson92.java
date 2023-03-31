public class lesson92 {
    public static void main(String[] args) {
        Worker max = new Worker("Max", "1983", "2024");
//        System.out.println(max);
//        max.getAge();
//        max.collectPay();
//        max.terminate("2021");

        Employee damian = new Employee("Damian", "1985", "2023", 123, "2016");
//        System.out.println(damian);
//        damian.getAge();
//        damian.collectPay();
//        damian.terminate("2021");

        HourlyEmployee david = new HourlyEmployee("David", "1983", "2024", 456, "2017", 80.5);
//        System.out.println(david);
//        david.getAge();
//        david.collectPay();
//        david.terminate("2021");
//        david.getDoublePay();
        david.collectPay();
    }}




class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeID, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeID, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }


@Override
public double collectPay() {
        double weeklyPay=hourlyPayRate*40;
    System.out.println(name+"'s pay is "+weeklyPay+".");
    return  weeklyPay;
}

    public double getDoublePay() {
double doublePay = hourlyPayRate*2;
        System.out.println(name+" has the double pay rate of "+doublePay+".");
            return hourlyPayRate*2;
        }


    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}

class Employee extends Worker {
    private long employeeID;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeID, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}



class Worker {
    protected String name;
    private String birthDate;
    private String endDate;

    public void terminate(String endDate) {
        System.out.println(name+" will be terminated on "+endDate+".");
}
    public double collectPay() {
        double pay = 0;
        int intEndDate = 0;
        try {
            intEndDate = Integer.parseInt(endDate);
        } catch
        (NumberFormatException badUserData) {
            System.out.println("Characters not allowed!!! Try again.");
        }
        if (intEndDate >= 2022) {
              pay = 1000.05;

        }
        System.out.println(name+"'s pay is "+pay+".");
        return pay;
    }

     public int getAge() {
      int age=0;
      try {
           age = 2022 - Integer.parseInt(birthDate);
      }
      catch
           (NumberFormatException badUserData){
               System.out.println("Characters not allowed!!! Try again.");
          return age=0;
           }
       System.out.println(name+"'s age is "+age+".");
       return age;
   }
    public Worker() {
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}

