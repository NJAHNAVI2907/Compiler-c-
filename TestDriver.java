import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;




public class TestDriver {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        try
        {
            CharStream input = new ANTLRFileStream("C:\\Users\\jahna\\eclipse-workspace\\rdp_1\\src\\input");
            gram lexer = new gram(input);
            /*Token token;
            while ((token = lexer.nextToken()).getType()!= -1)
            {
                System.out.println("<" + token.getType() + ", "+token.getText() + ">");
            }*/
            rdp rdp = new rdp(lexer);
            System.out.println(rdp.start());
        }
        catch(Throwable t)
        {
           System.out.println("Exception: "+t);
           t.printStackTrace();
        }



   }



}