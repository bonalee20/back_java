package practiceSep8;

import java.util.Objects;

public class One {

		private Long id; 
		private String userName;
		private String userEmail;
		private String userPassword;
		private static Long seq; // 고유변호 생성을 위한 static 변수
		
		static {
			seq = 1L; // static 블록: 클래서가 처음 로딩될 때 실행됨 . seq  = 1로초기화
					
		}
		
		
		{
			this.id = seq++; // 인스턴스 블록 : 객체가 생성 시 실행됨. id에 현재 seq 값을 넣고 seq를 1 증가 시킴=> User 객체가 만들어질 때마다 id 자동 증가
			
		}

		public One() {;}
		

		public One( String userName, String userEmail, String userPassword) {
			super();

			this.userName = userName;
			this.userEmail = userEmail;
			this.userPassword = userPassword;
		}


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public static Long getSeq() {
			return seq;
		}

		public static void setSeq(Long seq) {
			One.seq = seq;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
					+ userPassword + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(id);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			One other = (One) obj;
			return Objects.equals(id, other.id);
		}

		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	

