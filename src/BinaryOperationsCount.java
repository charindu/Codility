public class BinaryOperationsCount {

    public static void main(String[] args) {
        String s28 = "011100"; //7
        String s7 = "111"; //5
        String strV = "1111010101111"; //22
        String str0 = "0000"; //0

        BinaryOperationsCount binaryOperationsCount = new BinaryOperationsCount();
        System.out.println( "Op Counts s28 : "+  binaryOperationsCount.getOpperationsCount(s28));
        System.out.println( "Op Counts s7 : "+  binaryOperationsCount.getOpperationsCount(s7));
        System.out.println( "Op Counts strV : "+  binaryOperationsCount.getOpperationsCount(strV));
        System.out.println( "Op Counts str0 : "+  binaryOperationsCount.getOpperationsCount(str0));
    }

    public int getOpperationsCount( String binaryStr){
        int oppCount = 0;
        int value = Integer.parseInt(binaryStr, 2);
        for(;;){
            if(value ==0){
                return oppCount;
            }else if( value%2 == 0){ //even
                value /= 2;
                oppCount ++;
            }else { //odd
                value -=1;
                oppCount ++;
            }
        }
    }
}
