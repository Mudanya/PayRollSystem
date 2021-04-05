public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee( String first, String last, String ssn, double salary ) {
        super(first, last, ssn);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary( double weekly ) {
        if( weekly >= 0.0 )
            weeklySalary = weekly;
        else throw new IllegalArgumentException(
                "Salary must me be greater than 0.0 ");
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried employee:%s\n%s: $%,.2f",
                super.toString(),"Weekly wages", getWeeklySalary());
    }
}
