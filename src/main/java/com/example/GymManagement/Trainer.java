package com.example.GymManagement;


import java.util.List;

public class Trainer {
    public Long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(List<Gym> gyms) {
        this.gyms = gyms;
    }

    public Trainer(Long trainerId, List<Member> members, List<Gym> gyms) {
        this.trainerId = trainerId;
        this.members = members;
        this.gyms = gyms;
    }

    public Trainer() {
    }

    private Long trainerId;
    private List<Member> members;

    private List<Gym> gyms;


    public Long getId() {
        return trainerId;
    }
}
