import java.util.ArrayList;
import java.util.Scanner;

public class Double extends League {

  private String type;
  private ArrayList<Team> teams = new ArrayList<Team>();
  private ArrayList<MatchDouble> matches = new ArrayList<MatchDouble>();
  private static int teamNum = 0;
  private static int amountOfTeams;

  public Double() {
    Scanner in = new Scanner(System.in);
    System.out.println("Creating a new Double league!");
    this.type = "Double";

    System.out.print("Enter amount of teams in the league: ");
    amountOfTeams = in.nextInt();

    System.out.println("Add new teams: ");
    for (int i = 0; i < amountOfTeams; i++) {
      teamNum++;
      System.out.printf("Add team nr %s:", teamNum);
      Team newTeam = new Team();
      teams.add(newTeam);
    }
    teamNum = 0;
    System.out.printf(
      "List of all the teams in the %s league: ",
      this.getLeagueName()
    );
    for (int j = 0; j < teams.size(); j++) {
      System.out.printf(
        "\nteam ID: %s, team name: %s",
        teams.get(j).getID(),
        teams.get(j).getName()
      );
    }
    makeDoubleMatches();
  }

  public void getTeams() {
    System.out.printf(
      "\nList of all the players in the %s league: ",
      this.getLeagueName()
    );
    for (int j = 0; j < teams.size(); j++) {
      System.out.printf(
        "\nPlayer ID: %s, Player name: %s",
        teams.get(j).getID(),
        teams.get(j).getName()
      );
    }
  }

  public void makeDoubleMatches() {
    for (int i = 0; i < teams.size(); i++) {
      for (int j = 1; j < teams.size(); j++) {
        if (teams.get(i).getName() != teams.get(j).getName()) {
          MatchDouble newMatch = new MatchDouble(teams.get(i), teams.get(j));
          matches.add(newMatch);
        } else {
          break;
        }
      }
    }
  }

  public void getDoubleMatches() {
    System.out.printf(
      "\nList of all matches in the %s league: ",
      this.getLeagueName()
    );
    for (int i = 0; i < matches.size(); i++) {
      matches.get(i).getMatchDouble();
    }
  }
}
