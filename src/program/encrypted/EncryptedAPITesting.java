package program.encrypted;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.json.JSONException;
import org.json.JSONObject;

public class EncryptedAPITesting {
	

	private static String secretKey = "E4iz26Xq9yKlwSXpINPT5SS0ipYC2PkHbI8CPKuZTRI=";
	//private static String secretKey = "sushil21345678979";
	private static String IVsecretKey = "GMzal197YTKs8OAWTtGR7w==";

	public static void main(String[] args) throws Exception {
	
		JSONObject request=new JSONObject();
		try {
			request.put("PanReferenceID", "4303200500000015");
			
			JSONObject tokenLife=new JSONObject();
			tokenLife.put("RequestId", "123456");
			tokenLife.put("OriginatingChannel" , "VISA");
			tokenLife.put("operatorID" , "11557");
			tokenLife.put("operationType" , "DELETE");
						tokenLife.put("operationReason" , "CHANGE STATUS REASON");
						tokenLife.put("TokenRequestorId" , "40010075000");
						tokenLife.put("TokenreferencerId" , "VISA40010075000");
			
			 byte[] AESkeyDecode = Base64.getDecoder().decode(secretKey);
	    	byte[] IVDecode = Base64.getDecoder().decode(IVsecretKey);
	    	String tmp = tokenLife.toString();
	    	byte[] cipherText =encrypt(tmp.getBytes(), AESkeyDecode, IVDecode);
	    	
	    	//byte[] cipherText = aes.encrypt(tmp.getBytes(), AESkeyDecode, IVDecode);
	        
			System.out.println("Encrypted Text : " + Base64.getEncoder().encodeToString(cipherText));
			String encryptedxmlpayload = Base64.getEncoder().encodeToString(cipherText);

			String finalpayload = encrytPayload(encryptedxmlpayload);// Encrypted Payload need to pass at end point
			System.out.println("\nFinalPayload\n" + finalpayload);
			System.out.println(cipherText);   
			
			String responEncryot="C7x39cuVzBYXIIhFMicYNZT+nyjiD0GxfW51atn6nKfmAC+dwvtgD5Ld9fCx4hf4CHbjx1R4UDvn2s2/d4wVKA9/25Z+8WvYlTcdJpV6/p/p72yW31UAJusVezCnFO/oVJDCp7pA9eT7BgJ+YQZ6lVmv3s2O6ovIgtlyfCMNxZp7aecnWQADaVavC9triaVl";
			
			 
			
			byte[] srcByte =
					  Base64.getDecoder().decode(responEncryot);
			  String decryptedpayloadresponse  = decrypt(srcByte, AESkeyDecode, IVDecode);
			  
			  System.out.println("Response value =: "+decryptedpayloadresponse);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" JSON Value = "+request);

	}
	
	
	public static String encrytPayload(String encryted) {
		String payload = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n<soapenv:Body>"
				+ "" + encryted + "\n</soapenv:Body>\n</soapenv:Envelope>";

		return payload;  
	}  

	public static String decrypt (byte[] cipherText, byte[] key,byte[] IV) throws Exception
	{
		//Get Cipher Instance
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		//Create SecretKeySpec
		SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
		//Create IvParameterSpec
		IvParameterSpec ivSpec = new IvParameterSpec(IV);
		//Initialize Cipher for DECRYPT_MODE
		cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
		//Perform Decryption
		byte[] decryptedText = cipher.doFinal(cipherText);

		return new String(decryptedText);
	}
	public static byte[] encrypt (byte[] plaintext,byte[] key,byte[] IV ) throws Exception
	{
		//Get Cipher Instance
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		//Create SecretKeySpec
		SecretKeySpec keySpec = new SecretKeySpec(key, "AES");

		//Create IvParameterSpec
		IvParameterSpec ivSpec = new IvParameterSpec(IV);

		//Initialize Cipher for ENCRYPT_MODE
		cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
		//Perform Encryption
		byte[] cipherText = cipher.doFinal(plaintext);

		return cipherText;
	}

}
