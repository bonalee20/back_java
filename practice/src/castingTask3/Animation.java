package castingTask3;

public class Animation extends Video{
   public Animation() {;}
   public Animation(String name, int time) {
      super(name, time);
   }
   
   public void showSubTitle() {
      System.out.println(super.getName() + " 자막 지원");
   }
}
