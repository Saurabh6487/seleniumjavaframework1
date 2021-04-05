package encodeandDecodepasswrd;

import org.apache.commons.codec.binary.Base64;

public class EncanddecString 
{
	public static void main(String[] args)
	{
	
		String str="Pune@123";
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		System.out.println("encoded string:"+encodedString);
		byte[] decodedString = Base64.decodeBase64(encodedString);
		System.out.println("decoded string:"+new String(decodedString));
		
	}
}
