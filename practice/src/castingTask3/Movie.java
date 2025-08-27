package castingTask3;

public class Movie extends Video{
   public Movie() {;}
   public Movie(String name, int time) {
      super(name, time);
   }
   
   public void shakeChair() {
      System.out.println("4D 지원!");
   }
}