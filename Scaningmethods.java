import java.util.*;//(astrick) is used to import all the packages
public class Scaningmethods {

    //nextLine method of integer data types
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);//creating an object instance
        System.out.println("enter an integer");
        int data = input.nextInt();// for integer data type
        System.out.println("enter the name below:");
        String data1 = input.nextLine();// for string  data type
        System.out.println("Enter your values:");
        double num1=input.nextDouble();
        float num2=input.nextFloat();
        long num3=input.nextLong();
        short num4=input.nextShort();
        byte num5=input.nextByte();
        boolean nikitha=true;
        System.out.println("Integer: " + data);
        System.out.println("welcome to java tutorial, " + data1);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(nikitha);
        input.close();//close the scanner
    }
}
//nextLine() method is used for strings
 //nextBoolean()
//nextbyte()
//nextfloat()
//nextLong()
//nextShort()
//nextDouble()
