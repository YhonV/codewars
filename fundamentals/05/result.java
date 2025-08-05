import java.util.stream.Stream;
import java.util.Arrays;
import java.util.OptionalInt; 
public class Kata {

  public int min(int[] list) {
    OptionalInt min  = Arrays.stream(list).min();
    return min.getAsInt();
  }
  
  public int max(int[] list) {
     OptionalInt max = Arrays.stream(list).max();
    return max.getAsInt();
  }
}