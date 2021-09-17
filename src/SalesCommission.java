/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

/*
~PLAN~
Make an input asking for
        - "What is your hourly rate?"
        - "How many hours have you worked this week?"
        - "How much money did you earn from selling the cars?"
        - "What is your commission %?"

Do all the cal
     Time first
        - How much in hours did they make? (hours * perHourPay)
     Commission
        - How much in commissions (totalledSold * commission)
     Add them together
        - time * commissions


Output

       - Make a popup box with the total amount ("total amount is: " + total
 */

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {

        double hours = Double.parseDouble(JOptionPane.showInputDialog("How many hours have you worked this week?"));
        double perHourPay = Double.parseDouble(JOptionPane.showInputDialog("How much do you get paid by the hour"));
        double totalAmountSold = Double.parseDouble(JOptionPane.showInputDialog("How much were all the car sold"));
        double commission = Double.parseDouble(JOptionPane.showInputDialog("How much do you earn in commission(Percentage please(##.#%))"));
        double time = time(hours, perHourPay);
        double commission2 = commission2(totalAmountSold, commission);
        double total = total(time, commission2);
        output(total);



    }

    public static double time(double hours, double perHourPay){

        return hours * perHourPay;

    }

    public static double commission2(double totalAmountSold, double commission){

        return totalAmountSold * commission/100.0;

    }

    public static double total(double time, double commission2){

        return time + commission2;

    }

    public static void output(double total){

        DecimalFormat round = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null, "The amount you earned is: " + round.format(total));

    }



}
