public class Boxandunbox{
    public static void main(String[] args) {
      
        int primitiveInt = 10;
        Integer wint = Integer.valueOf(primitiveInt); 

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wint);

        Integer wrappedNumber=20;
        int primitiveNumber = wrappedNumber; 
        System.out.println("Wrapped Integer: " + wrappedNumber);
        System.out.println("Primitive int: " + primitiveNumber);
    }
}