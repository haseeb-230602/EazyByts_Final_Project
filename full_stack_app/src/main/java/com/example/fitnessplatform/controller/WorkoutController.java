package com.fitnessplatform.controller;

import com.fitnessplatform.model.Workout;
import com.fitnessplatform.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    @Autowired
    private WorkoutService workoutService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Workout>> getWorkoutsByUser(@PathVariable Long userId) {
        List<Workout> workouts = workoutService.getWorkoutsByUser(userId);
        return ResponseEntity.ok(workouts);
    }

    @PostMapping("/add")
    public ResponseEntity<Workout> addWorkout(@RequestBody Workout workout) {
        Workout savedWorkout = workoutService.saveWorkout(workout);
        return ResponseEntity.ok(savedWorkout);
    }
}
