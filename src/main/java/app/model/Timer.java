package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
//    public Timer getTimer() {
//        return null;
//    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
