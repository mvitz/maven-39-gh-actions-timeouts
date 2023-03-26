package de.mvitz;

import org.junit.jupiter.api.RepeatedTest;

import static java.util.concurrent.TimeUnit.SECONDS;

class ApplicationTest {

    @RepeatedTest(12)
    void longRunning() throws Exception {
        SECONDS.sleep(30);
    }
}
