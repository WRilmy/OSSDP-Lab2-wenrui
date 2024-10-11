import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L2022211881_8_Test {
    @Test
    public void testNumIslands() {
        Solution8 solution = new Solution8();

        char[][] grid1 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        assertEquals(1, solution.numIslands(grid1));

        char[][] grid2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        assertEquals(3, solution.numIslands(grid2));
    }
}