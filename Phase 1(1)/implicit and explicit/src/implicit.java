
public class implicit {
public static void main(String[] args) {
        
        int numberint;
        short numbershort;
        byte numberbyte;
        float numberfloat;
        double numberdouble;
        long numberlong;
        numberbyte=28;
        numbershort=numberbyte;
        numberint=numbershort;
        numberlong=numberint;
        numberfloat=numberlong;
        numberdouble=numberfloat;
        System.out.println("The short value is "+numbershort);
        System.out.println("The byte value is "+numberbyte);
        System.out.println("The int value is "+numberint);
        System.out.println("The long value is "+numberlong);
        System.out.println("The float value is "+numberfloat);
        System.out.println("The long value is "+numberdouble);
        
        System.out.println("This is explicit conversion");
    }

}
