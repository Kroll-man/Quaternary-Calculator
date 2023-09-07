import CalculatorLogic.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternaryConverterTest {

    @Test
    public void testQuaternary0is0() {
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(0, converter.fromQuaternary(0));
    }

    @Test
    public void testToQuaternarySingeDigitIsSame() {
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(0, converter.toQuaternary(0));
        Assertions.assertEquals(1, converter.toQuaternary(1));
        Assertions.assertEquals(2, converter.toQuaternary(2));
        Assertions.assertEquals(3, converter.toQuaternary(3));
    }

    @Test
    public void testToQuaternaryFourIsTen(){
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(10, converter.toQuaternary(4));
    }

    @Test
    public void testToQuaternaryLargeInput(){
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(1110121023, converter.toQuaternary(345675));
    }

    @Test
    public void testToQuaternaryNegative(){
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(-10, converter.toQuaternary(-4));
        Assertions.assertEquals(-1, converter.toQuaternary(-1));
        Assertions.assertEquals(-2, converter.toQuaternary(-2));
        Assertions.assertEquals(-3, converter.toQuaternary(-3));
        Assertions.assertEquals(-1110121023, converter.toQuaternary(-345675));
    }

    @Test
    public void testFromQuaternary0is0(){
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(0, converter.fromQuaternary(0));
    }

    @Test
    public void testFromQuaternaryLargeInput(){
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(345675, converter.fromQuaternary(1110121023));
    }

    @Test
    public void testFromQuaternaryTenIsFour(){
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(4, converter.fromQuaternary(10));
    }

    @Test
    public void testFromQuaternarySingeDigitIsSame() {
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(0, converter.fromQuaternary(0));
        Assertions.assertEquals(1, converter.fromQuaternary(1));
        Assertions.assertEquals(2, converter.fromQuaternary(2));
        Assertions.assertEquals(3, converter.fromQuaternary(3));
    }
}
