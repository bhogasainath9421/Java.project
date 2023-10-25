import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;

 class AgeCalculator 
 {
    public static void main(String[] args) 
	 {
        // Replace these date and time values with your inputs
        LocalDateTime birthDateTime = LocalDateTime.of(2000, 5, 10, 12, 0); //Enter DOB with this Format 	YY,MM,DD,HH,MM 
        LocalDateTime currentDateTime = LocalDateTime.now(); // Current date and time

        // Calculate the duration between the two date-time instances
        Duration duration = Duration.between(birthDateTime, currentDateTime);

        // Calculate the period between the two dates (for months and years)
        Period period = Period.between(birthDateTime.toLocalDate(), currentDateTime.toLocalDate());

        // Extracting individual units
        int years = period.getYears();
	int months = period.getMonths();
	long days = duration.toDays();
	long hours = duration.toHours();
	long minutes = duration.toMinutes();
        

        // Displaying AGE:
        System.out.println("Age in years: " + years);
        System.out.println("Age in months: " + months);
        System.out.println("Age in days: " + days);
        System.out.println("Age in hours: " + hours);
        System.out.println("Age in mintues: " + minutes);
        
        
        }
}
