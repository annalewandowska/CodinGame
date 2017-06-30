package pl.codeme.obiekty.klasy;

import java.util.Scanner;

public class ChuckNorris {

	public static void main(String[] args) {

		String answer="";
		
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();
		byte[] messageInBytes = message.getBytes();
		for(int i = 0; i < messageInBytes.length; i++){
			answer+=lengthCheck(Integer.toBinaryString(messageInBytes[i]));
		}
		answer = mask(answer);
		
		in.close();
		System.out.println(answer);
	}	
	
	public static String mask(String s){
		
		String output = "";
		
		if(s.startsWith("0")){
			output += "00 0";
		}else if (s.startsWith("1")){
			output += "0 0";
		}
		
		for(int i = 1; i < s.length(); i++){
			if((s.charAt(i) == '0' && s.charAt(i-1) == '0') || (s.charAt(i) == '1' && s.charAt(i-1) == '1')){
				output += "0";
			}else if(s.charAt(i) == '0' && s.charAt(i-1) == '1'){
				output += " 00 0";
			}else if(s.charAt(i) == '1' && s.charAt(i-1) == '0'){
				output += " 0 0";
			}
		}
		
		return output;
	}
	
	public static String lengthCheck(String s){
		return "0000000".substring(0, 7 - s.length()) + s;
	}
	

}
