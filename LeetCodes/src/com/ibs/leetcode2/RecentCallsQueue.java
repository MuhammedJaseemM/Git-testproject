package com.ibs.leetcode2;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCallsQueue {

    Queue<Integer> q = new LinkedList<>();
    public void RecentCounter() {
        q = new LinkedList<>();
        
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000){
            q.poll();
        }
        return q.size();
    }

}
