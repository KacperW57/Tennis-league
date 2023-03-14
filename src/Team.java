import java.util.Scanner;

public class Team {

  private int teamID;
  private String name;
  private static int idNum = 0;

  public Team() {
    Scanner in = new Scanner(System.in);
    this.teamID = generateID();
    System.out.print("Enter team name: ");
    this.name = in.nextLine();
  }

  public int generateID() {
    idNum++;
    return idNum;
  }

  public int getID() {
    return this.teamID;
  }

  public String getName() {
    return this.name;
  }
}
