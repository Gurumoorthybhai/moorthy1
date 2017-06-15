import java.util.io.*;
class Positive{
public static void main(String[] args){
int a;
Scanner ob=new Scanner(System.in);
a=ob.nextInt();
if(a==0)
System.out.print(Zero);
else if(a>0)
System.out.print(positive);
else
System.out.print(Negative);
}
}
