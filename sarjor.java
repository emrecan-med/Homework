package Homework;

public class sarjor {
	int mermiKapasite,mevcutMermi;
	
	sarjor(int Kapasite,int Mermi){
		this.mermiKapasite=Kapasite;
		this.mevcutMermi = Mermi;
	}
	sarjor(){
		
	}

	
	public void Atesle() {
		System.out.println("Ate�leme Ba�ar�l�.");
		mevcutMermi--;
		System.out.println("Mevcut Mermi : " +mevcutMermi);
	}
	public void Doldur() {
		mevcutMermi++;
		System.out.println("Mevcut Mermi : " +mevcutMermi);
	}
	public void FullDoldur() {
		mevcutMermi = mermiKapasite;
		System.out.println("Mevcut Mermi : " +mevcutMermi);
		System.out.println("�arj�r fullendi.");
	}
}
