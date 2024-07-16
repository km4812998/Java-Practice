public class subString {
    public static void main(String[] args) {
        String str = "MintuKumar";
        System.out.println(subStr(str, 0, 5));

        // IN JAVA THERE IS AN INBUILT FUNCTION CALLED AS (classname.substring(si,ei)) as given below------
        // System.out.println(str.substring(0, 5));

    }

    public static String subStr(String str, int si, int ei) {
        String sString = "";
        for (int i = si; i < ei; i++) {
            sString += str.charAt(i);
        }
        return sString;
    }
}
