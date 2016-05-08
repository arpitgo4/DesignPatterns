package DAOPattern;

/**
 * Created by arpit on 2/2/16.
 */
public class Main {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();
        System.out.println(studentDAO.getName());
    }


   /* public static String removeUnicode(String s){
        StringBuilder str = new StringBuilder(s);
        int nextIndex = 0;
        while((nextIndex = str.indexOf("\\u", nextIndex + 1)) != -1){
            String unicodeChar = str.substring(nextIndex, nextIndex + 6);
            unicodeChar = "\\" + unicodeChar;
            byte[] bytes = null;
            String normalChar = null;
            try {
                bytes = unicodeChar.getBytes("UTF-8");
                ByteBuffer buf2 = ByteBuffer.wrap(bytes);
                ByteBuffer buf = Charset.forName("UTF-8").decode(buf2);
                normalChar = new String(buf.array(), "UTF-8");
                System.out.println(normalChar);
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            str.replace(nextIndex, nextIndex + 6, " ");
        }
        return str.toString();
    }*/
}
