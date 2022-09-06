package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month == 2){
                if (year % 100 == 0){
                    if (year % 400 == 0) System.out.println(29);
                    else System.out.println(28);
                } else if (year % 4 == 0)
                    System.out.println(29);
                else
                    System.out.println(28);
            } else if (month % 2 == 0)
                System.out.println(31);
            else System.out.println(30);

    }
}
