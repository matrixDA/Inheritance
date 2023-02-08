import java.security.PublicKey;

public class Worker extends Person
{
    private double hourlyPayRate = 0;

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double regularPay = 0;
        double overtimePay = 0;
        double totalPay = 0;

        if (hoursWorked <= 40)
        {
            regularPay = hoursWorked * hourlyPayRate;
        }

        else {
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            regularPay = 40 * hourlyPayRate;
        }

        return totalPay = regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        double regularPay = 0;
        double overtimePay = 0;
        double totalPay = 0;

        String retString = " ";
        if (hoursWorked > 40)
        {
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            regularPay = 40 * hourlyPayRate;
        }
        else
        {
            regularPay = hoursWorked * hourlyPayRate;
        }
        totalPay = regularPay + overtimePay;

        retString = "Regular Pay =" + " " + String.format("$%.2f\n", regularPay);
        retString += "Overtime Pay =" + " " + String.format("$%.2f\n", overtimePay);
        retString += "Total Pay =" + " " + String.format("$%.2f\n", totalPay);

        return retString;
    }


    public Worker(String IDNum, String firstName, String lastName, String title, Integer YOB, double hourlyPayRate)
    {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(String IDNum, String firstName, String lastName, String title, Integer YOB) {
        super(IDNum, firstName, lastName, title, YOB);
    }


}
