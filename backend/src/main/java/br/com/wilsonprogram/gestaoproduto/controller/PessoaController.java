package br.com.wilsonprogram.gestaoproduto.controller;

import br.com.wilsonprogram.gestaoproduto.entity.Pessoa;
import br.com.wilsonprogram.gestaoproduto.repository.PessoaRepository;
import ch.qos.logback.core.joran.spi.ElementSelector;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.hibernate.annotations.common.reflection.XMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Pessoa salvar(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    @GetMapping
    public List<Pessoa> listarTodos(){
        return pessoaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscaId(@PathVariable Long id){
        Optional<Pessoa> optPessoa = pessoaRepository.findById(id);
        return optPessoa.map(pessoa -> new ResponseEntity<>(pessoa, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa newPessoa){
        Optional<Pessoa> optPessoa = pessoaRepository.findById(id);
        if(optPessoa.isPresent()){
            Pessoa pessoa = optPessoa.get();
            pessoa.setNome(newPessoa.getNome());
            pessoaRepository.save(pessoa);
            return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
    {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        if(pessoa.isPresent()){
            pessoaRepository.delete(pessoa.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
