package com.cybertek.singletonPatterns;

public interface Cache<F,S> {

    void put(F key, S value);
    S get(F key);
}
