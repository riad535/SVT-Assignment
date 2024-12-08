import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class Q1Task5Test {
    private Q1Task5 task;

    @BeforeEach
    void setUp() {
        task = new Q1Task5();
    }

    @AfterEach
    void tearDown() {
        task = null;
    }

    @Test
    void running() {
        Duration timeout = Duration.ofMillis(250);

        assertTimeout(timeout, () -> {
            task.running();
        });
    }
}