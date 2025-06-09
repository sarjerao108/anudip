import java.util.Scanner;
class leapyear{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a year to check if it is a leap year or not:");
    int a =sc.nextInt();
    if(a == 1900 ){
        System.out.println(a+"is a  not leap year");
    } else if (a%4==0 ){
        System.out.println(a+"is a leap year");
    }
    else{
        System.out.println(a+"is not leapyear");
    }
    sc.close();

} 
}