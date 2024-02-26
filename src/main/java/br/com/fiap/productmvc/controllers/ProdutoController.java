package br.com.fiap.productmvc.controllers;


import br.com.fiap.productmvc.models.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                  //Falando para o Spring para gerenciar essa classe
@RequestMapping("/produtos") //Mapeando URL
public class ProdutoController {

    @GetMapping("/novo") //Define uma rota que responde a requisições HTTP GET
    public String adicionarProduto(Model model){
        //Vies ficam dentro da pastra de templates
        //Retorna caminho da página de cadastro (html)

        //26/02
        //Model é injetado. Instancia um objeo poduto vazio, associando a chave
        model.addAttribute("produto", new Produto());
        return "produto/novo-produto";
    }

    @PostMapping("/salvar") //Recebe dados da view para cadastrar o produto
    public String insertProduto(Produto produto){
        System.out.printf(produto.toString());
        return "redirect:/produtos/novo";
    }
}
