import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> dig = new ArrayList<>();
        List<String> let = new ArrayList<>();
        for (String log : logs) {
            boolean isDigit = false;
            String s = log.split(" ")[1];
            for(int i = 0; i < s.length(); i++){
                if (Character.isDigit(s.charAt(i))){
                    isDigit = true;
                    break;
                }
            }
            if(isDigit){
                dig.add(log);
            }else{
                let.add(log);
            }
        }

        Collections.sort(let, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String sb1 = o1.substring(o1.split(" ")[0].length()+1 );
                String sb2 = o2.substring(o2.split(" ")[0].length()+1 );
                if(sb1.toString().compareTo(sb2.toString()) == 0){
                    return o1.split(" ")[0].compareTo(o2.split(" ")[0]);
                }

                return sb1.toString().compareTo(sb2.toString());
            }
        });

        List<String> rst = new ArrayList<>();
        for(String l : let){
            rst.add(l);
        }
        for(String d : dig){
            rst.add(d);
        }
        System.out.println("let = " + let);
        System.out.println("dig = " + dig);
        return rst.toArray(new String[0]);
    }
}


//Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
//Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
//Explanation:
//The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
//The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".
class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] logs = {"j mo", "5 m w", "g 07", "o 2 0", "t q h"};
        s.reorderLogFiles(logs);
    }
}