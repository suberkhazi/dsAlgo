package typeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // Automatic typecasting
        int x = 10;
        double y = x;
        System.out.println("int x = " + x );
        System.out.println("double y = " + y);

        //manual typecasting
        double deciData = 6.5264;
        int converted = (int)deciData;

        System.out.println(deciData);
        System.out.println(converted);

    }
}
