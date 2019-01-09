package com.erivan.guiamedico.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erivan.guiamedico.model.Guia;
import com.erivan.guiamedico.repository.GuiaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST GUIA MEDICO")
public class GuiaResource {
	
	@Autowired
	GuiaRepository guiaRepository;
	
	@ApiOperation(value="Retorna uma lista de  medicos")
	@GetMapping("/guia")
	public List<Guia> listaGuiaMedico(){
		return guiaRepository.findAll();
		
	}
	@ApiOperation(value="Retorna um unico medico")
	@GetMapping("/guia/{id}")
	public Guia listaGuiaUnicoMedico(@PathVariable(value="id") long id) {
		return guiaRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um medico no guia")
	@PostMapping("/guia")
	public Guia salvaMedico(@RequestBody @Valid Guia guia) {
		return guiaRepository.save(guia);
	}
	
	@ApiOperation(value="Deleta um medico no guia")
	@DeleteMapping("/guia")
	public void deletaGuia(@RequestBody @Valid Guia guia) {
	     guiaRepository.delete(guia);
	}
	@ApiOperation(value="Atualiza informações de um medico")
	@PutMapping("/guia")
	public Guia atualizaGuia(@RequestBody @Valid Guia guia) {
		return guiaRepository.save(guia);
	}
	
	
	
	

}
