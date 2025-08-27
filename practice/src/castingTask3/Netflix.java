package castingTask3;

public class Netflix {
   private String name;
   private int price;
   
   public Netflix() {;}
   public Netflix(String name, int price) {
      this.name = name;
      this.price = price;
   }

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getPrice() {
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   
   void show(Video video) {
      if(video instanceof Drama) {
//         다운 캐스팅
         Drama drama = (Drama)video;
         drama.sellGoods();
      }else if(video instanceof Animation) {
//         다운 캐스팅
         Animation animation = (Animation)video;
         animation.showSubTitle();
      }else if(video instanceof Movie) {
//         다운 캐스팅
         Movie movie = (Movie)video;
         movie.shakeChair();
      }
   }
}






