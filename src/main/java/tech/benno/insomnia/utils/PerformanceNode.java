package tech.benno.insomnia.utils;

import java.util.HashMap;

public class PerformanceNode {

    public static HashMap<String, Long> timings = new HashMap<String, Long>();

    public static void start(String psw) {
        timings.put(psw, System.currentTimeMillis());
    }

    public static Long calc(String psw) {
        Long timing = System.currentTimeMillis() - timings.get(psw);
        timings.remove(psw);

        return timing;
    }
    
    public static Long check(String psw) {
        return System.currentTimeMillis() - timings.get(psw);
    }
}