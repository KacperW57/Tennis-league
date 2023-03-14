public class MatchDouble {

  private Team teamA;
  private Team teamB;

  public MatchDouble(Team teamA, Team teamB) {
    this.teamA = teamA;
    this.teamB = teamB;
  }

  public Team getteamA() {
    return this.teamA;
  }

  public Team getteamB() {
    return this.teamB;
  }

  public void getMatchDouble() {
    System.out.printf("\n%s vs %s", this.teamA.getName(), this.teamB.getName());
  }
}
