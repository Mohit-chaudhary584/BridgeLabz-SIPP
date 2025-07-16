public class ConcatenateStrings {
    public static String concat(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"Java", "is", "fun"};
        System.out.println(concat(arr));
    }
}
