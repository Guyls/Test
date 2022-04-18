package priority;

public class MainPriority {

    public static void main(String[] args) {

        Thread min = new priority.PriorityThread(" min");
        Thread max = new priority.PriorityThread(" max");
        Thread norm = new priority.PriorityThread(" norm");
        Thread ave = new priority.PriorityThread(" ave");

        min.start();
        max.start();
        ave.start();
        norm.start();

    }



}