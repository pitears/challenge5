package org.example;
import java.util.Scanner;

public class parkingCost {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the total parking time (hours): ");
        String parkingHoursString = myObj.nextLine();

        int parkingHours = Integer.parseInt(parkingHoursString);
        double parkingCost = calculateParkingCost(parkingHours);

        System.out.println("The parking fee to be paid: $" + parkingCost);

        myObj.close();
    }
    public static double calculateParkingCost(int parkingHours) {
        double firstHourCost = 5.00;
        double additionalHourCost = 0.50;
        double maxHourCost = 15.00;
        int maxHour = 24;
        double totalCost;

        if (parkingHours <= 5) {
            totalCost = firstHourCost;
        } else if (parkingHours <= maxHour) {
            totalCost = firstHourCost + (parkingHours - 5) * additionalHourCost;
        } else {
            totalCost = maxHourCost + (parkingHours - maxHour) * additionalHourCost;
        }
        return totalCost;

    }
}