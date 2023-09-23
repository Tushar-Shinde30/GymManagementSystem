package com.example.GymManagement;

import java.util.List;

public class Gym {

    private String Location;
    private Long gymId;

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Long getGymId() {
        return gymId;
    }

    public void setGymId(Long gymId) {
        this.gymId = gymId;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public Gym(String location, Long gymId, List<Member> members, List<Trainer> trainers) {
        Location = location;
        this.gymId = gymId;
        this.members = members;
        this.trainers = trainers;
    }

    public Gym() {
    }

    private List<Member> members;
    private List<Trainer> trainers;
}
