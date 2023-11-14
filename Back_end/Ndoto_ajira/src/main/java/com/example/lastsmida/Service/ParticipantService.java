package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Participant;
import com.example.lastsmida.Repository.ParticipantRepository;

public class ParticipantService {

    private final ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public Participant saveParticipant(Participant participant) {
        return participantRepository.save(participant);
    }
}
