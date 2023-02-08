import java.text.DecimalFormat;
import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        double hoursWork[] = {40, 50, 40};

        Worker Samuel = new Worker("000001", "Samuel", "Adams", "Mr.", 1985, 12);
        Worker Andrew = new Worker("000002", "Andrew", "McJones", "Mr.", 1975, 18);
        Worker Alexander = new Worker("000003", "Alex", "Kindle", "Mr.", 1990, 20);

        workers.add(Samuel);
        workers.add(Andrew);
        workers.add(Alexander);

        SalaryWorker Franklin = new SalaryWorker("000004", "Frank", "Krank","Mr.", 1992, 62000);
        SalaryWorker Gronk = new SalaryWorker("000005", "Gronk", "Dread", "Mr.", 1993, 75000);
        SalaryWorker Lisa = new SalaryWorker("000006", "Lisa", "Apples", "Ms.", 1991, 83000);

        workers.add(Franklin);
        workers.add(Gronk);
        workers.add(Lisa);

        double weekPay;

        DecimalFormat decimalFormat = new DecimalFormat("$#.00");

        System.out.println("Week\tWorker\t\tWeeklyPay");
        for (int i = 0; i < 32; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < 3; i++)
        {
            count++;
            System.out.println(count);

            for (Worker work : workers)
            {
               weekPay = work.calculateWeeklyPay(hoursWork[i]);

                System.out.println("\t" + "\t" + work.getFirstName()+ "\t" + "\t" + decimalFormat.format(weekPay));


            }

        }



    }
}


