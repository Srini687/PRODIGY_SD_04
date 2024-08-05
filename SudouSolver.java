public class SudouSolver {
	public static void main(String[] args) { 
		int[][] puzzle {

			{5, 3, 0, 0, 7, 0, 0, 0, 0}, 
			{6, 0, 0, 1, 9, 5, 0, 0, 0},
			{0, 9, 8, 0, 0, 0, 0, 6, 0}, 
			{8, 0, 0, 0, 6, 0, 0, 0, 3}, 
			{4, 0, 0, 8, 0, 3, 0, 0, 1}, 
			{7, 0, 0, 0, 2, 0, 0, 0, 6}, 
			{0, 6, 0, 0, 0, 0, 2, 8, 0}, 
			{0, 0, 0, 4, 1, 9, 0, 0, 5},
			{0, 0, 0, 0, 8, 0, 0, 7, 9}


} ;

if (solveSudoku(puzzle)) {

System.out.println("Solved Sudoku:"); printSudoku (puzzle);

} else {

System.out.println("No solution exists."); 
	}
}

// Solve Sudoku using backtracking

public static boolean solveSudoku (int[][] puzzle) {

for (int row= 0; row < 9; row++) {

for

(int col = 0; col < 9; col++) { if (puzzle[row][col] == 0) {

Type here to search

for (int num = 1; num <= 9; num++) {

if (isValid(puzzle, row, col, num)) { puzzle [row][col] = num;

if (solveSudoku(puzzle)) {
return true;

} puzzle[row][col] = 0; // Backtrack

}

} return false; // No valid number for this cell

}

}

} return true; // Sudoku solved

}

// Check if a number can be placed in a cell

public static boolean isValid(int[][] puzzle, int row, int col, int num) {

// Check row

for (int i = 0; i < 9; i++) {

if (puzzle[row] [i] == num) {

return false;

}

}

// Check 3x3 box

int boxRow = row row % 3;

int boxCol = col col% 3;

for (int i = boxRow; i < boxRow + 3; i++) { for (int j = boxCol; j < boxCol + 3; j++) {

if (puzzle[i][j] == num) {

return false;

}

}

}


return true;

}

// Print the Sudoku grid

public static void printSudoku (int[][] puzzle) {

for (int i = 0; i < 9; i++) {

for (int j=0; j < 9; j++) {

System.out.print(puzzle[i][j]+" ");
}
System.out.println();
}
}
}