public class MaxWordsCount {
    public static void main(String[] args) {
        String str1 =  ".. .?"; //0
        String str2 =  "We test coders. Give us a try?"; //4
        String str3 =  "Forget  CVs..Save time . x x"; //2
        String str4 =  "Some some! time . x x"; //2

        MaxWordsCount maxWordsCount = new MaxWordsCount();
        System.out.println( "Max Words Count str1 : "+  maxWordsCount.getMaxWordsCount(str1));
        System.out.println( "Max Words Count str2 : "+  maxWordsCount.getMaxWordsCount(str2));
        System.out.println( "Max Words Count str3 : "+  maxWordsCount.getMaxWordsCount(str3));
        System.out.println( "Max Words Count str4 : "+  maxWordsCount.getMaxWordsCount(str4));

    }

    public int getMaxWordsCount( String text){
        int count = 0;
        int currCount;
        //String[] sentences = text.split("\\?|\\.|\\!");
        String[] sentences = text.split("[.!?]");
        for( String sen : sentences){
            if(!sen.trim().isEmpty()){
                String[] splited = sen.trim().split("\\s+");
                currCount = splited.length;
                if( currCount >= count){
                    count = currCount;
                }
            }
        }

        return count;
    }
}
