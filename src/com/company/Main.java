package com.company;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Main {

    public static void main(String[] args) {


        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");// ------------- format date for display ----
        LocalDateTime todayDate = LocalDateTime.now();// -------------- get local time for today ----------
        LocalDateTime lastFullMoon = LocalDateTime.of(2018, Month.JANUARY, 31, 6, 27, 46);
        LocalDateTime nextFullMoon = LocalDateTime.of(2018, Month.MARCH, 1, 17, 52, 10);
        System.out.println("Today's date is " + formatDate.format(todayDate));
        System.out.println("The last full moon was on  " + formatDate.format(lastFullMoon));
        System.out.println("The next full moon will be on " + formatDate.format(nextFullMoon));

        long seconds = ChronoUnit.SECONDS.between(todayDate, nextFullMoon);
        System.out.println("variable seconds: " + seconds);
        long weeksTillFull = seconds / 604800;
        long weeksMod = seconds % 604800;
        long daysTillFull = (weeksMod / 86400);
        long daysMod = weeksMod % 86400;
        long hoursTillFull = (daysMod / 3600);
        long hoursMod = weeksMod % 3600;
        long minTillFull = (hoursMod / 60);
        long minMod = weeksMod % 60;

        System.out.print("Which is " + weeksTillFull + " weeks, ");
        System.out.print(daysTillFull + " days, ");
        System.out.print(hoursTillFull + " hours, ");
        System.out.println(minTillFull + " minutes and " + minMod + " seconds.");
        System.out.println("well not anymore.  It just got a few seconds closer.");


    }// --------END OF METHOD main ---
}// ------------END OF CLASS Main ----
