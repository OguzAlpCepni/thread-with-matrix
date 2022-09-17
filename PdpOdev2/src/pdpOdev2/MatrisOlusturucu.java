
/**
*
* @author OÐUZ ALP ÇEPNÝ /G201210035 / oguz.cepni@ogr.sakarya.edu.tr
* 
* @since 20.08.2022
* <p>
* Matrisler
* </p>
*/package pdpOdev2;

import java.util.Random;

public class MatrisOlusturucu {
	public static int[][] matrisOlusturucu(int rows,int columns){
		int [][] result = new int [rows][columns];  // output array to store  the matrix value
		Random random = new Random();				// to generate a random inteager
		for(int i = 0;i<rows;i++) {					// adding values at each index
			for(int j = 0;j<columns;j++) {
				if(i==0&&j==0) {
					result[i][j]=0;
					continue;
				}
				if(i==rows - 1&&j==columns -1) {
					result[i][j]=(rows*columns)-1;
					continue;
				}
				result[i][j] = random.nextInt(rows*columns);
			}
		}
		return result;
	}
	public static void print(int[][] matris) {
		int rows = matris.length;
		int columns = matris[0].length;
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<columns;j++) {
				System.out.print(matris[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
