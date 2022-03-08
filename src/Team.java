public class Team {
	// Initialize private variables
    private String name;
    private Coach coach;
    private String city;

    // Default constructor 
    public Team() {
        name = "?";
        coach = new Coach();
        city = "?";
    }

    // Default constructor that allows user to automatically set private variables
    public Team(String name, Coach coach, String city) {
        this.name = name;
        this.coach = coach;
        this.city = city;
    }

    // Return team's name
    public String getName() {
        return name;
    }

    // Return team's coach 
    public Coach getCoach() {
        return coach;
    }

    // Return team's city
    public String getCity() {
        return city;
    }

    // Set new team's name
    public void setName(String name) {
        this.name = name;
    }

    // Set  new coach's information
    public void setCoach(String firstName, String lastName, int years) {
        coach = new Coach(firstName, lastName, years);
    }

    // Set new team's city
    public void setCity(String city) {
        this.city = city;
    }

    //Return team and coach's information
    public String toString() {
        return "Team's name:\t" + name + " from " + city + "\nCoach Information:" + coach.toString();
    }
}