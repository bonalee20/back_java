package exceptTest;

public class ExceptTest {
	public static void main(String[] args) {
		// alt + shift + z 단축키 try, catch
		int[] arData = new int [5];
		try {
			//arData[5] = 10;
			
			System.out.println(10/0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 체크");
		}catch (ArithmeticException e) {
			System.out.println("delete 0");
		}
		
		catch (Exception e) {
			// 마지막 캐치
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
