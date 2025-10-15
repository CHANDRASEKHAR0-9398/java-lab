abstract class Shape{
 abstract void area();
 }
 class Circle extends Shape{
 double radius;
 Circle(double r){
 radius=r;
 }
 void area(){
 double d=3.14*radius*radius;
 System.out.println(" the area of circle is  "+d);
 }
 }
 Class Rect extends Shape{
 double le,br;
 Rect(double l,double b){
 le=l;
 br=b;
 }
 void area(){
 double re=le*br;
 System.out.println(" area of the rectangle is  "+re);
 }
 Class Tria extends Shape{
 double len,bre;
 Rect(double le,double br){
 len=le;
 bre=br;
 }
 void area(){
 double res=0.5*le*br;
 System.out.println(" area of the triangle is  "+res);
 }
 }
 public class Testshapes{
 public static void main(String[]args){
 Circle c= new Circle(11);
 Rect r=new Rect(10,20);
 Tria t= new Tria(30,10);
 c.area();
 r.area();
 t.area();
 }
}
  
