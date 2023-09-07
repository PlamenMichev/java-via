public class TestScores
{
  private double firstScore;
  private double secondScore;
  private double thirdScore;

  public TestScores(double firstScore, double secondScore, double thirdScore) {
    this.firstScore = firstScore;
    this.secondScore = secondScore;
    this.thirdScore = thirdScore;
  }

  public void setFirstScore(double firstScore) {
    this.firstScore = firstScore;
  }

  public void setSecondScore(double secondScore) {
    this.secondScore = secondScore;
  }

  public void setThirdScore(double thirdScore) {
    this.thirdScore = thirdScore;
  }

  public double getFirstScore() {
    return firstScore;
  }

  public double getSecondScore() {
    return secondScore;
  }

  public double getThirdScore() {
    return thirdScore;
  }

  public double getAverage() {
    return (firstScore + secondScore + thirdScore) / 3;
  }

  public String toString() {
    return "First score: " + firstScore + "\nSecond score: " + secondScore + "\nThird score: " + thirdScore + "\nAverage: " + getAverage();
  }

}
