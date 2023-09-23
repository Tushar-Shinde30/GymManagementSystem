package com.example.GymManagement;

import java.util.List;

public class Member {

    private Long memberId;

    public Member(Long memberId, Gym gym, List<Trainer> trainers) {
        this.memberId = memberId;
        this.gym = gym;
        this.trainers = trainers;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    private Gym gym;

    public Member() {
    }

    private List<Trainer> trainers;
}
