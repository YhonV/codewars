public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    int hoursToMiliseconds = h * 3600000;
    int minutesToMiliseconds = m * 60000;
    int secondsToMiliseconds = s * 1000;
    
    int totalMiliseconds = hoursToMiliseconds + minutesToMiliseconds + secondsToMiliseconds;
    return totalMiliseconds;
  }
}
