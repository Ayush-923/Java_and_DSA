public class BinaryOps {

    public static void main(String[] args) {
        
        //BINRY AND OPERATOR:
        // 0 & 0 : 0
        // 0 & 1: 0
        // 1 & 0: 0
        // 1 & 1 : 1
        System.out.println("BINRY AND OPERATOR:");
        System.out.println(5 & 6);

        //BINARY OR OPERATOR
        // 0 | 0 : 0
        // 0 | 1: 1
        // 1 | 0: 1
        // 1 | 1 : 1
        System.out.println("BINARY OR OPERATOR:");
        System.out.println(5 | 6);

        // BINARY XOR OPERATOR
        // 0 ^ 0 : 0
        // 0 ^ 1: 1
        // 1 ^ 0: 1
        // 1 ^ 1 : 0
        // 5 ^ 6: 101 ^ 110 = 011 => 3
        System.out.println("BINARY XOR OPERATOR:");
        System.out.println(5 ^ 6);



    }
}