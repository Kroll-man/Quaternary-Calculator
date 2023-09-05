import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternaryConverterTest {
    @Test
    public void testToQuaternary0is0() {
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(0, converter.toQuaternary(0));
    }

    @Test
    public void testFromQuaternary0is0() {
        QuaternaryConverter converter = new QuaternaryConverter();
        Assertions.assertEquals(0, converter.fromQuaternary(0));
    }
}
