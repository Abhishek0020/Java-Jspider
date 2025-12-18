package YoutubeString;

public class StringToByteArray {
	public static void main(String[] args) {
        String str = "Hello World";
       
        
        
        // Convert string to byte array
        byte[] byteArray = str.getBytes();
        
        // Print the byte array
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
    }

}
