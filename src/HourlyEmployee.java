public class HourlyEmployee extends Employee {
    private double hours;
    private double wages;

    public HourlyEmployee(String first, String last, String ssn,
                          double hoursWorked, double hourlyWages ) {
        super(first,last, ssn);
        setHours(hoursWorked);
        setWages(hourlyWages);

    }
    public void setWages( double hourlyWages ) {
        if( hourlyWages >= 0.0 )
            wages = hourlyWages;
        else
            throw new IllegalArgumentException(
                    "Wages must be greater than 0.0");
    }
    public double getWages() {
        return wages;
    }

    public void setHours( double hoursWorked ) {
        if( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
            hours = hoursWorked;
        else
            throw new IllegalArgumentException(
                    "Hours must be between 0.0 and 168.0");
    }
    public double getHours() {
        return hours;
    }

    @Override
    public double getPaymentAmount() {
        if( getHours() <= 40.0 )
            return getWages() * getHours();
        else
            return 40.0 * getWages() + ( ( getHours() - 40.0 ) * getWages() * 1.5 );
    }

    @Override
    public String toString() {
        return  String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWages(), "hours worked", getHours());
    }
}
