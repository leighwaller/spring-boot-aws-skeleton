package au.com.samples;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class ApplicationTest {

    @Test
    public void shouldStartApplication() {
        Application.main(new String[]{});
    }

}
