package Homework;

public class silah {
	sarjor sarjor1 = new sarjor(50,50);
	int menzil;
	int silahMevcutMermi = sarjor1.mevcutMermi;
	int silahMermiKapasite = sarjor1.mermiKapasite;
	
	silah(int etkinMenzil){
		this.menzil = etkinMenzil;
	}
	silah(){
		
	}

	public void AtesEt(int hedefMenzil)
	{
		if(menzil < hedefMenzil)
		{
			System.out.println("Hedef Menzil silah�n menzilinden fazla..Hedef vurulamad�.");
			sarjor1.mevcutMermi--;
			System.out.println("Mevcut mermi : "+sarjor1.mevcutMermi);
		}
		else {
			System.out.println("Hedef imha edildi");
			sarjor1.mevcutMermi--;
			System.out.println("Mevcut mermi : "+sarjor1.mevcutMermi);
		}
	}
	public void sarjorDoldur(int doldurulacakMermi) {
		if(silahMevcutMermi + doldurulacakMermi > silahMermiKapasite) {
			System.out.println("�arj�r kapasitesi �zerinde y�kleme yap�lamaz.");
			
		}
		else
		{
			silahMevcutMermi += doldurulacakMermi;
		}
		
	}
	
}
