import java.util.ArrayList;
import java.util.Scanner;

public class Individual extends League {

  private String type;
  private ArrayList<Player> players = new ArrayList<Player>();
  private static int playerNum = 0;
  private static int amountOfPlayers;

  public Individual() {
    Scanner in = new Scanner(System.in);
    System.out.println("Creating a new  individual league! ");
    this.type = "Individual";

    System.out.print("Enter amount of players in the league: ");
    amountOfPlayers = in.nextInt();

    System.out.println("Add new players: ");
    for (int i = 0; i < amountOfPlayers; i++) {
      playerNum++;
      System.out.printf("Add player nr %s:", playerNum);
      Player newPlayer = new Player();
      players.add(newPlayer);
    }
    playerNum = 0;
    System.out.printf(
      "List of all the players in the %s league: ",
      this.getLeagueName()
    );
    for (int j = 0; j < players.size(); j++) {
      System.out.printf(
        "\nPlayer ID: %s, Player name: %s",
        players.get(j).getID(),
        players.get(j).getName()
      );
    }
  }

  public void getPlayers() {
    System.out.printf(
      "\nList of all the players in the %s league: ",
      this.getLeagueName()
    );
    for (int j = 0; j < players.size(); j++) {
      System.out.printf(
        "\nPlayer ID: %s, Player name: %s",
        players.get(j).getID(),
        players.get(j).getName()
      );
    }
  }
}
