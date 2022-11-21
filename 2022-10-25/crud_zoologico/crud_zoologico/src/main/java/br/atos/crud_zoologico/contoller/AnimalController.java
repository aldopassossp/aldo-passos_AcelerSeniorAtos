package br.atos.crud_zoologico.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.atos.crud_zoologico.model.Animal;
import br.atos.crud_zoologico.repository.AnimalRepository;

@Controller
public class AnimalController {
	
	@Autowired
	AnimalRepository animalRepository;

	@RequestMapping(value = "/cadastrarAnimal", method = RequestMethod.GET)
	public String cadastroAnimal() {
		
		return "animal/listarAnimal";
	}
	
	@RequestMapping(value = "/cadastrarAnimal", method = RequestMethod.POST)
	public String cadastroAnimal(Animal animal) {
		
		animalRepository.save(animal);
		return "animal/listarAnimal";
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
