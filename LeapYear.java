package UnderstandingMethods;

import java.util.Scanner;

public class LeapYear {


        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter a year");
            int year=scan.nextInt();
            boolean leap = false;

            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    // year is divisible by 400, hence the year is a leap year
                    if ( year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }
                else
                    leap = true;
            }
            else
                leap = false;

            if(leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
    }

    //credits-> YouTube @Samedify
