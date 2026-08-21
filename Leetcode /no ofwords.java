class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int count;
        for(int i=0;i<sentences.length;i++){
            count=sentences[i].split(" ").length;
            if(max<count)
            max=count;
        }
    return max;
    }
}
