import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class HikerTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Hiker.answer();
        assertThat(expected).isEqualTo(actual);
    }
}
