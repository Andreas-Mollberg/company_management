import org.example.CloudDeveloper;
import org.example.Website;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloudDeveloperTests {
    @Test
    public void testUpdateWebsite(){
        var cloudDeveloper = new CloudDeveloper("Andreas", "Java");
        var website = new Website(false); // working = false
        cloudDeveloper.fixWebsite(website);

        var expected = true;
        var actual = website.isWorking();

        assertEquals(expected, actual);
    }
}
