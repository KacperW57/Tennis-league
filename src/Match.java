public class Match {

  private Player playerA;
  private Player playerB;

  public Match(Player playerA, Player playerB) {
    this.playerA = playerA;
    this.playerB = playerB;
  }

  public Player getPlayerA() {
    return this.playerA;
  }

  public Player getPlayerB() {
    return this.playerB;
  }

  public void getMatch() {
    System.out.printf(
      "\n%s vs %s",
      this.playerA.getName(),
      this.playerB.getName()
    );
  }
}
