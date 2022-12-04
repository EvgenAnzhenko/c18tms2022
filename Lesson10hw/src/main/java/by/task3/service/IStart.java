package by.task3.service;

public interface IStart {
    boolean checkSystem() throws InterruptedException;

    void engineStart() throws InterruptedException;

    void start();
}
