package interview;
// reverseing the String 
public class Reversestr {
    public static void main(String[] args) {
        
    
    String str = "Paratha";
    StringBuffer answer = new StringBuffer();

    for(int i = str.length()-1;i>=0;i--){
        answer.append(str.charAt(i));

    }
    System.out.println(answer);
}
}
