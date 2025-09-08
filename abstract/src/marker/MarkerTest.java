package marker;

public class MarkerTest {

//	어떤 동물이 어떤 분류인지 알려주는 메서드
//	1. 초식동물이라면 초식동물
//	2. 육식동물이라면 육식동물
//	3. 아니라면 잡식동물
	public void checkKind(Animal animal) {
		if(animal instanceof CarnivoreMarker) {
			System.out.println("육식 동물");
		}else if(animal instanceof HerviboreMarker) {
			System.out.println("초식 동물");
		}else {
			System.out.println("잡식 동물");
		}
	}
	
	public void checkKinds(Animal[] animals) {
		for(int i = 0; i < animals.length; i++){
			if(animals[i] instanceof CarnivoreMarker) {
				System.out.println("육식 동물");
			}else if(animals[i] instanceof HerviboreMarker) {
				System.out.println("초식 동물");
			}else {
				System.out.println("잡식 동물");
			}
		}
	}
	
//	메서드 완성 후 각 동물들을 객체화 시킨 후 메서드 확인 출력!
	public static void main(String[] args) {
		new MarkerTest().checkKinds(new Animal[] {new Bear(), new Cow(), new Dog(), new Rabbit()});
	}
}






