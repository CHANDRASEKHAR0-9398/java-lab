public class MyException{
    public static void main(String[]args){
        try{
            int data=50/0;
        }catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("this is flow of programm");
    }
}