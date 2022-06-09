package com.cybertek.singletonPatterns;

import java.util.HashMap;

public class LazyCache implements Cache{

    private static LazyCache instance;

    private HashMap<Object, Object> map;

    public LazyCache() {
        this.map = new HashMap<>();
    }

    @Override
    public void put(Object key, Object value) {
        this.map = new HashMap<>();
    }

    @Override
    public Object get(Object key) {
        return this.map.get(key);
    }

    public static LazyCache getInstance(){

        if (instance == null){
            instance = new LazyCache();
        }
        return instance;
    }
}
