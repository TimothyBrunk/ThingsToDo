package data;

import java.util.ArrayList;

public interface ListDAO {
	public ArrayList<ToDo> getFullList(String priority);
	public ToDo getTask(String task); 
	public ToDo getDeadline(String deadline); 
	public ArrayList<ToDo>  getPriority(String priority); 
	public void addTask (ToDo toDo); 
	public ToDo editTask (ToDo task);
	public ToDo update (ToDo toDo); 
	public ToDo getTaskById (int id); 
	public void deleteTask(int id); 
	public void addBookToFile(ToDo a); 

}
