package castingTask4;
//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰


//1.손님 = 회원 비회원 상속으로 풀기
//2. 상품 그냥
//3. 마켓 = 손님과 상품 속성 가지고 오기
public class MarketMember {
	String name;
	private int phone;
	private int total;
	private int point;
	private int coupon;
	
	public MarketMember() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	//-----------------------------------
	
	
	int getpointMember() {
		System.out.println(10+"% 적립");
		return 10;
	}
	
}
