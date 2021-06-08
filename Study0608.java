class Study0608{
public static void main(String[] args) {
    String phone_number = "01033334444";
        System.out.print(phone_number.replaceAll("[0-9]","*").substring(0,phone_number.length()-4)+phone_number.substring(phone_number.length()-4,phone_number.length()));
    }
}