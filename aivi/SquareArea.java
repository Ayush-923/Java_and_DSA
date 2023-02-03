public class SquareArea {
    public static void main(String[] args) {
        int tileSide = 5; // side of square tile in cms
        int numTiles = 8; // number of square tiles available
        int area = 0; // area of largest possible square
        
        // calculate the area of the largest possible square
        int side = (int) Math.sqrt(numTiles);
        area = (int) Math.pow(side * tileSide, 2);
        
        System.out.println("Area of largest possible square: " + area + " sq cm");
    }
}
