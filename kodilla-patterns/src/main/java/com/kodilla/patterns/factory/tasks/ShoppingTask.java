package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskname;
    final String whatToBuy;
    final double quantity;
    boolean taskExecute = false;

    public ShoppingTask(String taskname, String whatToBuy, double quantity) {
        this.taskname = taskname;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskname;
    }

    @Override
    public void executeTask() {
        System.out.println("Task is executed, bought: " + whatToBuy + " for " + quantity);
        taskExecute = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecute;
    }
}
