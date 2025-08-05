package fundamentals.07;

public public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
       
        int average = (s1 + s2 +s3 ) / 3; 
        char letterGrade = '?';
        if (average <= 100 && average >= 90){
          letterGrade = 'A';
        } else if (average >= 80 && average <= 90){
            letterGrade = 'B';
        } else if (average >=  70 && average <= 80){
            letterGrade = 'C';
        } else if (average >=  60 && average <= 70){
            letterGrade = 'D';
        } else if (average >=  0 && average <= 60){
            letterGrade = 'F';
        } 
      return letterGrade;
    }
}
