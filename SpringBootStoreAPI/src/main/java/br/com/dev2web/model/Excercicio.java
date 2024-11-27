package br.com.dev2web.model;

import jakarta.persistence.*;

@Entity
public class Excercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;

    private String includedExcercises;

    private Long seriesNumber;

    private Long repeticions;

    private Long restAfterSeries;

    private Status status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncludedExcercises() {
        return includedExcercises;
    }

    public void setIncludedExcercises(String includedExcercises) {
        this.includedExcercises = includedExcercises;
    }

    public Long getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(Long seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public Long getRepeticions() {
        return repeticions;
    }

    public void setRepeticions(Long repeticions) {
        this.repeticions = repeticions;
    }

    public Long getRestAfterSeries() {
        return restAfterSeries;
    }

    public void setRestAfterSeries(Long restAfterSeries) {
        this.restAfterSeries = restAfterSeries;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
