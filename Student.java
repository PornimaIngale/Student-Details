import java.util.*;
class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s1,s2,s3,s4,s5;
String name;
float percentage,total,average;
char grade;
System.out.println("Enter Student Name");
name=sc.next();
System.out.println("Enter 5 Subject Marks");
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
s4=sc.nextInt();
s5=sc.nextInt();
total=s1+s2+s3+s4+s5;
average=total/5;
percentage=total/500*100;
System.out.println("Total Marks="+total);
System.out.println("Average="+average);
System.out.println("Total Percentage="+percentage);

if(percentage>=90)
{
System.out.println("A Grade");
}
else if(percentage>=80)
{
System.out.println("B Grade");
}
else if(percentage>=70)
{
System.out.println("C Grade");
}
else if(percentage>=60)
{
System.out.println("D Grade");
}
else if(percentage>=50)
{
System.out.println("E Grade");
}
else if (percentage>=35)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail/Try to Attempt");
}

}
}