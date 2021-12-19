public class Report5 {
    public static void main(String[] args){
        String str = null;
 /*         int num;
  
        num = str.length();
 */
        try {
            System.out.println(str.length());
            } catch (NullPointerException e){
                System.out.println(e.getMessage());
                System.out.println("NullPointerExceptionが発生");
            }
    }
 }
 