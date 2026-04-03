class Tv1Runner{
	public static void main(String [] args){
		Tv1 teli=new Tv1();
		teli.tvName="LG";
		teli.tvBrand="OLED";
        teli.manufacture="asain electric";
		teli.warranty="1 year";
		teli.device="electric";
		
		teli.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 sony=new Tv1("sony","pavrt","electric cart","2 years","electric");
		sony.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 tcl=new Tv1("TCL","tclIO","electric cart","5 years","electric");
		tcl.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 samsung=new Tv1("Samsung","prosam","electric indian","6 years","electric");
		samsung.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 hisense=new Tv1("Hisense","hisanx100","electric cart","7 years","electric");
		hisense.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 xiaomi=new Tv1("Xiaomi","xami100","electric cart","3 years","electric");
		xiaomi.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 oneplus=new Tv1("Oneplus","coreelectric","electric cart","5 years","electric");
		oneplus.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 panasonic=new Tv1("panasonic","pavrt","electric cart","3 years","electric");
		panasonic.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 vu=new Tv1("Vu","Vu100","electric cart","4 years","electric");
		vu.displayTv1Details();
		System.out.println("------------------------------------");
		
		Tv1 realme=new Tv1("Realme","realme","electric cart","7 years","electric");
		realme.displayTv1Details();
		System.out.println("------------------------------------");

}
}