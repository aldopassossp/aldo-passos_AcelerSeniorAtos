package br.atos.crud_zoologico.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.atos.crud_zoologico.model.Animal;
import br.atos.crud_zoologico.model.Jaula;
import br.atos.crud_zoologico.repository.AnimalRepository;
import br.atos.crud_zoologico.repository.JaulaRepository;

@Controller
public class AnimalController {
	
	@Autowired
	AnimalRepository animalRepository;
	
	@Autowired
	JaulaRepository jaulaRepository;

//	@RequestMapping(value = "/cadastrarAnimal", method = RequestMethod.GET)
	@GetMapping(value = "/cadastrarAnimal")
	public ModelAndView cadastroAnimal() {
		ModelAndView jaulaModelAndView = new ModelAndView("animal/cadastroAnimal");
		Iterable<Jaula> listaJaulas = jaulaRepository.findAll();
		jaulaModelAndView.addObject("listaJaulas",listaJaulas);
		return jaulaModelAndView;
	}
	
//	@RequestMapping(value = "/cadastrarAnimal", method = RequestMethod.POST)
	@PostMapping(value = "/cadastrarAnimal")
	public String cadastroAnimal(Animal animal) {
		
		animalRepository.save(animal);
		return "redirect:/listarAnimal";
	}
	
	@RequestMapping("/listarAnimal")
	public ModelAndView listarAnimal() {
		
		ModelAndView animalModelAndView = new ModelAndView("animal/listarAnimal");
		Iterable<Animal> animalLista = animalRepository.findAll();
		animalModelAndView.addObject("animais",animalLista);
		return animalModelAndView;
	}
	
	@RequestMapping(value = "/deletarAnimal/{id}", method = RequestMethod.GET)
	public String deletarAnimal(@PathVariable("id") long idReq) {
		
		animalRepository.deleteById(idReq);
		return "redirect:/listarAnimal";
	}
	
	@RequestMapping(value = "/editarAnimal/{id}", method = RequestMethod.GET)
	public ModelAndView editarAnimal(@PathVariable("id") long idReq) {
		
		Animal animal = animalRepository.findById(idReq);
		ModelAndView animalModelAndView = new ModelAndView("animal/editarAnimal");
		animalModelAndView.addObject("animais", animal);
		return animalModelAndView;
	}
	
	@PostMapping(value = "/atualizarAnimal")
	public String atualizarAnimal(Animal animal) {
		
	//	long idAnimal = animal.getIdAnimal();
		animalRepository.save(animal);
		
		return "redirect:/listarAnimal";
	}
}
