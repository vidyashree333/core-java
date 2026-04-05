class HeadPhoneRunner{

public static void main(String[] args){

HeadPhone.getheadphoneDetails();

HeadPhone.getheadphoneDetailss("boat");

int battery=HeadPhone.getheadphonebattery();
System.out.println(battery);

int price=HeadPhone.getheadphoneprice(40,50);
System.out.println(price);

}
}