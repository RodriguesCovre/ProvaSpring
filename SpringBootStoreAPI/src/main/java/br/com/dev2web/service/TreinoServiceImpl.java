package br.com.dev2web.service;

import br.com.dev2web.model.Excercicio;
import br.com.dev2web.model.Status;
import br.com.dev2web.repository.TreinoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreinoServiceImpl {

    @Autowired
    private TreinoRepository treinoRepository;


    public List<Excercicio> getAllExcercise() {
        return treinoRepository.findAll();

    }

    public Optional<Excercicio> getExcerciseById(Long id) {
        return treinoRepository.findById(id);
    }


    public Excercicio createExcercise(Excercicio excercicio){
        return treinoRepository.save(excercicio);
    }

    public Optional<Excercicio> updateExcercise(Long id, Excercicio excercicioDetails){
        return treinoRepository.findById(id).map(excercicio -> {
            excercicio.setIncludedExcercises(excercicioDetails.getIncludedExcercises());
            excercicio.setSeriesNumber(excercicioDetails.getSeriesNumber());
            excercicio.setRepeticions(excercicioDetails.getRepeticions());
            excercicio.setRestAfterSeries(excercicioDetails.getRestAfterSeries());
            excercicio.setStatus(excercicioDetails.getStatus());
                return treinoRepository.save(excercicio);
        });
    }

    public boolean deleteExcercise(Long id){
        treinoRepository.deleteById(id);
        return true;
    }

    public List<Excercicio> getExercisesByStatus(Status status) {
        return treinoRepository.findByStatus(status);
    }



}
