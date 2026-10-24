class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            int length = s.length();
            str.append(length);
            str.append(' ');
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int index = 0;
        while(index < str.length()){
            StringBuilder strLen = new StringBuilder();
            while(str.charAt(index) >= '0' && str.charAt(index) <= '9'){
                strLen.append(str.charAt(index));
                index++;
            }
            index++;
            StringBuilder curString = new StringBuilder();
            int length = Integer.parseInt(strLen.toString());
            while(length > 0){
                curString.append(str.charAt(index++));
                length--;
            }
            strs.add(curString.toString());
        }
        return strs;
    }
}
