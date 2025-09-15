class Solution {
    public int canBeTypedWords(String text, String bl) {
        String[] words = text.split(" ");
        int res=0;
        for(String s : words){
            int c=0;
            for(char ch:bl.toCharArray()){
                if(s.contains(String.valueOf(ch))){
                    c++;
                    break;
                }
            }
            if(c==0) res++;
        }

        return res;
    }


}