package implementations;

import java.util.ArrayDeque;
import java.util.Deque;

public class TheMatrix {
    private char[][] matrix;
    private char fillChar;
    private char toBeReplaced;
    private int startRow;
    private int startCol;

    public TheMatrix(char[][] matrix, char fillChar, int startRow, int startCol) {
        this.matrix = matrix;
        this.fillChar = fillChar;
        this.startRow = startRow;
        this.startCol = startCol;
        this.toBeReplaced = this.matrix[this.startRow][this.startCol];
    }

    public void solve() {
        fillMatrix_DFS(this.startRow, this.startCol);
    }

    public void fillMatrix_DFS(int row, int col) {
        if (!isElementValid(row, col)) {
            return;
        }
        this.matrix[row][col] = fillChar;
        fillMatrix_DFS(row - 1, col);
        fillMatrix_DFS(row + 1, col);
        fillMatrix_DFS(row, col - 1);
        fillMatrix_DFS(row, col + 1);
    }

    public void fillMatrix_BFS(int row, int col) {
        Deque<int[]> selectedElements = new ArrayDeque<>();
        selectedElements.add(new int[]{startRow, startCol});
        while (!selectedElements.isEmpty()) {
            int[] current = selectedElements.poll();
            this.matrix[current[0]][current[1]] = fillChar;

            if (isElementValid(current[0] - 1, current[1]))
                offerNewElement(selectedElements, current[0] - 1, current[1]);

            if (isElementValid(current[0] + 1, current[1]))
                offerNewElement(selectedElements, current[0] + 1, current[1]);

            if (isElementValid(current[0], current[1] - 1))
                offerNewElement(selectedElements, current[0], current[1] - 1);

            if (isElementValid(current[0], current[1] + 1))
                offerNewElement(selectedElements, current[0], current[1] + 1);
        }

    }

    private void offerNewElement(Deque<int[]> elements, int r, int c) {
        int[] newElement = {r, c};
        boolean elementExist=false;
        for (int[] element : elements) {
            if (element[0]==r&&element[1]==c){
                elementExist=true;
                break;
            }
        }
        if (!elementExist) elements.offer(newElement);
    }

    private boolean isElementValid(int r, int c) {
        return !isIndexesOutOfBound(r, c) &&
                this.matrix[r][c] == toBeReplaced;
    }

    private boolean isIndexesOutOfBound(int r, int c) {
        return r < 0 || r >= this.matrix.length || c < 0 || c >= this.matrix[r].length;
    }

    public String toOutputString() {
        StringBuilder output = new StringBuilder();
        for (char[] row : this.matrix) {
            for (char c : row) {
                output.append(c);
            }
            output.append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}
