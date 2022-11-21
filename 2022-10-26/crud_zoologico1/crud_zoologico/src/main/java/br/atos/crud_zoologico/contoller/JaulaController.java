package br.atos.crud_zoologico.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.atos.crud_zoologico.model.Cuidador;
import br.atos.crud_zoologico.model.Jaula;
import br.atos.crud_zoologico.repository.CuidadorRepository;
import br.atos.crud_zoologico.repository.JaulaRepository;

@Controller
public class JaulaController {

	@Autowired
	JaulaRepository jaulaRepository;
	
	@Autowired
	CuidadorRepository cuidadorRepository;
	
	@RequestMapping(value = "/cadastrarJaula", method = RequestMethod.GET)
	public ModelAndView cadastroJaula() {
		ModelAndView cuidadorModelAndView = new ModelAndView("jaula/cadastroJaula");
		Iterable<Cuidador> listaCuidadores = cuidadorRepository.findAll();
		cuidadorModelAndView.addObject("listaCuidadores",listaCuidadores);
		return cuidadorModelAndView;
	}
	
	@RequestMapping(value = "/cadastrarJaula", method = RequestMethod.POST)
	public String cadastroJaula(Jaula jaula) {
		
		jaulaRepository.save(jaula);
		return "redirect:/listarJaula";
	}
	
	@RequestMapping("/listarJaula")
	public ModelAndView listarJaula() {
		
		ModelAndView jaulaModelAndView = new ModelAndView("jaula/listarJaula");
		Iterable<Jaula> jaulaLista = jaulaRepository.findAll();
		jaulaModelAndView.addObject("jaulas",jaulaLista);
		return jaulaModelAndView;
	}
	
	@RequestMapping(value = "/deletarJaula/{id}", method = RequestMethod.GET)
	public String deletarJaula(@PathVariable("id") long idReq) {
		
		jaulaRepository.deleteById(idReq);
		return "redirect:/listarJaula";
	}
	
	@RequestMapping(value = "/editarJaula/{id}", method = RequestMethod.GET)
	public ModelAndView editarJaula(@PathVariable("id") long idReq) {
		
		Jaula jaula = jaulaRepository.findById(idReq);
		ModelAndView jaulaModelAndView = new ModelAndView("jaula/editarJaula");
		jaulaModelAndView.addObject("jaulas", jaula);
		return jaulaModelAndView;
	}
	
	@PostMapping(value = "/atualizarJaula")
	public String atualizarJaula(Jaula jaula) {
		
	//	long idJaula = jaula.getIdJaula();
		jaulaRepository.save(jaula);
		
		return "redirect:/listarJaula";
	}
}
