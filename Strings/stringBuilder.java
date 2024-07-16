public class stringBuilder{
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
        for(char ch='a'; ch <='z';ch++){
            sb.append(ch);
        }
        System.out.println("the characters are: "+sb);
        System.out.println("the length of characters are: "+sb.length());
    }
}