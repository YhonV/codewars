public class SumArray {

  public static double sum(double[] numbers) {
    double suma = 0;
    for (double value : numbers){
      suma += value;
    }
    return suma;
  }
}