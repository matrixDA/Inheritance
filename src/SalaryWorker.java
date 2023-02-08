public class SalaryWorker extends Worker {

    private double annualSalary;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double annualSalary) {
        super(IDNum, firstName, lastName, title, YOB);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary / 52;
    }
    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        double totalPay = annualSalary/52;

        String retString = " ";

        retString = "Weekly pay is a fraction of annual salary";
        retString += "Weekly Pay =" + " " + String.format("$%.2f\n", totalPay);
        retString += "Annual Pay =" + " " + String.format("$%.2f\n", annualSalary);

        return retString;
    }

}
