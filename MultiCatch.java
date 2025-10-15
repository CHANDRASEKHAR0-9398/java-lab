class MultiCatch{
    public static void main (String[]args){
        try {
            int [] arr ={20,22,24,25};
            System.out.println(" array is   "+arr[2]);
            int d=50/10;
             System.out.println( "operations "+d);
            String str="abc";
            int v=Integer.parseInt(str);
            System.out.println( "number is "+v);
        } catch (ArithmeticException e) {
            System.out.println(" ArithmeticException occured "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" ArrayIndexOutOfBoundsException occured "+e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println(" NumberFormatException occured "+e.getMessage());
        }
    }
}