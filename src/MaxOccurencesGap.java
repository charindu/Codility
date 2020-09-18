import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxOccurencesGap {
    public static void main(String[] args) {
        MaxOccurencesGap  maxOccurencesGap = new MaxOccurencesGap();
        int arr[] = new int[]{ 4,7,10,8,10,11,17,13,13,14,17,19};
        System.out.println( "Max Occurrences Gap : " + maxOccurencesGap.getMaxOccurGap(arr));

    }

    public int getMaxOccurGap( int arr[]){
        int gap =0;
        int maxOccrGap =0;
        int sameGapOccr =1;
        int tempMaxCount =0;
        List<Integer> gapList = new ArrayList<>();
        for( int i=0; i< arr.length-1; i++){
            gapList.add((arr[i+1]- arr[i]));
        }

        for( int k=0; k< gapList.size()-1; k++){
            gap = gapList.get(k+1)-gapList.get(k);
            if( gap ==0){
                sameGapOccr++;
                if(sameGapOccr > tempMaxCount){
                    tempMaxCount = sameGapOccr;
                    maxOccrGap = gapList.get(k);
                }
            }else {
                sameGapOccr =1;
            }
        }

        return maxOccrGap;
    }
}
