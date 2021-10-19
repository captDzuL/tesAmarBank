package tesAmar;

public class Main {
	
	public static int profitMaker(int[] stockprice, int n) {

		if (n < 0) {
			return 0;
		}
		
		int priceMin = stockprice[0];
		int profitMax = 0;
		int profitNow;
		
		for(int i=0;i<n;i++) {
			if (stockprice[i] < 0) {
				return 0;
			}
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
		int[] harga2 = {10,20,50,450,380,120,45,800};
		int n = harga.length;
		int n2 = harga2.length;
		
		profitMaksimal = profitMaker(harga, n);
		
		System.out.println(profitMaksimal);
		System.out.println(profitMaker(harga2, n2));
	}

}
