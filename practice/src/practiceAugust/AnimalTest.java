// AnimalTest.java
// Animal, Dog, Tiger, Pet, PetAdapter를 하나의 파일에 합친 예제

// 동물의 공통적인 특징을 담은 추상 클래스
package practiceAugust;

abstract class Animal {
    // 동물이 내는 소리를 정의 (내용 없음 → 자식 클래스가 반드시 구현해야 함)
    public abstract void sound();
}

// 반려동물 규칙을 정의하는 인터페이스
interface Pet {
    // 반려동물이라면 반드시 구현해야 하는 메서드
    void play();
}

// Dog 클래스: Animal을 상속받고 Pet 인터페이스도 구현
class Dog extends Animal implements Pet {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void play() {
        System.out.println("강아지가 주인과 놀아요!");
    }
}

// Tiger 클래스: Animal만 상속받음 (Pet 아님)
class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("어흥");
    }
}

// PetAdapter: Animal을 Pet처럼 사용할 수 있게 만들어주는 어댑터
class PetAdapter implements Pet {
    private Animal animal; // 내부적으로 Animal을 저장

    public PetAdapter(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void play() {
        System.out.print("반려동물이 되어: ");
        animal.sound(); // Animal의 소리를 대신 호출
    }
}

// 테스트 실행 클래스
public class AnimalTest {
    public static void main(String[] args) {
        // Dog는 Animal이자 Pet
        Animal dog = new Dog();
        dog.sound();  // 출력: 멍멍

        Pet myDog = new Dog();
        myDog.play(); // 출력: 강아지가 주인과 놀아요!

        // Tiger는 Animal이지만 Pet은 아님
        Animal tiger = new Tiger();
        tiger.sound(); // 출력: 어흥

        // Adapter를 이용해 Tiger를 Pet처럼 사용
        Pet petTiger = new PetAdapter(tiger);
        petTiger.play(); // 출력: 반려동물이 되어: 어흥
    }
}
