import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static void dfs(String str, String perm, List<String> list){
        if(str.length() == 0){
            list.add(perm);
        }

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String temp = str.substring(0,i) + str.substring(i + 1);
            dfs(temp, perm+ch, list);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<String>();
        dfs(s, "", list);
        list.forEach(val -> System.out.println(val));
    }
}
