import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private List<String> tasks;
    private List<Boolean> taskStatus;

    public ToDoList() {
        this.tasks = new ArrayList<>();
        this.taskStatus = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        taskStatus.add(false);
    }

    public void deleteTask(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            taskStatus.remove(taskNumber - 1);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void markTaskAsCompleted(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            taskStatus.set(taskNumber - 1, true);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            String status = taskStatus.get(i)? "[X]" : "[ ]";
            System.out.println((i + 1) + ". " + status + " " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. Mark task as completed");
            System.out.println("4. Display tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    input.nextLine(); // Consume newline left-over
                    String task = input.nextLine();
                    todoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task number to delete: ");
                    int taskNumberToDelete = input.nextInt();
                    todoList.deleteTask(taskNumberToDelete);
                    break;
                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumberToMark = input.nextInt();
                    todoList.markTaskAsCompleted(taskNumberToMark);
                    break;
                case 4:
                    todoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice!= 5);

        input.close();
    }
}
