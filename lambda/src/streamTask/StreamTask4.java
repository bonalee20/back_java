package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamTask4 {
	public static void main(String[] args) {

		
		ArrayList<Member> members = new ArrayList<Member>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("배승원", "개발_놀기", "자바가 제일 쉬웠어요");
		
		Member[] memArray = new Member[] {member1, member2, member3, member4, member5, member6, member7 };
		members.addAll(Arrays.asList(memArray));
		
		//members.add(member1);
		//	members.add(member2);
		//members.add(member3);
		//members.add(member4);
		//members.add(member5);
		//members.add(member6);
		//members.add(member7);
		
		
		// 1. 각 멤버의 취미를 검토하시오. 취미 중 개밸을 좋아하는 가진 멤버를 데이터를 출력
		
		members.stream().filter((Member member)-> member.getHobby().contains("개발")).forEach(System.out::print);
		members.stream().filter((user)-> user.getHobby().contains("개발")).forEach(System.out::print);
		
		System.out.println("\n2");
		// 2. 취미 중 개밸을 좋아하는 가진 멤버를 개발자 000으로 변경 후 출력
		members.stream().filter((user)-> user.getHobby().contains("개발"))
			.map((member) -> "개발자" + member.getName()) // StringStream
			.forEach(System.out::println);
		
		System.out.println("\n3");
		// 3. 취미가 3개 이상 가진 사람의 아이디를 출력하세요
		// 3개의 취미= _ 2개 
		// 취미 다 글자 하나씩 가지고 와서 _ 비교
		members.stream().filter(user-> user.getHobby().split("_").length>=3)
		.forEach(System.out::print);
		
		System.out.println("\n4");
		
//      4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담기
		ArrayList<Long> hobbyIds =members
				.stream().filter(user-> user.getHobby().split("_").length>=3)
				.map(user->user.getId())
				.collect(Collectors.toCollection(ArrayList::new)); // id를 ArrayList로 변경하고
				
		System.out.println(hobbyIds);
		
		//5. hobbyIds 에 존재하는 id 와 같은를 가진 members의 데이터 소개를 출력하기
		//member의 .,[0, 1, 5] -> 값 가지고 오기 
		members.stream()
		.filter(user -> user.getId() == hobbyIds.get(0)|| user.getId() == hobbyIds.get(1)||user.getId() == hobbyIds.get(2))
		.map(user->user.getIntroduce());
		//.forEach(System.out::print);
		
		// hobbyIds=[0, 1, 5] -> 값 가지고 오기  members id 와ㅏ 동일
		System.out.println("5");
		hobbyIds
			.stream()
			.filter(num -> num == members.get(0).getId()|| num == members.get(1).getId()|| num == members.get(2).getId())
			.map(user->{
				String result= "";
				for(int i =0; i<3;i++) {
				result +=  members.get(i).getIntroduce();
				};
				return result;
			})
			.forEach(System.out::println);
		
		
		//
		hobbyIds.stream()
			.mapToInt(Long::intValue)
			.boxed()
			.map(i->members.get(i))
			.map(u->u.getIntroduce());
		
		//6.소개를 가장 길게 쓴 사람의 정보를 문자열로 출력하기
		//소개를 가장 길게 쓴 사람 = 14 
		System.out.println("6");
		
		members
			.stream()
			.filter(user->user.getIntroduce().length()==14)
			.map(user-> "이름:"+user.getName()+"\n취미:"+user.getHobby()+"\n취미:"+user.getIntroduce())
			.forEach(System.out::print);

		
		
		
		//최대 길이
		Integer maxLength = 0;
		for(Member m: members) {
			//if(longestInt)
		}
		
	}
}

