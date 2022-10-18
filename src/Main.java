import java.util.HashMap;
class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        System.out.println(word);
        StringBuilder newText = new StringBuilder("");
        HashMap<Character,Integer> stringHashMap = new HashMap<Character, Integer>();
        for(int i = 0; i < word.length(); i++){
            if(!stringHashMap.containsKey(word.charAt(i)))
                stringHashMap.put(word.charAt(i),1);
            else
                stringHashMap.replace(word.charAt(i),stringHashMap.get(word.charAt(i))+1);
        }
        for(int i =0; i < word.length();i++){
            if(stringHashMap.get(word.charAt(i)) > 1)
                newText.append(")");
            else
                newText.append("(");
        }
        System.out.println(stringHashMap.keySet());
        System.out.println(stringHashMap.values());
        return newText.toString();
    }
}