import java.util.Scanner;

public class Player {

  private int playerID;
  private String name;
  private static int idNum = 0;

  public Player() {
    Scanner in = new Scanner(System.in);
    this.playerID = generateID();
    System.out.print("\nEnter name: ");
    this.name = in.nextLine();
  }

  public int generateID() {
    idNum++;
    return idNum;
  }

  public int getID() {
    return this.playerID;
  }

  public String getName() {
    return this.name;
  }
}
