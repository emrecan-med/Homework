package Homework;

public class test {

	public static void main(String[] args) {
		sarjor sarjorTest = new sarjor();
		silah silahTest = new silah();	
		
		System.out.println("-------------------------------");
		System.out.println("----------�ARJ�R TEST----------");
		System.out.println("-------------------------------");
		sarjorTest.mermiKapasite=40;
		sarjorTest.FullDoldur();
		
		sarjorTest.Atesle();
		
		System.out.println("-------------------------------");
		System.out.println("----------S�LAH TEST-----------");
		System.out.println("-------------------------------");
		
		silahTest.silahMermiKapasite = 50;
		silahTest.silahMevcutMermi = 0;
		silahTest.menzil = 100;
		
		silahTest.sarjorDoldur(30);
		
		silahTest.AtesEt(50);
		System.out.println("-------------------------------");
		System.out.println("--------D�ZELTME TEST----------");
		System.out.println("-------------------------------");
		System.out.println(silahTest.getInfo());
	}

}
