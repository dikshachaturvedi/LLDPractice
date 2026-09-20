package Ratelimiter;

import java.util.concurrent.atomic.AtomicInteger;

public class ClientWindowState {
    private long currentWindowStartTimestamp;
    private AtomicInteger previousWindowCounter;
    private AtomicInteger currentWindowCounter;

    public ClientWindowState(long currentWindowStartTimestamp) {
        this.currentWindowStartTimestamp = currentWindowStartTimestamp;
        this.previousWindowCounter = new AtomicInteger(0);
        this.currentWindowCounter = new AtomicInteger(0);
    }

    public long getCurrentWindowStartTimestamp() {
        return currentWindowStartTimestamp;
    }

    public void setCurrentWindowStartTimestamp(long currentWindowStartTimestamp) {
        this.currentWindowStartTimestamp = currentWindowStartTimestamp;
    }

    public AtomicInteger getPreviousWindowCounter() {
        return previousWindowCounter;
    }

    public void setPreviousWindowCounter(AtomicInteger previousWindowCounter) {
        this.previousWindowCounter = previousWindowCounter;
    }

    public AtomicInteger getCurrentWindowCounter() {
        return currentWindowCounter;
    }

    public void setCurrentWindowCounter(AtomicInteger currentWindowCounter) {
        this.currentWindowCounter = currentWindowCounter;
    }
}
