import java.util.ArrayList;
import java.util.Scanner;

public class App {

  public static ArrayList<Individual> individualLeagues = new ArrayList<Individual>();
  public static ArrayList<Double> doubleLeagues = new ArrayList<Double>();

  public static void main(String[] args) throws Exception {
    int option;
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to LeagueApp!");

    Start:do {
      System.out.println(
        "\n1. Add new leagues \n2. Show individual leagues \n3. Show Double leagues"
      );
      System.out.print("Choose an option:");
      option = in.nextInt();

      switch (option) {
        case 1:
          System.out.println("You can make your own league here: ");

          do {
            System.out.println();
            System.out.println("1. Individual \n2. Double\n3. Exit");
            System.out.print("Choose type of league: ");

            option = in.nextInt();
            switch (option) {
              case 1:
                Individual newIndividual = new Individual();
                individualLeagues.add(newIndividual);
                break;
              case 2:
                Double newDouble = new Double();
                doubleLeagues.add(newDouble);
                break;
              case 3:
                continue Start;
              default:
                System.out.println("You can only pick 1 or 2 or 3!");
                break;
            }
          } while (true);
        case 2:
          for (int i = 0; i < individualLeagues.size(); i++) {
            individualLeagues.get(i).getPlayers();
            individualLeagues.get(i).getMatches();
          }
          break;
        case 3:
          for (int i = 0; i < doubleLeagues.size(); i++) {
            doubleLeagues.get(i).getTeams();
            doubleLeagues.get(i).getDoubleMatches();
          }

          break;
        default:
          System.out.println("You can only pick 1 or 2!");
      }
    } while (true);
  }
}
