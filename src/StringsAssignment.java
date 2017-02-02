import java.util.HashMap;
import java.util.Stack;

/**
 * Created by rishabhsheoran on 1/31/17.
 */
public class StringsAssignment {

    public boolean isAnagramMethod1(String s1, String s2){
        Integer[] a = new Integer[128];
        for (int i = 0; i<a.length ; i++) {
            a[i]=0;
        }
        char sa1[] = s1.toLowerCase().toCharArray();
        char sa2[] = s2.toLowerCase().toCharArray();
        for (int i = 0; i <sa1.length ; i++) {
            if(sa1[i]==' '){
                continue;
            }
            a[sa1[i]]++;
        }
        for (int i = 0; i<sa2.length  ; i++) {
            if(sa2[i]==' '){
                continue;
            }
            a[sa2[i]]--;
        }

        for (int j = 0; j <a.length ; j++) {
            if(a[j]!=0){
                return false;
            }
        }
        return true;
    }



    public boolean isAnagramMethod2(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
         //  \s is regex(regular expression) for spaces in java and here it is replaced by "" using replaceAll
        String s1 = str1.replaceAll("\\s","").toLowerCase();
        String s2 = str2.replaceAll("\\s","").toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char charKey = s1.charAt(i);
            int charValue = 0;
            if (map.containsKey(charKey)) {
                charValue = map.get(charKey);   //getting the value at key
            }
            map.put(charKey,++charValue);
            charValue=0;
            charKey=s2.charAt(i);
            if(map.containsKey(charKey)){
                charValue = map.get(charKey);
            }
            map.put(charKey,--charValue);

        }
        for (Integer i:map.values()
             ) {
            if(i!=0){
                return false;
            }
        }
        return true;
    }



    public String reverseStringMethod1(String str) {

        char a[]=str.toCharArray();
        int i = 0, j = str.length() - 1;
        char temp;
        while (j > i) {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
      //  String str1 = new String(a); way to provide value of character array to new string
        str=String.valueOf(a); //way to provide value of character array to an old string
        return str;
    }

    public String reverseStringMethod2(String str){
        Stack<Character> stack = new Stack<>();
        char a[]=str.toCharArray();
        for (char c:a
             ) {
            stack.push(c);
        }
        int i=0;
        while(!stack.empty()){
            a[i]=stack.peek();
            stack.pop();
            i++;
        }
        str=String.valueOf(a);
        return str;
    }

    public static void main(String[] args) {
        StringsAssignment sa = new StringsAssignment();
        System.out.println(sa.reverseStringMethod1("iam rishabh"));
        System.out.println(sa.reverseStringMethod2("iam rishabh"));
        System.out.println(sa.isAnagramMethod1("abcd","dcbA"));
        System.out.println(sa.isAnagramMethod1("abcd","dcbl"));
        System.out.println(sa.isAnagramMethod1("Mother In Law", "Hitler Woman"));
        System.out.println(sa.isAnagramMethod1("joy", "enjoy"));
        System.out.println(sa.isAnagramMethod2("abcd","dcbA"));
        System.out.println(sa.isAnagramMethod2("abcd","dcbl"));
        System.out.println(sa.isAnagramMethod2("Mother In Law", "Hitler Woman"));
        System.out.println(sa.isAnagramMethod2("aac", "bcb"));
    }
}