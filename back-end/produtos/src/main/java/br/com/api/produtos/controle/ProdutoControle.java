package br.com.api.produtos.controle;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.servico.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ProdutoControle {

    @Autowired
    private ProdutoServico produtoServico;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo produtoModelo){
        return produtoServico.cadastrarAlterar(produtoModelo, "cadastrar");
    }
    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModelo produtoModelo){
        return produtoServico.cadastrarAlterar(produtoModelo, "alterar");
    }
    @DeleteMapping("/remover/{codigo}")
    public ResponseEntity<RespostaModelo> remover(@PathVariable long codigo){
        return produtoServico.remover(codigo);
    }

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
        return produtoServico.listar();
    }

    @GetMapping("/")
    public String rota(){
        return "API de produtos funcionando";
    }

}
