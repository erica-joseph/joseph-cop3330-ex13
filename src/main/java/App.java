import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("#.##");
//input
        System.out.print("What is the principle? ");
        double principle = sc.nextDouble();
        System.out.print("What is the rate of interest? ");
        double intRate = sc.nextDouble();
        System.out.print("What is the number of years? ");
        double years = sc.nextDouble();
        System.out.print(" What is the number of times the interest is compounded per year? ");
        double comyears = sc.nextDouble();
//calculation
        //A = P(1 + r/n)^(n*t)

        double intRateadj = intRate * .01;
        double pClause = 1 + (intRateadj/comyears);
        double nClause = comyears*years;
        double invWorth = principle*(Math.pow(pClause,nClause));
//output
        System.out.print("$" + (int) principle + " invested at "+ df2.format(intRate) +"%  for "+ (int) years +" years compounded "+ (int) comyears +" times per year is $"+ df2.format(invWorth) +".");
    }
}