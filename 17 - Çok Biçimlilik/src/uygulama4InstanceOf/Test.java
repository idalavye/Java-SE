package uygulama4InstanceOf;

public class Test {
	
	public static void main(String[] args) {
		
		Daire daire1 = new Daire(4.15);
		
		Kare kare1 = new Kare(5);
		
		hesapla(daire1);
		
		hesapla(kare1);
		
	}
	
	public static void hesapla(Sekil sekil){
		
		if(sekil instanceof Kare){
			System.out.println("Kare : ");
			System.out.println("Alan : " +sekil.getAlan());
			
		}
		else if(sekil instanceof Daire){
			System.out.println("Daire : ");
			System.out.println("Alan : " +sekil.getAlan());
			System.out.println("Cevre : " + sekil.getCevre());
		}
		
		System.out.println();
	}

}
