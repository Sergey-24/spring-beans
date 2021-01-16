package app.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timer {

    private AnimalsCage cage;

    @Autowired
    public void setCage(AnimalsCage cage) {
        this.cage = cage;
    }


    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
