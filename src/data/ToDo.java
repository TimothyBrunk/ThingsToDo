package data;

public class ToDo {
	private int	id;
	private String priority; 
	private String task;
	private String deadline;
	// No Arg Constructor 
	public ToDo () { 
		
	}
	//Constructor 
	public ToDo(int id, String priority, String task, String deadline) {
		super();
		this.id = id; 
		this.priority = priority;
		this.task = task;
		this.deadline = deadline;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	@Override
	public String toString() {
		return "ToDo [id = "+id+ "priority=" + priority + ", task=" + task + ", deadline=" + deadline + "]";
	}
	public Integer getId(Integer integer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
