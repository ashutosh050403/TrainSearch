package com.vision.Train.service;

import com.vision.Train.entity.Train;
import com.vision.Train.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {


    private TrainRepository trainRepository;
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }


    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }
}
