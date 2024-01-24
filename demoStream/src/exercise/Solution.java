package demoStream.src.exercise;

class Solution {
    public String finalString(String s) {
        char[] result = new char[s.length()];
        int index = 0;

        for(char c : s.toCharArray()) {
            if(c == 'i') { 
                int start = 0;
                int end = index - 1;
                while(start < end) {
                    char temp = result[start];
                    result[start] = result[end];
                    result[end] = temp;
                    start++;
                    end--;
                }
            }
            else {
                result[index] = c;
                index++;
            }
        }
        
        return new String(result, 0, index);
    }
}