package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.ListDAO;
import data.ToDo;

@Controller
public class DoController {
	@Autowired
	private ListDAO listDao; 
    //@Autowired    // Un-comment this section if using Autowiring.
    //private ClassYouWant object;
    
	@RequestMapping(path="GetList.do",method=RequestMethod.GET)
	public ModelAndView getPriority(@RequestParam("priority") String p) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list.jsp");
		mv.addObject("list", listDao.getPriority(p));
		return mv;
		
	}
	@RequestMapping(path="AddTask.do", method=RequestMethod.POST)
	public ModelAndView addTask(ToDo toDo) {
		listDao.addTask(toDo);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.html"); 
		return mv; 
	}
	@RequestMapping(path="EditTask.do", method=RequestMethod.GET)
	public ModelAndView editTask(ToDo toDo) {
//		ToDo t; 
//		t = listDao.getTaskByID(toDo); 
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("edit.jsp"); 
		mv.setViewName("index.html"); 
		mv.addObject("list", listDao.update(toDo));
		return mv; 
	}
	@RequestMapping(path="toEditPage.do", method=RequestMethod.GET)
	public ModelAndView toEditPage(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("edit.jsp"); 
		mv.addObject("entry", listDao.getTaskById(id) );
		return mv; 
	}
	@RequestMapping(path="toDeleteTask.do")
	public ModelAndView toDeleteTask(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();
		listDao.deleteTask(id);
		mv.setViewName("index.html"); 
		return mv; 
	}
	@RequestMapping(path="FullList.do", method=RequestMethod.GET)
	public ModelAndView getFullList(@RequestParam("priority") String a) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("fulllist.jsp"); 
		mv.addObject("list", listDao.getFullList(a));
		return mv; 
	}
	
	
	}

