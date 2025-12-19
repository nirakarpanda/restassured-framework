package api.test;


public class FirstNonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="hhssSSoftware Job";
		boolean flag = true;
		
		for(char i :str.toCharArray())
        {
            // if current character is the last occurrence in the string
            if (str.indexOf(i) == str.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

	}

}
