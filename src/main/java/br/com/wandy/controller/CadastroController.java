package br.com.wandy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.wandy.exception.CadastroException;
import br.com.wandy.model.Beneficiario;
import br.com.wandy.repository.CadastroRepository;

@RestController
public class CadastroController {
	
	@Autowired
	private CadastroRepository repository;
	
	@GetMapping("/listar")
	List<Beneficiario> listarBeneficiarios(){
		return repository.findAll();
	}
	
	@PostMapping("/adicionar")
	Beneficiario adicionar(@RequestBody Beneficiario param) {
		return repository.save(param);		
	}
	
	@GetMapping("/beneficiario/{id}")
	Beneficiario consultar(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new CadastroException(id));
		
	}

}
