package edu.mum.cs.cs425.studentmgmt.service;

import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ITranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptService {
    @Autowired
    private ITranscriptRepository transcriptRepository;

    public Transcript createTranscript(Transcript transcript){
        return transcriptRepository.save(transcript);
    }

    public Transcript getTranscriptByTitle(String title){
        return transcriptRepository.findByDegreeTitle(title);
    }
}
