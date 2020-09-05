public class AccountNumberShuffle {

    public static void main(String[] args) {
        int i28 = 123456; //7
        int i7 = 130; //5
        int iV = 12345; //22
        int i0 = 25678; //0

        AccountNumberShuffle accountNumberShuffle = new AccountNumberShuffle();
        System.out.println( "123456 i28 : "+  accountNumberShuffle.solution(i28));
        System.out.println( "130 i7 : "+  accountNumberShuffle.solution(i7));
        System.out.println( "12345 iV : "+  accountNumberShuffle.solution(iV));
        System.out.println( "25678 i0 : "+  accountNumberShuffle.solution(i0));
    }

    public int solution(int s) {
        String number = String.valueOf(s);
        char []numberArr = number.toCharArray();
        StringBuffer shuffleNumber = new StringBuffer();
        for(int k=0; k<numberArr.length/2; k++){
            shuffleNumber.append(numberArr[k]).append(numberArr[(numberArr.length-1)-k]);
        }
        if(numberArr.length %2 ==1){
            shuffleNumber.append(numberArr[numberArr.length/2]);
        }
        return Integer.parseInt(shuffleNumber.toString());
    }
}
