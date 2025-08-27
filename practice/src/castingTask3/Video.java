package castingTask3;

public class Video {
   private String name;
   private int time;
   
   public Video() {;}
   public Video(String name, int time) {
      this.name = name;
      this.time = time;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getTime() {
      return time;
   }
   public void setTime(int time) {
      this.time = time;
   }
}