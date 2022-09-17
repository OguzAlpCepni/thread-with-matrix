/**
*
* @author OÐUZ ALP ÇEPNÝ /G201210035 / oguz.cepni@ogr.sakarya.edu.tr
* 
* @since 20.08.2022
* <p>
* RowMultipliyworker
* </p>
*/
package pdpOdev2;

public class RowMultiplyWorker implements Runnable{
	private final int[][] result;
	private int[][] matrix1;
	private int[][] matrix2;
	private final int row;

	public RowMultiplyWorker(int[][] result, int[][] matrix1, int[][] matrix2, int row) {
		this.result = result;
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.row = row;
	}

	public void run() {
		for (int i = 0; i < matrix2[0].length; i++) {
			result[row][i] = 0;
			for (int j = 0; j < matrix1[row].length; j++) {
				result[row][i] += matrix1[row][j] * matrix2[j][0];
			}

		}
	
	}
}
