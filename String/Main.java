

public class Main{
    public static void main(String[] args) {
        String s="kela/mimi/chaton";

        /** STRINGTOKENIZER 
         * StringTokenizer st=new StringTokenizer(s,"/");
        // while (st.hasMoreTokens())
        // System.out.println(st.nextToken());
        */
       
        // StringBuilder sbuilder= new StringBuilder(s);
        // sbuilder.append(" bonjour");
        // System.out.println(sbuilder);    

        String a="hello";
        String b="world";
        String sb= new StringBuffer(a).append(b).toString();
        System.out.println(sb);
    }
}