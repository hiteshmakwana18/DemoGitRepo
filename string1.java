public class string1 {
    public static void main(String[] args) {
        
        StringBuffer sb= new StringBuffer("CHARUSAT");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("UNIVERSITY");
      System.out.println(sb);
      sb.deleteCharAt(2);
      System.out.println(sb);
      sb.delete(2, 3);
      System.out.println(sb);
    }
}
