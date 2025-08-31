package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class Sms {
	//  메서드 안에 넣기!!!
	public static void main(String[] args) {
	      String api_key = "NCSOX2XVBJCPYZLE";
	      String api_secret = "BW7XYNFD8XSLHLV74VE6JH7EZVAGNSCO";
	      Message coolsms = new Message(api_key, api_secret);
	      
	      // 4 params(to, from, type, text) are mandatory. must be filled
	      HashMap<String, String> params = new HashMap<String, String>();
	      params.put("to", "01027570641");
	      params.put("from", "01027570641");
	      params.put("type", "SMS");
	      params.put("text", "나다.");
	      params.put("app_version", "text app 1.2"); // application name and version

	      try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	      } catch (CoolsmsException e) { 
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	      }
	}
}
