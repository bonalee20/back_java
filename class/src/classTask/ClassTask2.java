package classTask;

class Market {
//   1. 상품명, 상품가격, 상품재고
   String productName;
   int productPrice;
   int productStock;
   
   public Market() {;}
   public Market(String productName, int productPrice, int productStock) {
      this.productName = productName;
      this.productPrice = productPrice;
      this.productStock = productStock;
   }
   
//   판매(sell)
//   힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
   void sell(Customer customer) {
      customer.money -= productPrice - productPrice * (customer.discount / 100.0);
      productStock--;
   }
}

class Customer {
//   2. 이름, 폰, 돈, 할인율
   String name;
   String phone;
   int money;
   int discount;
   
   public Customer() {;}
   public Customer(String name, String phone, int money, int discount) {
      this.name = name;
      this.phone = phone;
      this.money = money;
      this.discount = discount;
   }
   
}

public class ClassTask2 {
   public static void main(String[] args) {
//      3. 마켓, 소비자를 객체화 시키고,
//      소비자에게 마켓의 물건을 판매
//      마켓의 상품 재고와, 소비자의 남은 금액을 출력
      Market emart = new Market("사과", 20000, 20);
      Customer ksh = new Customer("김세환", "01000000000", 40000, 30);
      emart.sell(ksh);
      
      System.out.println(emart.productStock);
      System.out.println(ksh.money);
   }
}


