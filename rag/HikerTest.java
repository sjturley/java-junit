import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import static org.junit.jupiter.api.Assertions.*;

public class HikerTest {
    @ParameterizedTest
    void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }
}
