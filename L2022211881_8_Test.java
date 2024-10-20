import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L2022211881_8_Test {
    /**
     * 测试用例设计的总体原则：
     * 1. 等价类划分原则：将输入数据划分为若干等价类，每个等价类中的输入数据在测试中具有相同的行为。
     * 2. 边界值分析原则：考虑输入数据的边界值，特别是数组的边界情况（如空数组、单元素数组等）。
     * 3. 错误推测法：根据经验和直觉，预测可能出错的情况，并设计测试用例来验证这些情况。
     */

    /**
     * 测试目的：验证空网格的情况。
     * 使用的测试技术：边界值分析。
     */
    @Test
    public void testEmptyGrid() {
        char[][] grid = {};
        Solution8 solution = new Solution8();
        assertEquals(0, solution.numIslands(grid));
    }

    @Test
    public void testNumIslands() {
        Solution8 solution = new Solution8();
        /**
         * 测试目的：验证单个岛屿的情况。
         * 使用的测试技术：等价类划分。
         */
        char[][] grid1 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        assertEquals(1, solution.numIslands(grid1));
        /**
         * 测试目的：验证多个岛屿的情况。
         * 使用的测试技术：等价类划分。
         */
        char[][] grid2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        assertEquals(3, solution.numIslands(grid2));
    }
    /**
     * 测试目的：验证没有岛屿的情况。
     * 使用的测试技术：边界值分析。
     */
    @Test
    public void testNoIslands() {
        char[][] grid = {
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Solution8 solution = new Solution8();
        assertEquals(0, solution.numIslands(grid));
    }
    /**
     * 测试目的：验证复杂岛屿布局的情况。
     * 使用的测试技术：等价类划分。
     */
    @Test
    public void testComplexIslands() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Solution8 solution = new Solution8();
        assertEquals(1, solution.numIslands(grid));
    }
    /**
     * 测试目的：验证边缘岛屿的情况。
     * 使用的测试技术：边界值分析。
     */
    @Test
    public void testEdgeIslands() {
        char[][] grid = {
                {'1', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '1'}
        };
        Solution8 solution = new Solution8();
        assertEquals(2, solution.numIslands(grid));
    }
}
//测试类书写规范，考虑周到,我看不出什么问题