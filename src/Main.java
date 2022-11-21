import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,d,result;
        Scanner s=new Scanner(System.in);
        System.out.println("1.Find largest number\n2.Find smallest number\n3.Prime number or Not\n4.Even or Not\n5.Find reverse");
        System.out.println("Enter your choice:");
        a=s.nextInt();
        do {
            switch (a) {
                case 1:
                    System.out.println("enter 3 number");
                    b = s.nextInt();
                    c = s.nextInt();
                    d = s.nextInt();
                    if(b>c & b>d){
                        System.out.println(b+" is the largest number");
                    } else if (c>d) {
                        System.out.println(c+" is the largest number");
                    }else {
                        System.out.println(d+" is the largest number");
                    }
                    break;
                case 2:
                    System.out.println("enter 3 number");
                    b = s.nextInt();
                    c = s.nextInt();
                    d = s.nextInt();
                    if(b<c & b<d){
                        System.out.println(b+" is the smallest number");
                    } else if (c<d) {
                        System.out.println(c+" is the smallest number");
                    }else {
                        System.out.println(d+" is the smallest number");
                    }
                    break;
                case 3:
                    System.out.println("enter a number");
                    b = s.nextInt();
                    boolean flag =false;
                    for (int i = 2; i <= b / 2; ++i) {
                        // condition for nonprime number
                        if (b % i == 0) {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag)
                        System.out.println(b + " is a prime number.");
                    else
                        System.out.println(b + " is not a prime number.");
                break;
                case 4:
                    System.out.print("Enter a number: ");
                    b = s.nextInt();

                    if(b % 2 == 0)
                        System.out.println(b + " is even");
                    else
                        System.out.println(b + " is odd");
                    break;

            }
        }while(a!=6);
    }

}