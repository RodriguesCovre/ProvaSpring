package com.example.storeapi.service;

import com.example.storeapi.model.Treino;
import com.example.storeapi.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TreinoService {
    @Autowired
    private TreinoRepository TreinoRepository;

    public List<Treino> getAllTreinos() {
        return TreinoRepository.findAll();
    }

    public Treino addTreino(Treino Treino) {
        return TreinoRepository.save(Treino);
    }

    public Treino getTreinoById(Long id) {
        return TreinoRepository.findById(id).orElse(null);
    }
}