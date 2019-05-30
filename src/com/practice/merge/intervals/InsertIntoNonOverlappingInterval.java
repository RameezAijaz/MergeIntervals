package com.practice.merge.intervals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class InsertIntoNonOverlappingInterval {

    public static List<Interval> insertInterval(List<Interval> intervals, Interval interval){

        List<Interval> mergedIntervals = new ArrayList<>();

        Iterator<Interval> intervalIterator = intervals.iterator();
        int start = interval.start, end = interval.end;

        while (intervalIterator.hasNext()){
            Interval next = intervalIterator.next();
            if(next.end<interval.start){
                mergedIntervals.add(next);
                continue;
            }
            if(next.start<=end){
                end = Math.max(end, next.end);
            }
            else {
                mergedIntervals.add(new Interval(start, end));
                start = next.start;
                end = next.end;
            }
        }
        mergedIntervals.add(new Interval(start, end));
        return mergedIntervals;
    }
}
