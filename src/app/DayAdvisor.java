package app;

public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Focus on your work and stay productive!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday! The weekend is near!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! Consider visiting a park or museum.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }

    public static void main(String[] args) {
        DayAdvisor advisor = new DayAdvisor();
        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SATURDAY);
    }
}
