import java.util.*;

class checkBinary{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		User u = new User();
		boolean b = u.isBinary(str);
		if(b)
			System.out.println(1);
		else
			System.out.println(0);
	}
}

class User{
	boolean isBinary(String str){
		char[] ch = str.toCharArray();
		boolean result = false;
		
		for(int i = 0; i < str.length(); i++){
			if(ch[i] == '1' || ch[i] == '0')
				result = true;
			else
				return false;
		}
		return result;
	}
}