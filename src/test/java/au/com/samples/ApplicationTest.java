package au.com.samples;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertFalse;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class ApplicationTest {

    @Test
    public void shouldStartApplication() {
        Application.main(new String[]{});

        assertFalse(true);
    }

}
