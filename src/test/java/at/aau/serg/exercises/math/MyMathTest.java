package at.aau.serg.exercises.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyMathTest {
    @Test
    public void x() {
        Double x=10d;
        Double y=5d;
        //assertTrue(add.equals(new Double(15)));
        Assertions.assertEquals(15.0,(double) new MyMath().add(x, y));
        Assertions.assertEquals(5.0,(double) new MyMath().sub(x, y));
        Assertions.assertEquals(50.0,(double) new MyMath().mul(x, y));
        Assertions.assertEquals(2.0,(double) new MyMath().div(x, y));
    }
    @ParameterizedTest
    @CsvSource({"1,1", "10,6", "10,5"}) // multiple value
    public void x2(int num,int den) {
        Fraction f = new Fraction(num,den);
        MyMath mm = new MyMath();
        Fraction reduced = mm.reduce(f);
        if(den==1)
        {
            assertEquals(Integer.valueOf(1),reduced.getNumerator());
            assertEquals(Integer.valueOf(1),reduced.getDenumerator());
        }
        else if(den==6){
            assertEquals(Integer.valueOf(5),reduced.getNumerator());
            assertEquals(Integer.valueOf(3),reduced.getDenumerator());
        }
        else{
            assertEquals(Integer.valueOf(2),reduced.getNumerator());
            assertEquals(Integer.valueOf(1),reduced.getDenumerator());}


    }
    @ParameterizedTest
    @CsvSource({"10,5", "10,4"}) // multiple value
    public void x3(int num,int den) {
        Fraction f = new Fraction(num,den);
        MyMath mm = new MyMath();
        Double aDouble = mm.toDouble(f);
        if(den==5)
        {
            assertEquals(2.0,(double)aDouble);}
        else{
            assertEquals(2.5d,(double)aDouble);}
    }
}
