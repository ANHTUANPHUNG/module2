import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Stopwatch1 {

    private Instant startTime;
    private Instant endTime;

    public Stopwatch1() {
        this.startTime = Instant.now();
    }
    public void start(){
        startTime=Instant.now();
    }
    public void stop(){
        endTime=Instant.now();
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }
    

    public long getElapsedTime() {
        if (endTime == null) {
            return Instant.now().toEpochMilli() - startTime.toEpochMilli();
        } else {
            return endTime.toEpochMilli() - startTime.toEpochMilli();
        }

    }
}

