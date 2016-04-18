package data;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class ListFileDAO implements ListDAO {
	private static final String FILE_NAME = "/WEB-INF/list.csv";
	private Map<Integer, ToDo> toDoMap = new HashMap<>();
	private Integer id; 
	/*
	 * Use Autowired to have Spring inject an instance of an ApplicationContext
	 * into this object after creation. We will use the ApplicationContext to
	 * retrieve an InputStream so we can read from a file.
	 */
	@Autowired
	private ApplicationContext ac;

	/*
	 * The @PostConstruct method is called by Spring after object creation and
	 * dependency injection
	 */
	@PostConstruct
	public void init() {
		// Retrieve an input stream from the application context
		// rather than directly from the file system
		try (InputStream is = ac.getResource(FILE_NAME).getInputStream();
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				int id = Integer.parseInt(tokens[0]);
				String priority = tokens[1];
				String task = tokens[2];
				String deadline = tokens[3];
				ToDo l = new ToDo(id, priority, task, deadline);
				System.out.println(l);
				toDoMap.put(id, l);
				

			}
//			for (Map.Entry<String, ToDo> entry : list.entrySet()){
//				System.out.println(entry.getValue().getPriority());
//				}
		} catch (Exception e) {
			System.err.println(e);
		}
		id = 8;
	}

//	private ToDo buildList(String line) {
//		String[] tokens = line.split(",");
//		String priority = tokens[0];
//		String objective = tokens[1];
//		String deadline = tokens[2];
//		return new ToDo(priority, objective, deadline);
//	}

	@Override
	public ArrayList<ToDo> getFullList(String priority) {
		ArrayList<ToDo> toDoList = new ArrayList<ToDo>();
		for(Map.Entry<Integer, ToDo> entry :toDoMap.entrySet()) { 
			System.out.println("test");
		System.out.println(entry.getValue().getPriority());
			toDoList.add(entry.getValue());
		}
		return toDoList; 
	}

	@Override
	public ArrayList<ToDo> getPriority(String priority) {
		ArrayList<ToDo> toDoList = new ArrayList<ToDo>();
		for (Map.Entry<Integer, ToDo> entry : toDoMap.entrySet()){
			System.out.println(entry.getValue().getPriority());
			if(entry.getValue().getPriority().equals(priority)){
				toDoList.add(entry.getValue());
			}
		}
		return toDoList; 
	}

	@Override
	public ToDo getTask(String task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ToDo getDeadline(String deadline) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addTask(ToDo toDo) { 
		toDo.setId(id++);
		toDoMap.put(toDo.getId(), toDo);
		
		
	}
	public ToDo editTask (ToDo task) { 
		toDoMap.put(id, task); 
		return task; 
	}
	
	@Override
	public ToDo update(ToDo toDo) {
		
		toDoMap.put(toDo.getId(), toDo);
		// TODO Auto-generated method stub
		return toDoMap.get(toDo.getId());
	}
	public ToDo getTaskById(int id) {
		// TODO Auto-generated method stub
		return toDoMap.get(id);
	}
	
	public void deleteTask(int id) {
		toDoMap.remove(id);  		
		
	}
	public void addTaskToFile(ToDo a) {
		try (FileWriter fw = new FileWriter(ac.getResource(FILE_NAME).getFile(), true);) {
			fw.write(a.getId() + "\n");
		} catch (Exception e) {
			System.err.println(e);
		}

	}


	@Override
	public void addBookToFile(ToDo a) {
		// TODO Auto-generated method stub
		
	}

	

	

	
}
// @Override
// public ToDo getObjective(String objective) {
// ToDo l = null;
// for (ToDo toDo : list) {
// l=toDo;
// }
// return l;
// }
// @Override
// public ToDo getDeadline(String deadline) {
// ToDo l = null;
// for (ToDo toDo : list) {
// l=toDo;
// }
// return l;
// }
// }
//
