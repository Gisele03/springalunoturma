package com.projetojpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetojpa.entities.Turma;
import com.projetojpa.repository.TurmaRepository;

@Service 
public class TurmaService { 
	private final TurmaRepository turmaRepository; 

	@Autowired 
	public TurmaService(TurmaRepository turmaRepository) { 
        this.turmaRepository = turmaRepository; 
    } 

	public List<Turma> buscaTodosTurmas(){ 
		return turmaRepository.findAll(); 
	} 
	
    public Turma buscaTurmaById(Long id) { 
    	Optional <Turma> turma = turmaRepository.findById(id); 
        return turma.orElse(null); 
    } 

    public Turma salvaTurma(Turma turma) { 
        return turmaRepository.save(turma); 
    } 

    public Turma alterarTurma(Long id, Turma alterarTurma) { 
    	Optional <Turma> existeTurma = turmaRepository.findById(id); 
    	if(existeTurma.isPresent()) { 
    		alterarTurma.setId(id); 
    		return turmaRepository.save(alterarTurma); 
    	} 
    	return null; 
    } 
    public boolean apagarTurma(Long id) { 
    	Optional <Turma> existeTurma = turmaRepository.findById(id); 
    	if(existeTurma.isPresent()) { 
    		turmaRepository.deleteById(id); 
    		return true; 
    	} 
    	return false; 
    } 

}