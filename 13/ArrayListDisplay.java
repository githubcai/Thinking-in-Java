import java.util.*;

public class ArrayListDisplay{
    public static void main(String[] args){
        ArrayList<String> st = new ArrayList<String>();
        for(String s:"String".split("")){
            st.add(s);
        }
        System.out.println(st);
    }
}
