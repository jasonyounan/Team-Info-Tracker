public class Coach {
	// Initialize private variables
    private String firstName;
    private String lastName;
    private int years;

    // Default constructor 
    public Coach() {
        firstName = "?";
        lastName = "?";
        years = 0;
    }

    // Default constructor that allows user to automatically set private variables
    public Coach(String firstName, String lastName, int years) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.years = years;
    }

    // Return coach's first name
    public String getFirstName() {
        return firstName;
    }

    // Return coach's last name
    public String getLastName() {
        return lastName;
    }

    // Return coach's years of experience
    public int getYears() {
        return years;
    }

    // Set new coach's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Set new coach's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Set new coach's years of experience
    public void setYears(int years) {
        this.years = years;
    }

    // Return coach's information
    public String toString() {
        return "\nLast Name:\t" + lastName + "\nFirst Name:\t" + firstName + "\nYears of Experience:\t" + years + "\n";
    }
}