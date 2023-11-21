import org.example.Developer;
import org.example.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DeveloperTests {
    @Test
    public void testGetSound(){
        var developer = new Developer("Kalle", "Java");
        var expected = "Är du redan hungrig?";
        var actual = developer.getSound();

        assertEquals(expected, actual);

    }

    @Test
    public void getProgrammingLanguage(){
        var developer = new Developer("Andreas", "Java");

        var expected = "Java";
        var actual = developer.getProgrammingLanguage();

        assertEquals(expected, actual);

    }

}
