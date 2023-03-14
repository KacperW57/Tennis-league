import java.util.Scanner;

public class League {

  private int ID;
  private String name;
  private static int idNum = 0;

  public League() {
    Scanner in = new Scanner(System.in);
    System.out.println("Adding new league!");
    this.ID = generateID();
    System.out.print("Enter league name: ");
    this.name = in.nextLine();
  }

  public int generateID() {
    idNum++;
    return idNum;
  }

  public String getLeagueName() {
    return this.name;
  }
}
