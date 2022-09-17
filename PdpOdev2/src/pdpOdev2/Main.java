
/**
*
* @author OÐUZ ALP ÇEPNÝ /G201210035 / oguz.cepni@ogr.sakarya.edu.tr
* 
* @since 20.08.2022
* <p>
* main
* </p>
*/package pdpOdev2;

public class Main {

	public static void main(String[] args) {
		int[][] matris1 = MatrisOlusturucu.matrisOlusturucu(10, 10);
		int[][] matris2 = MatrisOlusturucu.matrisOlusturucu(10, 1);
		int[][] sonuc   = new int[matris1.length][matris2[0].length];
		ParalelThreadOlustur.multiply(matris1, matris2, sonuc);
		MatrisOlusturucu.print(matris1);
		MatrisOlusturucu.print(matris2);
		MatrisOlusturucu.print(sonuc);
	}

}
