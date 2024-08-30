package com.fitnessplatform.service;

import com.fitnessplatform.model.Workout;
import com.fitnessplatform.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {
    @Autowired
    private WorkoutRepository workoutRepository;

    public List<Workout> getWorkoutsByUser(Long userId) {
        return workoutRepository.findByUserId(userId);
    }

    public Workout saveWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }
}
