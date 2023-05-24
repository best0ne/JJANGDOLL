package quiz;

public class Quiz문자열2 {
public static void main(String[] args) {
	
	String str = new String ("짱돌-2017년\n깡돌-2015년\n맷돌-2018년");
	
	System.out.println("=====변경전str=====");
	System.out.println(str);
	String rep = str.replace("-", ":");
	System.out.println("=====변경후str=====");	
	System.out.println(rep);
}
}
