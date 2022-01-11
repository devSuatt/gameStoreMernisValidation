package entities;

import java.time.LocalDate;

public class Campaign {
    private int id;
    private String name;
    private int percentOfDiscount;
    private LocalDate startTime;
    private LocalDate expirationTime;

    public Campaign() {}

    public Campaign(int id, String name, int percentOfDiscount, LocalDate startTime, LocalDate expirationTime) {
        this.id = id;
        this.name = name;
        this.percentOfDiscount = percentOfDiscount;
        this.startTime = startTime;
        this.expirationTime = expirationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentOfDiscount() {
        return percentOfDiscount;
    }

    public void setPercentOfDiscount(int percentOfDiscount) {
        this.percentOfDiscount = percentOfDiscount;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(LocalDate expirationTime) {
        this.expirationTime = expirationTime;
    }
}
