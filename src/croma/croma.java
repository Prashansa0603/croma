package croma;

import java.util.*;


public class croma //driver class
{

	static {
		System.out.println("WELCOME TO ELECTRONIC SHOP");
	}
	public static void main(String[] args) {
	
		croma_prod prod =new croma_prod();
		prod.electronic_prod();
}
}
class croma_prod
{
	String brand;
	String models;
	String colour;
	 double price;
	
	private String cust_name;
	private long cust_Mobile_no;
	private String cust_email;
	 public void  Mobile()
	 {
		 
	 }
	 public void Laptop()
	 {
		 
	 }
     public void Television()
     {
    	 
     }
     public void payment()
     {
    	 
     }

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public long getCust_Mobile_no() {
		return cust_Mobile_no;
	}

	public void setCust_Mobile_no(long cust_Mobile_no) {
		this.cust_Mobile_no = cust_Mobile_no;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	
	
        public  void electronic_prod()
         { int p;
     	   Scanner sc = new Scanner(System.in);
 		System.out.println("What you want ?");
 		System.out.println("Enter 1 for moblie");
 		System.out.println("Enter 2 for laptop");
 		System.out.println("Enter 3 for Television");
 		
 		 p = sc.nextInt();
				
				switch (p) {
				case 1:
					System.out.println("You have selected mobile");
					croma_prod M1=new Mobile(); //Upcasting
					Mobile M2=(Mobile)M1; //downcasting 
					M1.Mobile();
					break;
					
				case 2 :System.out.println("You have selected laptop");
				croma_prod L1=new Laptop();
				Laptop L2=(Laptop)L1;
				L1.Laptop();
				break;
				
				case 3 :System.out.println("You have selected Television");
				croma_prod T1=new Television();
				Television T2=(Television)T1;
				T1.Television();
				break;
				}
         }


}

	class Mobile extends croma_prod
	{
	public  void Mobile()
	{
		int a ;
		Scanner s1= new Scanner(System.in);
		System.out.println(" Enter 1 for Apple");
		System.out.println(" Enter 2 for Samsung");
		System.out.println(" Enter 3 for Nokia");
		System.out.println(" Enter 4 for Oneplus");
		System.out.println(" Enter 5 for Vivo");
		a = s1.nextInt();
		 switch (a)
		 {
		 case 1 :System.out.println("You have selected Appple mobile");
		 Mobile M3 = new Apple();
		 Apple M4 = (Apple) M3;
		 M4.Appleopt();
		 break;
		 case 2 :System.out.println("You have selected Samsung mobile");
		 Mobile M5 = new Samsung();
		 Samsung M6 = (Samsung) M5;
		 M6. Samsungopt();
		 break;
		 case 3 :System.out.println("You have selected Nokia mobile");
		 Mobile M7 = new Nokia();
		 Nokia M8 = (Nokia) M7;
		 M8.Nokiaopt();
		 break;
		 case 4 :System.out.println("You have selected Oneplus mobile");
		 Mobile M9 = new Oneplus();
		 Oneplus M10 = (Oneplus) M9;
		 M10.Oneplusopt();
		 break;
		 case 5 :System.out.println("You have selected Vivo mobile");
		 Mobile M11 = new Vivo();
		 Vivo M12 = (Vivo) M11;
		 M12.Vivoopt();
		 break;
		 }
	}
	}
	class Apple extends Mobile
	{
		public void Appleopt()
		{
			int b;

			Scanner s2 = new Scanner(System.in);
			System.out.println(" Enter 1 for iphone 13 pro max");
			System.out.println(" Enter 2 for iphone 13 pro");
			System.out.println(" Enter 3 for iphone 13");
			System.out.println(" Enter 4 for iphone 12");
			System.out.println(" Enter 5 for iphone 11");
			b = s2.nextInt();
	
		switch (b) 
		{
		case 1:
		System.out.println("You have selected iphone 13 pro max");
		System.out.println("Model Name: iphone 13 pro max");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :6.7 inch");
		System.out.println("Release date :september 2021");
		System.out.println("Front Camera Resolution:12 MP");
		System.out.println("Display Resolution:2778*1284");
		System.out.println("Storange Capacity:128 GB,256 GB,512GB,1TB");
		System.out.println("Price : 1,29,399 Rs");
		break;
		case 2:
			System.out.println("You have selected iphone 13 pro ");
			System.out.println("Model Name: iphone 13 pro ");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.1 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Front Camera Resolution:12 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB,1TB");
			System.out.println("Price : 1,07,900 Rs");
			break;
		case 3:
			System.out.println("You have selected iphone 13 ");
			System.out.println("Model Name: iphone 13");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.1 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Front Camera Resolution:12 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :76,990 Rs");
			break;
		case 4:
			System.out.println("You have selected iphone 12 ");
			System.out.println("Model Name: iphone 12");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.1 inch");
			System.out.println("Release date :september 2020");
			System.out.println("Front Camera Resolution:12 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :62,990 Rs") ;
			break;
		case 5:
			System.out.println("You have selected iphone 12 pro ");
			System.out.println("Model Name: iphone 12 pro");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.1 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Front Camera Resolution:12 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Body Material:Glass , Stainless Steel");
			System.out.println("Price :1,09,,990 Rs");
			break;
		}
		}
	}
		
	class Samsung extends Mobile
	{

		public void  Samsungopt() 
		{
		int c;

		Scanner s3 = new Scanner(System.in);
		System.out.println(" Enter 1 for Samsung Galaxy Z Fold");
		System.out.println(" Enter 2 for Samsung Galaxy Z Flip 4");
		System.out.println(" Enter 3 for Samsung Galaxy A33 5G");
		System.out.println(" Enter 4 for Samsung Galaxy A53 5G ");
		System.out.println(" Enter 5 for Samsung Galaxy S22  ");
		c = s3.nextInt();
		switch (c) 
		{

		case 1:
		System.out.println("You have selected Samsung Galaxy Z Fold");
		System.out.println("Model Name:Samsung Galaxy Z Fold ");
		System.out.println("Screen Size :7.6 inch");
		System.out.println("Release date :september 2020");
		System.out.println("Front Camera Resolution:10 MP");
		System.out.println("Display Resolution:2532*1170");
		System.out.println("Storange Capacity:128 GB,256 GB,512GB");
		System.out.println("Price :1,07,990 Rs");
		break;
		case 2:
			System.out.println("You have selected Samsung Galaxy Z Flip 4");
			System.out.println("Model Name:Samsung Galaxy Z Flip 4 ");
			System.out.println("Screen Size :6.7 inch");
			System.out.println("Release date :10th July 2022");
			System.out.println("Front Camera Resolution:10 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :97,990 Rs");
			break;
		case 3:
			System.out.println("You have selected Samsung Galaxy A33 5G");
			System.out.println("Model Name:Samsung Galaxy A33 5G");
			System.out.println("Screen Size :6.4 inch");
			System.out.println("Release date :	March 29, 2022");
			System.out.println("Front Camera Resolution:13 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :25,990 Rs");
			break;
		case 4:
			System.out.println("You have selected Samsung Galaxy A53 5G");
			System.out.println("Model Name:Samsung Galaxy A53 5G ");
			System.out.println("Screen Size :6.5 inch");
			System.out.println("Release date :17th March 2022");
			System.out.println("Front Camera Resolution:10 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :37,990 Rs");
			break;
		case 5:
			System.out.println("You have selected Samsung Galaxy S22 ");
			System.out.println("Model Name:Samsung Galaxy S22 ");
			System.out.println("Screen Size :6.4 inch");
			System.out.println("Release date :9 feb 2022");
			System.out.println("Front Camera Resolution:12 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :72,990 Rs");
			break;
		}
		}
	}
	
	class Nokia extends Mobile
	{

		public void  Nokiaopt() 
		{
		int d;

		Scanner s4 = new Scanner(System.in);
		System.out.println(" Enter 1 for Nokia N73 5G");
		System.out.println(" Enter 2 for Nokia G400 5G");
		System.out.println(" Enter 3 for Nokia X60 5G");
		System.out.println(" Enter 4 for Nokia X100 5G ");
		System.out.println(" Enter 5 for Nokia 2720 V Flip ");
		d = s4.nextInt();
		switch (d) 
		{

		case 1:
		System.out.println("You have selected Nokia N73 5G");
		System.out.println("Model Name:Nokia N73 5G ");
		System.out.println("Screen Size :6.9 inch");
		System.out.println("Release date :september 2020");
		System.out.println("Front Camera Resolution:32MP");
		System.out.println("Display Resolution:2532*1170");
		System.out.println("Storange Capacity:128 GB,256 GB");
		System.out.println("Price :46,990 Rs");
		break;
		case 2:
			System.out.println("You have selected Nokia G400 5G");
			System.out.println("Model Name:Nokia G400 5G");
			System.out.println("Screen Size :6.5 inch");
			System.out.println("Release date : July 2022");
			System.out.println("Front Camera Resolution:48 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB");
			System.out.println("Price :16,990 Rs");
			break;
		case 3:
			System.out.println("You have selected Nokia X60 5G");
			System.out.println("Model Name:Nokia X60 5G");
			System.out.println("Screen Size :6.4 inch");
			System.out.println("Release date :	March 2022");
			System.out.println("Front Camera Resolution:32 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:6 GB");
			System.out.println("Price :36,990 Rs");
			break;
		case 4:
			System.out.println("You have selected Nokia X100 5G ");
			System.out.println("Model Name:Nokia X100 5G");
			System.out.println("Screen Size :6.6 inch");
			System.out.println("Release date :17th March 2022");
			System.out.println("Front Camera Resolution:10 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB");
			System.out.println("Price :17,990 Rs");
			break;
		case 5:
			System.out.println("You have selected Nokia 2720 V Flip");
			System.out.println("Model Name:Nokia 2720 V Flip");
			System.out.println("Screen Size :2.8 inch");
			System.out.println("Release date :may 2022");
			System.out.println("Storange Capacity:128 GB");
			System.out.println("Price :6,990 Rs");
			break;
		}
		}
	}
	
	class Oneplus extends Mobile
	{
		public void  Oneplusopt()
		{
			int e;
			Scanner s5 = new Scanner(System.in);
			System.out.println(" Enter 1 for OnePlus 10T");
			System.out.println(" Enter 2 for OnePlus Nord CE 2 Lite 5G ");
			System.out.println(" Enter 3 for OnePlus Nord CE 2 5G");
			System.out.println(" Enter 4 for OnePlus Nord 2T 5G");
			System.out.println(" Enter 5 for OnePlus 10R");
			e = s5.nextInt();
	
		switch (e) 
		{
		case 1:
		System.out.println("You have selected OnePlus 10T");
		System.out.println("Model Name: OnePlus 10T ");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :6.7 inch");
		System.out.println("Release date :	August 3, 2022 ");
		System.out.println("Front Camera Resolution:16  MP");
		System.out.println("Display Resolution:2778*1284");
		System.out.println("Storange Capacity:128 GB,256 GB");
		System.out.println("Price : 46,399 Rs");
		break;
		case 2:
			System.out.println("You have selected  OnePlus Nord CE 2 Lite 5G  ");
			System.out.println("Model Name: OnePlus Nord CE 2 Lite 5G  ");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.5 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Front Camera Resolution:32 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:6 GB");
			System.out.println("Price : 18,900 Rs");
			break;
		case 3:
			System.out.println("You have selected  OnePlus Nord CE 2 5G ");
			System.out.println("Model Name: OnePlus Nord CE 2 5G");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.4 inch");
			System.out.println("Release date:February 22, 2022");
			System.out.println("Front Camera Resolution:12 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:6 GB");
			System.out.println("Price :23,990 Rs");
			break;
		case 4:
			System.out.println("You have selected OnePlus Nord 2T 5G ");
			System.out.println("Model Name: OnePlus Nord 2T 5G");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.3 inch");
			System.out.println("Release date :september 2020");
			System.out.println("Front Camera Resolution:32 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:8 GB");
			System.out.println("Price :28,990 Rs");
			break;
		case 5:
			System.out.println("You have selected OnePlus 10R");
			System.out.println("Model Name:OnePlus 10R");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.7 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Front Camera Resolution:16 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:8 GB");
			System.out.println("Price :34,,999 Rs");
			break;
		}
		}
	}
	class Vivo extends Mobile
	{
		public void  Vivoopt()
		{
			int f;

			Scanner s5 = new Scanner(System.in);
			System.out.println(" Enter 1 for X80 Pro");
			System.out.println(" Enter 2 for X80 ");
			System.out.println(" Enter 3 for Y75");
			System.out.println(" Enter 4 for Y33T ");
			System.out.println(" Enter 5 for Y75 (5G)");
			f = s5.nextInt();
	
		switch (f) 
		{
		case 1:
		System.out.println("You have selected X80 Pro");
		System.out.println("Model Name: X80 Pro");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :6.7 inch");
		System.out.println("Release date :	August 3, 2022 ");
		System.out.println("Front Camera Resolution:16  MP");
		System.out.println("Display Resolution:2778*1284");
		System.out.println("Storange Capacity:128 GB,256 GB");
		System.out.println("Price : 79,999 Rs");
		break;
		case 2:
			System.out.println("You have selected X80  ");
			System.out.println("Model Name:X80  ");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.5 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Front Camera Resolution:32 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:6 GB");
			System.out.println("Price :54,999 Rs");
			break;
		case 3:
			System.out.println("You have selected  Y75");
			System.out.println("Model Name: Y75");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.4 inch");
			System.out.println("Release date:February 22, 2022");
			System.out.println("Front Camera Resolution:12 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:8 GB");
			System.out.println("Price :20,990 Rs");
			break;
		case 4:
			System.out.println("You have selected Y33T  ");
			System.out.println("Model Name: Y33T ");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.3 inch");
			System.out.println("Release date :september 2020");
			System.out.println("Front Camera Resolution:32 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:8 GB");
			System.out.println("Price :17,990 Rs");
			break;
		case 5:
			System.out.println("You have selected  Y75 (5G)");
			System.out.println("Model Name:Y75 (5G)");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :6.7 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Front Camera Resolution:16 MP");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:8 GB");
			System.out.println("Price :24,,999 Rs");
			break;
		}
		}
	}
	
	class Laptop extends croma_prod
	{
	public void Laptop()
	{
		int g ;
		Scanner s6= new Scanner(System.in);
		System.out.println(" Enter 1 for MacBook");
		System.out.println(" Enter 2 for Lenovo");
		System.out.println(" Enter 3 for Asus");
		System.out.println(" Enter 4 for Dell");
		System.out.println(" Enter 5 for HP");
		g = s6.nextInt();
		 switch (g)
		 {
		 case 1 :System.out.println("You have selected MacBook laptop");
		 Laptop M13 = new MacBook();
		 MacBook M14 = ( MacBook) M13;
		 M14. MacBookopt();
		 break;
		 case 2 :System.out.println("You have selected Lenovo laptop");
		 Laptop M15 = new Lenovo();
		 Lenovo M16 = (Lenovo) M15;
		 M16. Lenovoopt();
		 break;
		 case 3 :System.out.println("You have selected Asus laptop");
		 Laptop M17 = new Asus();
		 Asus M18 = (Asus)M17;
		 M18.Asusopt();
		 break;
		 case 4 :System.out.println("You have selected Dell laptop");
		 Laptop M19 = new Dell();
		 Dell M20 = (Dell) M19;
		 M20. Dellopt();
		 break;
		 /*case 5 :System.out.println("You have selected HP laptop ");
	      Laptop M21 =new HP();
	      HP M22 =(HP)M21;
	      M22.HPopt();
		 break;*/
		 }
	}
	}
	
	class MacBook extends Laptop
	{
		public void MacBookopt()
		{
			int h;

			Scanner s7 = new Scanner(System.in);
			System.out.println(" Enter 1 for Apple MacBook Air 2020 M1");
			System.out.println(" Enter 2 for Apple MacBook Air 2022 M2");
			System.out.println(" Enter 3 for Apple MacBook Pro 16 M1 Pro Max Chip MK1A3HN/A");
			System.out.println(" Enter 4 for Apple MacBook Pro 2022 M2");
			System.out.println(" Enter 5 for Apple MNEH3HNA MacBook Pro");
			h = s7.nextInt();
	
		switch (h) 
		{
		case 1:
		System.out.println("You have selected Apple MacBook Air 2020 M1");
		System.out.println("Model Name: Apple MacBook Air 2020 M1");
		System.out.println("Processor: Apple M1");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :13.3 inch");
		System.out.println("Release date :september 2021");
		System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
		System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
		System.out.println("Storange Capacity:256 GB");
		System.out.println("Price : 96,900 Rs");
		break;
		case 2:
			System.out.println("You have selected Apple MacBook Air 2022 M2");
			System.out.println("Model Name: Apple MacBook Air 2022 M2 ");
			System.out.println("Processor: Apple M2");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
			System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:256 GB,512GB");
			System.out.println("Price : 1,49,900 Rs");
			break;
		case 3:
			System.out.println("You have selected Apple MacBook Pro 16 M1 Pro Max Chip MK1A3HN/A ");
			System.out.println("Model Name: Apple MacBook Pro 16 M1 Pro Max Chip MK1A3HN/A");
			System.out.println("Processor: Apple M2");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
			System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :3,76,990 Rs");
			break;
		case 4:
			System.out.println("You have selected Apple MacBook Pro 2022 M2 ");
			System.out.println("Model Name: Apple MacBook Pro 2022 M2");
			System.out.println("Processor: Apple M2");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Memory: 8GB Unified Memory RAM, 512GB SSD ROM");
			System.out.println("Display: 33.74 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:256 GB");
			System.out.println("Price :1,49,990 Rs") ;
			break;
		case 5:
			System.out.println("You have selected Apple MNEH3HNA MacBook Pro ");
			System.out.println("Model Name:Apple MNEH3HNA MacBook Pro");
			System.out.println("Processor: Apple M2");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 8GB Unified Memory RAM, 512GB SSD ROM");
			System.out.println("Display Resolution:2532*1170");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :1,09,,990 Rs");
			break;
		}
		}
	}
	class Lenovo extends Laptop
	{
		public void Lenovoopt()
		{
			int i;

			Scanner s8 = new Scanner(System.in);
			System.out.println(" Enter 1 forIdeaPad Gaming 3i Gen 6  ");
			System.out.println(" Enter 2 for IdeaPad Gaming 3i Gen 6 ");
			System.out.println(" Enter 3 for  IdeaPad 5i Gen 7");
			System.out.println(" Enter 4 for Lenovo V15 Gen 2 ");
			System.out.println(" Enter 5 for ThinkPad L14 Gen 2");
			i = s8.nextInt();
	
		switch (i) 
		{
		case 1:
		System.out.println("You have selectedIdeaPad Slim 3i Gen 6 ");
		System.out.println("Model Name: IdeaPad Slim 3i Gen 6 ");
		System.out.println("Processor: 11th Generation Intel� Core� i3-1115G4 Processor (3.00 GHz up to 4.10 GHz)");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :13.3 inch");
		System.out.println("Release date :september 2021");
		System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
		System.out.println("Display: 35.56cms (14) FHD (1920 x 1080), TN, Anti-Glare, Non-Touch, 45% NTSC, 250 Nits");
		System.out.println("Storange Capacity:256 GB");
		System.out.println("Price : 65,900 Rs");
		break;
		case 2:
			System.out.println("You have selected IdeaPad 5i Gen 7 ");
			System.out.println("Model Name:IdeaPad 5i Gen 7  ");
			System.out.println("Processor: 11th Generation Intel� Core� i5-11300H Processor (3.10 GHz up to 4.40 GHz)");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("8 GB SO-DIMM DDR4 3200MHz");
			System.out.println("Display:39.62cms (15.6) FHD (1920 x 1080), IPS, Anti-Glare, Non-Touch, 45% NTSC, 250 Nits, 120Hz");
			System.out.println("Storange Capacity:256 GB,512GB");
			System.out.println("Price : 49,900 Rs");
			break;
		case 3:
			System.out.println("You have selected Apple MacBook Pro 16 M1 Pro Max Chip MK1A3HN/A ");
			System.out.println("Model Name: Apple MacBook Pro 16 M1 Pro Max Chip MK1A3HN/A");
			System.out.println("Processor: Apple M2");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
			System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :76,990 Rs");
			break;
		case 4:
			System.out.println("You have selected Lenovo V15 Gen 2  ");
			System.out.println("Model Name: Lenovo V15 Gen 2 ");
			System.out.println("Processor:11th Generation Intel� Core� i3-1115G4 Processor (3.00 GHz up to 4.10 GHz)");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Memory: 8GB Unified Memory RAM, 512GB SSD ROM");
			System.out.println("Display: 39.62cms (15.6) FHD (1920 x 1080), TN, Anti-Glare, Non-Touch, 45% NTSC, 250 Nits,t");
			System.out.println("8 GB (4 GB Soldered DDR4 2666MHz + 4 GB SO-DIMM DDR4 3200MHz) ");
			System.out.println("Price :49,990 Rs") ;
			break;
		case 5:
			System.out.println("You have selected ThinkPad L14 Gen 2");
			System.out.println("Model Name:ThinkPad L14 Gen 2");
			System.out.println("Processor: 11th Generation Intel� Core� i5-1135G7 Processor");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 8GB Unified Memory RAM, 512GB SSD ROM");
			System.out.println("Display35.56cms (14) FHD (1920 x 1080), IPS, Anti-Glare, Non-Touch, 250 Nits");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :96,,990 Rs");
			break;
		}
		}
	}
	
	class  Asus extends Laptop
	{
		public void Asusopt()
		{
			int j;

			Scanner s9 = new Scanner(System.in);
			System.out.println(" Enter 1 for Asus ROG Flow X13 GV301QC-K6085TS");
			System.out.println(" Enter 2 for ProArt Studiobook Pro 16 OLED (W7600, 12th Gen Intel)");
			System.out.println(" Enter 3 for Zenbook Pro 14 Duo OLED (UX8402, 12th Gen Intel)");
			System.out.println(" Enter 4 for Zenbook Pro Duo 15 OLED (UX582, 12th Gen Intel)");
			System.out.println(" Enter 5 for Zenbook S 13 OLED (UM5302, AMD Ryzen 6000 series)");
			j = s9.nextInt();
	
		switch (j) 
		{
		case 1:
		System.out.println("You have selected Asus ROG Flow X13 GV301QC-K6085TS");
		System.out.println("Model Name: Asus ROG Flow X13 GV301QC-K6085TS");
		System.out.println(" Processor: AMD Ryzen� 9 5900HS Mobile Processor (8-core/16-thread, 20MB cache, up to 4.6 GHz Max Boost)");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :13.3 inch");
		System.out.println("Release date :september 2021");
		System.out.println("Memory: 32GB (16GB x 2) LPDDR4X on board");
		System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
		System.out.println("Storage: 1TB M.2 2230 NVMe� PCIe� 3.0 SSD");
		System.out.println("Price :1,96,900 Rs");
		break;
		case 2:
			System.out.println("You have selected ProArt Studiobook Pro 16 OLED (W7600, 12th Gen Intel)");
			System.out.println("Model Name: ProArt Studiobook Pro 16 OLED (W7600, 12th Gen Intel) ");
			System.out.println("Processor: AMD Ryzen� 9 5900HS Mobile Processor");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
			System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:256 GB,512GB");
			System.out.println("Price : 3,49,900 Rs");
			break;
		case 3:
			System.out.println("You have selected Zenbook Pro 14 Duo OLED (UX8402, 12th Gen Intel) ");
			System.out.println("Model Name: Zenbook Pro 14 Duo OLED (UX8402, 12th Gen Intel)");
			System.out.println("Processor:  AMD Ryzen� 9 5900HS Mobile Processor");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
			System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :1,76,990 Rs");
			break;
		case 4:
			System.out.println("You have selected Zenbook Pro Duo 15 OLED (UX582, 12th Gen Intel) ");
			System.out.println("Model Name: Zenbook Pro Duo 15 OLED (UX582, 12th Gen Intel)");
			System.out.println("Processor:  AMD Ryzen� 9 5900HS Mobile Processor M2");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Memory: 8GB Unified Memory RAM, 512GB SSD ROM");
			System.out.println("Display: 33.74 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:256 GB");
			System.out.println("Price :2,79,990 Rs") ;
			break;
		case 5:
			System.out.println("You have selected Zenbook S 13 OLED (UM5302, AMD Ryzen 6000 series) ");
			System.out.println("Model Name:Zenbook S 13 OLED (UM5302, AMD Ryzen 6000 series)");
			System.out.println("Processor: Apple M2");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 8GB Unified Memory RAM, 512GB SSD ROM");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :1,29,,990 Rs");
			break;
		}
		}
	}
	class Dell extends Laptop
	{
		public void Dellopt()
		{
			int k;

			Scanner s10 = new Scanner(System.in);
			System.out.println(" Enter 1 for XPS 17 Laptop");
			System.out.println(" Enter 2 for New Latitude 14 7430 Laptop");
			System.out.println(" Enter 3 for New Latitude 15 3520 Laptop");
			System.out.println(" Enter 4 for Latitude 13 5320 Laptop");
			System.out.println(" Enter 5 for New Latitude 15 5530 Laptop");
			k = s10.nextInt();
	
		switch (k) 
		{
		case 1:
		System.out.println("You have selected XPS 17 Laptop");
		System.out.println("Model Name:XPS 17 Laptop");
		System.out.println("Processor: 12th Gen Intel� Core� i9-12900HK (24 MB cache, 14 cores, 20 threads, up to 5.00 GHz Turbo)");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :13.3 inch");
		System.out.println("Release date :september 2021");
		System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
		System.out.println("Display:17.0\" UHD+ (3840 x 2400) InfinityEdge Touch Anti-Reflecitve 500-Nit Display");
		System.out.println("Storange Capacity:256 GB");
		System.out.println("Price : 3,42,900 Rs");
		break;
		case 2:
			System.out.println("You have selected New Latitude 14 7430 Laptop");
			System.out.println("Model Name: New Latitude 14 7430 Laptop ");
			System.out.println("Processor:12th Gen Intel� Core� i7-1265U (12 MB cache, 10 cores, 12 threads, up to 4.80 GHz Turbo)");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory: 512 GB, M.2, PCIe NVMe, SSD, Class 35");
			System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:256 GB,512GB");
			System.out.println("Price : 1,99,900 Rs");
			break;
		case 3:
			System.out.println("You have selected New Latitude 15 3520 Laptop ");
			System.out.println("Model Name: New Latitude 15 3520 Laptop");
			System.out.println("Processor: 11th Gen Intel� Core� i5-1145G7 (8 MB cache, 4 cores, 8 threads, 2.60 GHz to 4.40 GHz Turbo)");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory:256 GB, M.2, PCIe NVMe, SSD, Class 35");
			System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :98,990 Rs");
			break;
		case 4:
			System.out.println("You have selected Latitude 13 5320 Laptop ");
			System.out.println("Model Name: Latitude 13 5320 Laptop");
			System.out.println("Processor: 11th Gen Intel� Core� i5-1135G7 (8 MB cache, 4 cores, 8 threads, 2.40 GHz to 4.20 GHz Turbo)");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Memory:8 GB, LPDDR4, 3200 MHz, integrated");
			System.out.println("Display: 33.74 cm (13.3 inches) LED-Backlit");
			System.out.println("Storange Capacity:256 GB");
			System.out.println("Price :91,990 Rs") ;
			break;
		case 5:
			System.out.println("You have selected New Latitude 15 5530 Laptop ");
			System.out.println("Model Name:New Latitude 15 5530 Laptop");
			System.out.println("Processor:th Gen Intel� Core� i5-1250P, vPro� Enterprise (12 MB cache, 12 cores, 16 threads, up to 4.40 GH");
			System.out.println("Colour : Black");
			System.out.println("Screen Size :13.3 inch");
			System.out.println("Release date :september 2021");
			System.out.println("Memory:512 GB, M.2, PCIe NVMe, SSD, Class 35");
			System.out.println("Storange Capacity:128 GB,256 GB,512GB");
			System.out.println("Price :1,12,990 Rs");
			break;
		}
		}
	}
		class HP extends Laptop
		{
	public void HPopt()
	{
		int l ;

		Scanner s11 = new Scanner(System.in);
		System.out.println(" Enter 1 for HP Pavilion Laptop 15-eg2019TX");
		System.out.println(" Enter 2 for HP Pavilion Laptop 15-eg2009TU");
		System.out.println(" Enter 3 for OMEN Gaming Laptop 16-k0360TX");
		System.out.println(" Enter 4 for OMEN Gaming Laptop 16-k0370TX");
		System.out.println(" Enter 5 for HP Laptop 14s-dq5007TU");
		l = s11.nextInt();

	switch (l) 
	{
	case 1:
	System.out.println("You have selected HP Pavilion Laptop 15-eg2019TX");
	System.out.println("Model Name:HP Pavilion Laptop 15-eg2019TX");
	System.out.println("Processor:12th Generation Intel� Core� i5 processor");
	System.out.println("Colour : Black");
	System.out.println("Screen Size :13.3 inch");
	System.out.println("Release date :september 2021");
	System.out.println("Memory: 16 GB DDR4-3200 MHz RAM (2 x 8 GB)");
	System.out.println("Display: 33.78 cm (13.3 inches) LED-Backlit");
	System.out.println("Storange Capacity:256 GB");
	System.out.println("Price : 78,999 Rs");
	break;
	case 2:
		System.out.println("You have selected HP Pavilion Laptop 15-eg2009TU");
		System.out.println("Model Name: HP Pavilion Laptop 15-eg2009TU ");
		System.out.println("Processor: 12th Generation Intel� Core� i5 processor");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :13.3 inch");
		System.out.println("Release date :september 2021");
		System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
		System.out.println("Display:39.6 cm (15.6) diagonal, FHD (1920 x 1080), IPS, micro-edge, BrightView, 250 nits, 45% NTSC");
		System.out.println("Storange Capacity:8 GB DDR4-3200 MHz RAM (2 x 4 GB)");
		System.out.println("Price : 68,900 Rs");
		break;
	case 3:
		System.out.println("You have selected OMEN Gaming Laptop 16-k0360TX ");
		System.out.println("Model Name: OMEN Gaming Laptop 16-k0360TX");
		System.out.println("Processor: 12th Generation Intel� Core� i7 processor");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :13.3 inch");
		System.out.println("Release date :september 2021");
		System.out.println("Memory: 8GB Unified Memory RAM, 256GB SSD ROM");
		System.out.println("Display: 40.9 cm (16.1) diagonal, FHD (1920 x 1080), 144 Hz, 7 ms response time, IPS, micro-edge, anti-glare, Low Blue Light, 300 nits, 100% sRGB");
		System.out.println("Storange Capacity:16 GB DDR5-4800 MHz RAM (2 x 8 GB)");
		System.out.println("Price :1,76,990 Rs");
		break;
	case 4:
		System.out.println("You have selected  OMEN Gaming Laptop 16-k0370TX ");
		System.out.println("Model Name:  OMEN Gaming Laptop 16-k0370TX");
		System.out.println("Processor: 12th Generation Intel� Core� i7 processor");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :13.3 inch");
		System.out.println("Memory: 40.9 cm (16.1) diagonal, FHD (1920 x 1080), 144 Hz, 7 ms response time, IPS, micro-edge, anti-glare, Low Blue Light, 300 nits, 100% sRGB");
		System.out.println("Display: 33.74 cm (13.3 inches) LED-Backlit");
		System.out.println("Storange Capacity:16 GB DDR5-4800 MHz RAM (2 x 8 GB)");
		System.out.println("Price :1,89,990 Rs") ;
		break;
	case 5:
		System.out.println("You have selected HP Laptop 14s-dq5007TU");
		System.out.println("Model Name:HP Laptop 14s-dq5007TU");
		System.out.println("Processor: 12th Generation Intel� Core� i5 processor");
		System.out.println("Colour : Black");
		System.out.println("Screen Size :13.3 inch");
		System.out.println("Release date :september 2021");
		System.out.println("Memory: 8GB Unified Memory RAM, 512GB SSD ROM");
		System.out.println("Display Resolution:2532*1170");
		System.out.println("Storange Capacity:8 GB DDR4-3200 MHz RAM (2 x 4 GB)");
		System.out.println("Price :60,,990 Rs");
		break;
	}
	}
	}
	class Television extends croma_prod
	{
	public void Television()
	{
		int m ;
		Scanner s12= new Scanner(System.in);
		System.out.println(" Enter 1 for sony");
		System.out.println(" Enter 2 for LG");
		System.out.println(" Enter 3 for Samsung");
		System.out.println(" Enter 4 for Panasonic");
		System.out.println(" Enter 5 for mitv");
		m = s12.nextInt();
		 switch (m)
		 {
		 case 1 :
		 System.out.println("You have selected sony tv");
		 Television M3 = new sony();
		 sony M4 = (sony) M3;
		 M4.sonyopt();
		 break;
		 case 2 :System.out.println("You have selected LG tv");
		 Television M5 = new LG();
		 LG M6 = (LG) M5;
		  M6.LGopt();
		 break;
		 case 3 :System.out.println("You have selected Samsung tv");
		 Television M7 = new SamsungTV();
		 SamsungTV M8 = (SamsungTV)M7;
		 M8.SamsungTVopt();
		 break;
		 /*case 4 :System.out.println("You have selected Panasonic tv");
		 Television M9 = new Panasonic();
		 Panasonic M10 = (Panasonic) M9;
		 M10.Panasonicopt();
		 break;
		 case 5 :System.out.println("You have selected  mitv ");
		 Television M11 = new mitv();
		 mitv M12 = (mitv) M11;
		 M12.Vivoopt();
		 break;*/
		 }
	}
	}
      class sony extends  Television
      {
    		public void sonyopt()
    		{
    			int n;

    			Scanner s13 = new Scanner(System.in);
    			System.out.println(" Enter 1 for SONY Bravia 108 Cm");
    			System.out.println(" Enter 2 for SONY Bravia ");
    			System.out.println(" Enter 3 for SONY Bravia 48 Cm");
    			
    			n = s13.nextInt();
    
    		switch (n) 
    		{
    		       case 1:
    				System.out.println("You have selected Sony Bravia 108 cm");
    				System.out.println("Model Name: Sony Bravia 108 cm ");
    				System.out.println("Colour : Black");
    				System.out.println("Resolution : 4k");
    				System.out.println("Connector Type : wi-fi, USB, Ethernate, HDMI with Alexa Compatibility");
    				System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
    				System.out.println("Display Technology: LED");
    				System.out.println("On Mode power consumption : 142 watts");
    				System.out.println("Visible Screen Diagonal : 55inch/140cm");
    				System.out.println("Price : 68,390 Rs");
    				break;

    				case 2:
    				System.out.println("You have selected Sony Bravia TV");
    				System.out.println("Model Name: Sony Bravia ");
    				System.out.println("Colour : Black");
    				System.out.println("Resolution : 4k");
    				System.out.println("Connector Type : wi-fi, USB, Ethernate, HDMI with Alexa Compatibility");
    				System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
    				System.out.println("Display Technology: LED");
    				System.out.println("On Mode power consumption : 96 watts");
    				System.out.println("Visible Screen Diagonal : 43inch/110cm");
    				System.out.println("Price : 50,900 Rs");
    				break;

    				case 3:
    				System.out.println("You have selected SONY Bravia 48 Cm");
    				System.out.println("Model Name: Sony Bravia 48 cm");
    				System.out.println("Colour : Black");
    				System.out.println("Resolution : 4k");
    				System.out.println("Connector Type : wi-fi, USB< Ethernate, HDMI with Alexa Compatibility");
    				System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
    				System.out.println("Display Technology: LED");
    				System.out.println("On Mode power consumption : 89 watts");
    				System.out.println("Visible Screen Diagonal : 32inch/80cm");
    				System.out.println("Price : 30,000 Rs");
    				break;
    				}

    				}

    				}

    				class LG extends Television
    				{

    				public void LGopt() {
    				int m;

    				Scanner s14 = new Scanner(System.in);
    				System.out.println(" Enter 1 for LG UHD 55UP123");
    				System.out.println(" Enter 2 for LG OLED");
    				System.out.println(" Enter 3 for LG NAN099");
    				m = s14.nextInt();
    				switch (m) 
    				{

    				case 1:
    				System.out.println("You have selected LG UHD 55UP123");
    				System.out.println("Model Name: LG UHD 55UP123 ");
    				System.out.println("Colour : Black");
    				System.out.println("Resolution : 4k");
    				System.out.println("Connector Type : wi-fi, USB, Ethernate, HDMI with Alexa Compatibility");
    				System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
    				System.out.println("Display Technology: LED");
    				System.out.println("On Mode power consumption : 0.5 watts");
    				System.out.println("Visible Screen Diagonal : 55inch/140cm");
    				System.out.println("Mounting Hardware : 1 tv Unit, 1 Remote Controller, 2 Table Top Stand, User Manual");
    				System.out.println("Price : 55000 Rs");
    				break;

    				case 2:
    				System.out.println("You have selected LG OLED");
    				System.out.println("Model Name: LG OLED ");
    				System.out.println("Colour : Black");
    				System.out.println("Resolution : 4k");
    				System.out.println("Connector Type : wi-fi, USB, Ethernate, HDMI with Alexa Compatibility");
    				System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
    				System.out.println("Display Technology: LED");
    				System.out.println("On Mode power consumption : 96 watts");
    				System.out.println("Visible Screen Diagonal : 43inch/108cm");
    				System.out.println("Price : 44000 Rs");
    				break;

    				case 3:
    				System.out.println("You have selected LG NAN099");
    				System.out.println("Model Name: LG NAN099 ");
    				System.out.println("Colour : Black");
    				System.out.println("Resolution : 4k");
    				System.out.println("Connector Type : wi-fi, USB< Ethernate, HDMI with Alexa Compatibility");
    				System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
    				System.out.println("Display Technology: LED");
    				System.out.println("On Mode power consumption : 89 watts");
    				System.out.println("Visible Screen Diagonal : 32inch/80cm");
    				System.out.println("Price : 30,000 Rs");
    				break;
    				}

    				}
    				}
	class  SamsungTV extends Television
    {

    public void  SamsungTVopt() {
    int m;

    Scanner s14 = new Scanner(System.in);
   	System.out.println(" Enter 1 for SAMSUNG Series 7 138 cm ");
    System.out.println(" Enter 2 for AUE60 Crystal 4K UHD");
    System.out.println(" Enter 3 for SAMSUNG Series 4 80 cm (32 inch) HD");
    m = s14.nextInt();
    switch (m) 
    {
    case 1:
		System.out.println("You have selected SAMSUNG Series 7 138 cm ");
		System.out.println("Model Name: SAMSUNG Series 7 138 cm ");
		System.out.println("Colour : Black");
		System.out.println("Resolution : 4k");
		System.out.println("Connector Type : wi-fi, USB, Ethernate, HDMI with Alexa Compatibility");
		System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
		System.out.println("Display: LED 4K Ultra HD, 3840 x 2160 pixels, 60 Hz Refresh Rate");
		System.out.println("On Mode power consumption : 142 watts");
		System.out.println("Visible Screen Diagonal : 55inch/140cm");
		System.out.println("Price : 68,390 Rs");
		break;

		case 2:
		System.out.println("You have selected AUE60 Crystal 4K UHD");
		System.out.println("Model Name:AUE60 Crystal 4K UHD ");
		System.out.println("Colour : Black");
		System.out.println("Resolution : 4k");
		System.out.println("Connector Type : wi-fi, USB, Ethernate, HDMI with Alexa Compatibility");
		System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
		System.out.println("Display: LED 4K Ultra HD, 3840 x 2160 pixels, 60 Hz Refresh Rate");
		System.out.println("On Mode power consumption : 96 watts");
		System.out.println("Visible Screen Diagonal : 43inch/110cm");
		System.out.println("Price : 50,900 Rs");
		break;

		case 3:
		System.out.println("You have selected SAMSUNG Series 4 80 cm (32 inch) HD");
		System.out.println("Model Name: SAMSUNG Series 4 80 cm (32 inch) HD");
		System.out.println("Colour : Black");
		System.out.println("Resolution : 4k");
		System.out.println("Connector Type : wi-fi, USB< Ethernate, HDMI with Alexa Compatibility");
		System.out.println("Supported Internate : Netflix,Zee5, Amazon Prime,Voot,SonyLiv,Disney Hotstar");
		System.out.println("Display Technology: LED");
		System.out.println("On Mode power consumption : 89 watts");
		System.out.println("Visible Screen Diagonal : 32inch/80cm");
		System.out.println("Price : 30,000 Rs");
		break;
//		default:
//			 payment p1 = new paymentopt();
//			 payment p2 = (payment) p1;
//			 p2. paymentopt();
//			 break;
		}
		}
		}
	

//class payment extends croma_prod
//{
//public void paymentopt()
//{
//	  int p;
//
//	    Scanner s14 = new Scanner(System.in);
//	    System.out.println(" Enter 1 for CASH ");
//	    System.out.println(" Enter 2 for CARD");
//	    System.out.println(" Enter 3 for UPI");
//	    p = s14.nextInt();
//	    switch (p) 
//	    {
//	    case 1:
//	    	System.out.println("You have slected cash");
//	    	System.out.println("done");	
//	    	System.out.println("THANK YOU FOR VISITING");	
//	    	break;
//	    case 2:
//	    	System.out.println("You have slected card");
//	    int a= 1;
//	    	if (a==1)
//	    	{
//	    		System.out.println("you have selected EMI");
//	    		System.out.println("downpayment =10,000");
//	    	}
//	    	else
//	    	{
//	    		System.out.println("you have selected one time payment");
//	    	}
//	    	
//	    	System.out.println("done");	
//	    	System.out.println("THANK YOU FOR VISITING");	
//	    	break;
//	    	
//             case 3:
//	         System.out.println("You have slected UPI");
//	         System.out.println("done");	
//	         System.out.println("THANK YOU FOR VISITING");	
//	    	break;	    	
//}	    	
//}
//}
//				
    				
    				
	