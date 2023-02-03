import java.util.Scanner;

public class island {
    public int numIslands(char[][] grid) {
        int count = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    clearRestOfLand(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void clearRestOfLand(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return;
        
        grid[i][j] = '0';
        clearRestOfLand(grid, i+1, j);
        clearRestOfLand(grid, i-1, j);
        clearRestOfLand(grid, i, j+1);
        clearRestOfLand(grid, i, j-1);
        return;
    }

    public static void main(String[] args) {
        char[][] grid = new char[5][5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        island l = new island();
        System.out.println(l.numIslands(grid));
    }
}