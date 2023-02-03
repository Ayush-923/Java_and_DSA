public class interfacee {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal -(in all directions.).");
        

    }
}

class rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
        
    }
}

class king implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal -(1 unit in all directions.).");
        
    }
}
