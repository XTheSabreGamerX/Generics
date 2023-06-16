/* Juan Carlos T. Matias
IT201A*/

public class TriPrismDemo {
    
    public static void main(String[] args) {
        TriPrism <Integer, Integer, Integer> tp1 = new TriPrism<>();    //Two new objects. tp1 contains integer values while tp2 contains double values.
        TriPrism <Double, Double, Double> tp2 = new TriPrism<>();

        tp1.setValue(10, 7, 5);     
        tp2.setValue(9.10, 6.25, 4.20);     //Constructors that sets the value of both triangular prisms.

        int tri1_1 = tp1.getT1Value();
        int tri1_2 = tp1.getT2Value();
        int tri1_3 = tp1.getT3Value();      //Getters. Whatever the value that the getters return is what gets sent here.
        double tri2_1 = tp2.getT1Value();
        double tri2_2 = tp2.getT2Value();
        double tri2_3 = tp2.getT3Value();

        double vol1 = tri1_1 * (0.5 * tri1_2 * tri1_3);     //Volume calculations
        double vol2 = tri2_1 * (0.5 * tri2_2 * tri2_3); 

        System.out.println("Triangular Prism 1");
        System.out.println("Length: " + tri1_1);
        System.out.println("Base: " + tri1_2);
        System.out.println("Height: " + tri1_3);
        System.out.println("The volume of the triangular prism is " + vol1 + ".");      //Magnificent Output!

        System.out.println("Triangular Prism 2");
        System.out.printf("Length: %.2f \n", tri2_1);
        System.out.printf("Base: %.2f \n", tri2_2);
        System.out.printf("Height: %.2f \n", tri2_3);
        System.out.printf("The volume of the triangular prism is %.4f", vol2, ".");
    }
}
