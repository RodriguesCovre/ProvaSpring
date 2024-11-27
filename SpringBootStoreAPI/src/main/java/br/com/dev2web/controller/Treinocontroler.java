package br.com.dev2web.controler;

import br.com.dev2web.model.Excercicio;
import br.com.dev2web.model.Status;
import br.com.dev2web.service.TreinoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/excercises")
public class Treinocontroler {

    @Autowired
    private TreinoServiceImpl treinoService;

    @RequestMapping("")
    public List<Excercicio> getAll() {
        return treinoService.getAllExcercise();
    }

    @PostMapping("")
    public Excercicio add(@RequestBody Excercicio excercicio) {
        return treinoService.createExcercise(excercicio);
    }

    @PutMapping("/{id}")
    public Excercicio update(@PathVariable Long id, @RequestBody Excercicio excercicio){
        excercicio.setId(id);
        Optional<Excercicio> updateExcercises = treinoService.updateExcercise(id, excercicio);
        return updateExcercises.get();
    }

    @GetMapping("/{id}")
    public Excercicio getById(@PathVariable Long id){
        Excercicio excercicio = treinoService.getExcerciseById(id).get();
        return excercicio;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        treinoService.deleteExcercise(id);
    }

    @GetMapping("/status/{status}")
    public List<Excercicio> getExcercisesByStatus(@PathVariable Status status) {
        return treinoService.getExercisesByStatus(status);
    }
}
