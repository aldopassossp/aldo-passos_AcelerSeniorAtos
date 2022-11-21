package br.atos.crud_zoologico.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.atos.crud_zoologico.model.Cuidador;
import br.atos.crud_zoologico.repository.CuidadorRepository;

@Controller
public class CuidadorController {

	@Autowired
	CuidadorRepository cuidadorRepository;
	
	@RequestMapping(value = "/cadastrarCuidador", method = RequestMethod.GET)
	public String cadastroCuidador() {
		
		return "cuidador/cadastroCuidador";
	}
	
	@RequestMapping(value = "/cadastrarCuidador", method = RequestMethod.POST)
	public String cadastroCuidador(Cuidador cuidador) {
		
		Long ultimoId = cuidadorRepository.findLastId()+1;
		String matricula = ultimoId.toString();
		if(matricula.length()==3) {
			matricula =	"0" + matricula;
		}else if(matricula.length()==2) {
			matricula =	"00" + matricula; 
		}else if(matricula.length()==1) {
			matricula =	"000" + matricula; 
		}
		cuidador.setMatricula("ZO-" + matricula);
		cuidadorRepository.save(cuidador);
		return "redirect:/listarCuidador";
	}
	
	@RequestMapping("/listarCuidador")
	public ModelAndView listarCuidador() {
		
		ModelAndView cuidadorModelAndView = new ModelAndView("cuidador/listarCuidador");
		Iterable<Cuidador> cuidadoresLista = cuidadorRepository.findAll();
		cuidadorModelAndView.addObject("cuidadores",cuidadoresLista);
		return cuidadorModelAndView;
	}
	
	@RequestMapping(value = "/deletarCuidador/{id}", method = RequestMethod.GET)
	public String deletarCuidador(@PathVariable("id") long idReq) {
		
		cuidadorRepository.deleteById(idReq);
		return "redirect:/listarCuidador";
	}
	
	@RequestMapping(value = "/editarCuidador/{id}", method = RequestMethod.GET)
	public ModelAndView editarCuidador(@PathVariable("id") long idReq) {
		
		Cuidador cuidador = cuidadorRepository.findById(idReq);
		ModelAndView cuidadorModelAndView = new ModelAndView("cuidador/editarCuidador");
		cuidadorModelAndView.addObject("cuidadores", cuidador);
		return cuidadorModelAndView;
	}
	
	@PostMapping(value = "/atualizarCuidador")
	public String atualizarCuidador(Cuidador cuidador) {
		
	//	long idCuidador = cuidador.getIdCuidador();
		cuidadorRepository.save(cuidador);
		
		return "redirect:/listarCuidador";
	}
}
