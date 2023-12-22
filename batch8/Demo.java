class Demo
{
public static void main (String []args)
{
int a=20;
int b=30;
int c=10;
int d=40;
boolean result1=((a+c+b)<d)&&((c+a)==(b+c));
a+=10;
b-=20;
boolean result2=((a+b+c)<d)||!((c+a)>=(b+c));
System.out.println(result1);
System.out.println(result2);
boolean result3=!(result1&&result2);
System.out.println(result3);
 }
}
