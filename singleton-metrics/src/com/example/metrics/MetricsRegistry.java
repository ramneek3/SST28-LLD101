package com.example.metrics;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class MetricsRegistry implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static volatile MetricsRegistry INSTANCE;

    
    private final Map<String, Long> counters = new ConcurrentHashMap<>();

    private MetricsRegistry() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Instance already exists! Use getInstance() instead.");
        }
    }

    public static MetricsRegistry getInstance() {
        if (INSTANCE == null) {
            synchronized (MetricsRegistry.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MetricsRegistry();
                }
            }
        }
        return INSTANCE;
    }

    public void setCount(String key, long value) {
        counters.put(key, value);
    }

    public void increment(String key) {
        counters.compute(key, (k, v) -> (v == null) ? 1L : v + 1L);
    }

    public long getCount(String key) {
        return counters.getOrDefault(key, 0L);
    }

    public Map<String, Long> getAll() {
        return Collections.unmodifiableMap(new ConcurrentHashMap<>(counters));
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}