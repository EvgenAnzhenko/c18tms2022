package ru.tms.service;

@FunctionalInterface
public interface IValue<T> {
    T GetValue(T a);
}
