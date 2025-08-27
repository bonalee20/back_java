package anonymousTest;

public class Starbucks {
	   
	   public static void main(String[] args) {
	      Form form = new Form() {
	         
	         private String[] menus;
	         
	         @Override
	         public void registerMenus(String[] menus) {
	        	String[] employeeMenu = {"자몽허니블랙티", "자몽망고코코넛","커피"};
	        	System.out.println(employeeMenu[1]);
	        	
	         }
	         
	         
	         @Override
	         public void showMenus() {        	 

	         }
	         
	         @Override
	         public void sell(String menu) {
	            
	         }

	      };
	      
	      
//	      Form 메서드를 선언 후 메서드 1번씩 모두 사용하기
	      
	      
	      
	   }
	}

