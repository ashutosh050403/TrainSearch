package com.vision.Train.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainName;

    private String trainNumber;

    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<TrainSchedule> schedules;

    public Train() {
    }

    public Train(Long id, String trainName, String trainNumber, List<TrainSchedule> schedules) {
        this.id = id;
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.schedules = schedules;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public List<TrainSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<TrainSchedule> schedules) {
        this.schedules = schedules;
    }
}
