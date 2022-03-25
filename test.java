package Homework;

public class test {

	public static void main(String[] args) {
		sarjor sarjorTest = new sarjor();
		silah silahTest = new silah();	
		
		System.out.println("-------------------------------");
		System.out.println("----------ÞARJÖR TEST----------");
		System.out.println("-------------------------------");
		sarjorTest.mermiKapasite=40;
		sarjorTest.FullDoldur();
		
		sarjorTest.Atesle();
		
		System.out.println("-------------------------------");
		System.out.println("----------SÝLAH TEST-----------");
		System.out.println("-------------------------------");
		
		silahTest.silahMermiKapasite = 50;
		silahTest.silahMevcutMermi = 0;
		silahTest.menzil = 100;
		
		silahTest.sarjorDoldur(30);
		
		silahTest.AtesEt(50);
		System.out.println("-------------------------------");
		System.out.println("--------DÜZELTME TEST----------");
		System.out.println("-------------------------------");
		System.out.println(silahTest.getInfo());
	}

}
