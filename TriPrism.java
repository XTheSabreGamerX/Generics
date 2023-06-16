/* Juan Carlos T. Matias
IT201A*/

public class TriPrism<T, T2, T3> {
    
    private T length;
    private T2 base;        //Private variables of length, base, and height
    private T3 height;

    public void setValue(T dt1, T2 dt2, T3 dt3){
        length = dt1;
        base = dt2;     //Sets the values of the variables above
        height = dt3;
    }

    public T getT1Value() {     //The value of T1 is the length, which gets returned
        return length;
    }

    public T2 getT2Value() {    //The value of T2 is the base, which gets returned
        return base;
    }

    public T3 getT3Value() {    //The value of T3 is the height, which gets returned
        return height;
    }
    
}