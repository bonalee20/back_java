package castingTask4;
//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
// 
//- 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.

//결과 확인

//1.손님 = 회원 비회원 상속으로 풀기
//2. 상품 그냥
//3. 마켓 = 손님과 상품 속성 가지고 오기

public class MarketNonMember extends MarketMember{

	public MarketNonMember() {;}
	
	@Override
	int getpointMember() {
		System.out.println(5+"% 적립");
		return 5;
	}

}
