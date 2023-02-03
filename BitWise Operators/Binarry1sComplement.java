public class Binarry1sComplement {
    
    public static void main(String[] args) {
        //BINARRY COMPLIMENT OF:
        // ~0 = 1
        // ~1 = 0
        // ~5 = 0 0000101
        // => 1 1111010
        //FIND ITS 1'S COMPLEMENT(~n)
        //1'S COMPLEMENT OF 5 IS: 0 0000101
        // NOW ADD 1 TO THE 1'S COMPLEMENT
        // 0 0000101
        // +       1
        // 0 0000110
        // WHICH IS EQUALL TO 6 
        // THUS, ~5 = -6
        System.out.println((~5));
    }
}
