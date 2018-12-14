package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTask {
    private static final int FIVE_SECONDS = 5000;
    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTask.class);
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Scheduled(fixedRate = FIVE_SECONDS)
    public void execute() {
        LOG.info("The time is now {}", LocalTime.now().format(FORMAT));
    }
}
