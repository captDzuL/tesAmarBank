package tesAmar;

public class Main {
	
	public static int profitMaker(int[] stockprice, int n) {
		int len = stockprice.length;
		
		int priceMin = stockprice[0];
		int profitMax = 0;
		int profitNow;
		
		for(int i=0;i<len;i++) {
			profitNow = stockprice[i] - priceMin;
			priceMin = Math.min(priceMin, stockprice[i]);
			profitMax = Math.max(profitMax, profitNow);
		}
		return profitMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int profitMaksimal;
		int[] harga = {23171,21011,21123,21366,21013,21367};
		int n = harga.length;
		
		profitMaksimal = profitMaker(harga, n);
		
		System.out.println(profitMaksimal);
	}

}
