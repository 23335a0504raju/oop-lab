class Exceptionhand{
    public
   float result;
        void divide(int num[]){
           try{
            for(int i=0;i<10;i++)
               try{
                int a;
                result=2/num[i];
                System.out.println("the result= "+result);
               }
            
            catch(ArithmeticException obj){
                System.out.println("Third exception");
                System.out.println("Divide by zero is not possible send any integer type data");
            }
        }
            catch(IndexOutOfBoundsException obj){
                System.out.println("Fourth exception");
                System.out.println("The iteration exceeded its limts");
            }
            catch(NullPointerException n){

            }
            finally{
                System.out.println("Block of code is executed");
            }
        }
public static void main(String args[]){
    int num[]={1,2,0,4,5};

    Exceptionhand obj;
        try{
            obj=new Exceptionhand();
            obj.getClass().getMethod("Divide");
            
        }
        catch(NoSuchMethodException e){
            System.out.println("first exception");
            System.out.println("funtion is not called properly");
        
    }
    try{
        String a=null;
        System.out.println(a.length()); 
    }
    catch(NullPointerException e){
        System.out.println("Second Exception:\nNull value is initiated");
    }
    finally{
        obj=new Exceptionhand();
        obj.divide(num);
    }
}
}
