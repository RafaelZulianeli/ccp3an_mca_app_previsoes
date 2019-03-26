package br.app.previsoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.app.previsoes.model.Previsao;
import br.app.previsoes.repository.PrevisoesRepository;

@Controller
public class PrevisaoController {
	@Autowired
	private PrevisoesRepository previsoesRepo;

	@GetMapping("/sao-paulo")
	public ModelAndView listarPrevisoes() {

		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_previsao");

		// Busque a coleção com o repositório
		List<Previsao> previsoes = previsoesRepo.findAll();

		// adicione a coleção ao objeto ModelAndView
		mv.addObject("previsoes", previsoes);

		// para modelar o formulário
		mv.addObject(new Previsao());

		// devolva o ModelAndView
		return mv;
	}

}
