package stringMetotlari;

public class StringMetotlari {
	
	public static void main(String[] args) {
		
		String isimSoyisim = "Ferhat Aykan";
		
		char c = isimSoyisim.charAt(5);
		
		System.out.println("5. indexteki karakter : " + c);
		
		int i = isimSoyisim.indexOf("a");
		
		System.out.println("a kelimesinin indexi(bastan arama) : " + i);
		
		i = isimSoyisim.lastIndexOf("a");
		
		System.out.println("a kelimesinin indexi(sondan arama) : " + i);
		
		String dL = isimSoyisim.toLowerCase();
		
		System.out.println("isim ve soyisimi k�c�k harflerden yaz�lmas� : " + dL);
		
		String dU = isimSoyisim.toUpperCase();
		
		System.out.println("�S�M VE SOY�S�M� B�Y�K HARFLERDEN YAZILMASI : " + dU);
		
		String s = isimSoyisim.replace('a', '�');
		
		System.out.println("a yerlerine � yaz�ld� : " + s);
		
		char [] harfDizisi = isimSoyisim.toCharArray();
	
		for(char cc : harfDizisi){
			
			System.out.print(cc + " ");
		}
		
		String sub = isimSoyisim.substring(2, 7);
		
		System.out.println("\n2 ile 7 arasi kesildi : " + sub);
		
	}

}
