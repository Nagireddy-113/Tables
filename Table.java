import java.util.*;
class Table
{
public static void main(String...args){
Scanner s=new Scanner(System.in);
System.out.println("enter A, B value for Table");
int A=s.nextInt();
int B=s.nextInt();
for(int i=1;i<=A;i++){
for(int j=1;j<=B;j++){

 System.out.println("Table is : "+i+"*"+j+"= "+(i*j)); 
}
}}}