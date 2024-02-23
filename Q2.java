// Q2) WAJP to create a Player class. Inherit the classes Cricket _Player, Football _Player and Hockey_ Player from Player class.

// Parent class Player
class Player {
    String name;
    int age;

    // Constructor
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display player information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Cricket_Player
class Cricket_Player extends Player {
    String teamName;

    // Constructor
    public Cricket_Player(String name, int age, String teamName) {
        super(name, age);
        this.teamName = teamName;
    }

    // Method to display cricket player information
    public void displayCricketPlayerInfo() {
        displayInfo();
        System.out.println("Team: " + teamName);
    }
}

// Subclass Football_Player
class Football_Player extends Player {
    String clubName;

    // Constructor
    public Football_Player(String name, int age, String clubName) {
        super(name, age);
        this.clubName = clubName;
    }

    // Method to display football player information
    public void displayFootballPlayerInfo() {
        displayInfo();
        System.out.println("Club: " + clubName);
    }
}

// Subclass Hockey_Player
class Hockey_Player extends Player {
    String teamName;

    // Constructor
    public Hockey_Player(String name, int age, String teamName) {
        super(name, age);
        this.teamName = teamName;
    }

    // Method to display hockey player information
    public void displayHockeyPlayerInfo() {
        displayInfo();
        System.out.println("Team: " + teamName);
    }
}

// Main class to demonstrate the usage
public class Q2 {
    public static void main(String[] args) {
        // Creating objects of different player types
        Cricket_Player cricketPlayer = new Cricket_Player("Sachin", 45, "India");
        Football_Player footballPlayer = new Football_Player("Ronaldo", 36, "Manchester United");
        Hockey_Player hockeyPlayer = new Hockey_Player("Dhyan Chand", 115, "India");

        // Displaying player information
        System.out.println("Cricket Player Information:");
        cricketPlayer.displayCricketPlayerInfo();
        System.out.println();

        System.out.println("Football Player Information:");
        footballPlayer.displayFootballPlayerInfo();
        System.out.println();

        System.out.println("Hockey Player Information:");
        hockeyPlayer.displayHockeyPlayerInfo();
    }
}
