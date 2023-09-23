package com.example.GymManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/gym")
public class GymManagementController {

    List<Gym> gyms = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public List<Gym> getAllGym(){
        return gyms;
    }
    public List <Member> getAllMembers(){
        return members;
    }

    //Find the gym with most number of members

    @GetMapping("/gym-with-most-member")
    public Gym findGymWithMostMembers()
    {
        List<Gym> gyms = getAllGym();
        Gym gymWithMostMembers = null;
        int maxMembers = 0;

        for(Gym gym : gyms)
        {
            int numMembers = getAllMembers().size();
            if(numMembers > maxMembers)
            {
                maxMembers = numMembers;
                gymWithMostMembers = (Gym) gyms;
            }
        }
        return gymWithMostMembers;
    }


    //Find the member which is being trained by most number of trainers

    public Member findMemberTrainedByMostTrainer()
    {
        List<Member> members = getAllMembers();

        Member memberTrainedByMostTrainers = null;
        int maxTrainers =0;
        for(Member member : members){
            int numTrainers = member.getTrainers().size();
            if(numTrainers > maxTrainers){
                maxTrainers = numTrainers;
                memberTrainedByMostTrainers = member;
            }
        }
        return memberTrainedByMostTrainers;
    }


    //Find the number of trainers that work in more than 5 gyms.
    @GetMapping("/trainers-with-more-than-five-Gyms")
    public Long countTrainerWorkMoreFiveGyms(){
        Map<Long,Integer> trainerGymCount = new HashMap<>();

        for(Gym gym :gyms){
            for(Trainer trainer : gym.getTrainers()){
                trainerGymCount.put(trainer.getId(),trainerGymCount.getOrDefault(trainer.getId(),0) +1);
            }
        }

        // Mam here is the count the trainers

        int count = 0;

        for(Map.Entry<Long, Integer> entry : trainerGymCount.entrySet()){
            if(entry.getValue() > 5){
                count++;
            }
        }
        return (long) count;
    }

}
