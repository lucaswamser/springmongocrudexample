package app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import app.modelo.Livro;
import app.service.LivroServiceImpl;

@Controller
@RequestMapping(path="Livro")
public class LivroController {

	@Autowired
	private LivroServiceImpl service;
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public ModelAndView listar(){
		ModelAndView view = new ModelAndView("Livro/List");
		view.addObject("livros", service.listar());
		return(view);
	}
	
	@RequestMapping(path="Adicionar",method=RequestMethod.GET)
	public ModelAndView adicionar(){
		ModelAndView view = new ModelAndView("Livro/Form");
		view.addObject("livro", new Livro());
		return (view);
	}
	
	@RequestMapping(path="Adicionar",method=RequestMethod.POST)
	public String adicionar(@Valid Livro livro,BindingResult result){
		if (result.hasErrors())
			return "Livro/Form";
		livro.setId(null);
		service.adicionar(livro);
		return "redirect:/Livro/";
	}
	
	@RequestMapping(path="Editar/{id}", method=RequestMethod.GET)
	public ModelAndView editar(@PathVariable("id") String id){
		ModelAndView view = new ModelAndView("Livro/Form");
		view.addObject("livro", service.carregar(id));
		return view;
	}
	
	@RequestMapping(path="Editar/{id}",method=RequestMethod.POST)
	public String editar(@Valid Livro livro, BindingResult result){
		if (result.hasErrors())
			return "Livro/Form";
		service.atualizar(livro);
		return "redirect:/Livro/";
	}
	
	@RequestMapping(path="Excluir/{id}",method=RequestMethod.GET)
	public String excluir (@PathVariable("id") String id){
		service.remover(id);
		return "redirect:/Livro/";
		
	}
}
