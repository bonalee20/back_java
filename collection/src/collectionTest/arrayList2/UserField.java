package collectionTest.arrayList2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class UserField {
//   DB
   public ArrayList<User> users = DBconnecter.users;
   public static String userId;
   public static String code;
   final int KEY = 300;
   
//      아이디 검사
   public User checkId(String id) {
//      id를 받아서 db에 아이디가 있는지 아닌지를 검사한다.클래스를 리턴할 꺼다 => 아닐 시 null
      for(User user: users) {
         if(user.getId().equals(id)) {
            return user;
         }
      }
      return null;
      
   }
   
//      회원 가입
   public void join(User user) {
      User userInDb = checkId(user.getId());
      if(userInDb == null) {
         users.add(user);
      }
      
   }
   
//      로그인
   public boolean login(User user) {
//      아이디를 검사
      User userInDb = checkId(user.getId());
      if(userInDb != null) {
//         비밀번호 검사
         if(userInDb.getPassword().equals(user.getPassword())) {
            userId = userInDb.getId();
            return true;
         }
      }
      return false;
   }
   
   
//      로그아웃 
   public void logout() {
      userId = null;
   }
   
//      암호화
   public String encrypt(String password) {
      String encryptPassword = "";
      for(int i = 0; i < password.length(); i++) {
         encryptPassword += (char)(password.charAt(i) * KEY);
      }
      return encryptPassword;
   }
  //========day14=======================================================================================================
//      비밀번호 변경(마이페이지)
   
//      비밀번호 변경(비밀번호 변경 30일)
//     	인증번호 생성
   public String randomNumber() {
	   String code = "";
	   for(int i = 0; i < 6; i++) {
		   code += (int)(Math.random()*10);
		   this.code = code;
	   }
	   return code;
   }
   
//      인증번호 전송
   public void sendEmail(String toMemberEmail) {
       // 메일 인코딩
       final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
       
       //원하는 메일 제목 작성
       String subject = "메일 발송 테스트";
       
       //보낸 이메일 작성
       String fromEmail = "bonalee0226@naver.com";
       //String fromEmail = "내 이메일 주소";
       String fromUsername = "이영서";
       
       String toEmail = "bboonnaaa0226@gmail.com"; // 콤마(,)로 여러개 나열
       //tpghksgit23@gmail.com
       
       //도메인 사용할 필요 없다
       //앱비밀번호
       final String username = "bboonnaaa0226@gmail.com";         
       final String password = "sywj lgle kgcx exjj";
       
       
       // 랜덤 코드 생성 여기에 있어도 괜찮다
       
       
       // 메일에 출력할 텍스트
       String html = null;
       StringBuffer sb = new StringBuffer();
       sb.append("<h3>인증번호 발송</h3>\n");
       sb.append("<h4>[인증번호 6자리]</h4>\n");    
       sb.append("<h4>"+code+"</h4>\n");  
       sb.append("<h4>test</h4>\n");  
       
       html = sb.toString();
       
       // 메일 옵션 설정
       Properties props = new Properties();    
       props.put("mail.smtp.starttls.enable", "true");
       props.put("mail.smtp.host", "smtp.gmail.com");
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.port", "587");
       props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
       props.put("mail.smtp.ssl.protocols", "TLSv1.2");
       
       try {
         // 메일 서버  인증 계정 설정
         Authenticator auth = new Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication() {
             return new PasswordAuthentication(username, password);
           }
         };
         
         // 메일 세션 생성
         Session session = Session.getDefaultInstance(props, auth);
         
         // 메일 송/수신 옵션 설정
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(fromEmail, fromUsername));
         message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
         message.setSubject(subject);
         message.setSentDate(new Date());
         
//         // 메일 콘텐츠 설정
         Multipart mParts = new MimeMultipart();
         MimeBodyPart mTextPart = new MimeBodyPart();
         MimeBodyPart mFilePart = null;
//    
//         // 메일 콘텐츠 - 내용
         mTextPart.setText(html, bodyEncoding, "html");
         mParts.addBodyPart(mTextPart);
//               
//         // 메일 콘텐츠 설정
         message.setContent(mParts);
    
         // 메일 발송
         Transport.send( message );
         System.out.println("인증번호 발송 완료");
       } catch ( Exception e ) {
         e.printStackTrace();
       }
	
	   
   }
   
   

//인증번호 확인
   public boolean checkCode(String inputCode) {
	   return code.equals(inputCode);
   }
   
   
   public static void main(String[] args) {
      UserField uf = new UserField();
      Scanner sc = new Scanner(System.in);
      String message = "인증번호 입력하세요", inputCode = null;
      int errorCount = 0;
      
      System.out.println(uf.encrypt("AbCddd"));
      uf.randomNumber();
      uf.sendEmail("bonalee0226@naver.com");
      //이메일 인증번호 확인
      
      //System.out.println(message);
      //inputCode = sc.nextLine().trim();
      
      
     do {
    	  if(errorCount==0) {
    		  System.out.println(message);
    		  inputCode = sc.nextLine().trim();
    		
    	  }else if(errorCount>0 && errorCount <3){
    
    		  System.out.println("다시 입력하세요");
    		  inputCode = sc.nextLine().trim();
    		  
    	  }else if(errorCount>3){
    		  System.out.println("go to start");
    		  break;
    	  }
    	  errorCount++;
    	  
      }
    while(!uf.checkCode(inputCode));
      
      if(uf.checkCode(inputCode)) {
    	  System.out.println("인증 완료");
      }else {
    	  System.out.println("fail");
      }
      	
      
      
   }
   
   
   
   
}

