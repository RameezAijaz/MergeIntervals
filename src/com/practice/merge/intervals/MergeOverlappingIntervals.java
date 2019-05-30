package com.practice.merge.intervals;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MergeOverlappingIntervals {

    public static List<Interval> merge(List<Interval> intervals){


        List<Interval> mergedIntervals = new ArrayList<>();
        intervals.sort(Comparator.comparing((Interval interval)->interval.start));
        Iterator<Interval> intervalIterator = intervals.iterator();

        Interval interval = intervalIterator.next();
        int start = interval.start;
        int end = interval.end;

        while (intervalIterator.hasNext()){
            interval = intervalIterator.next();
            if(interval.start<end){

                if(interval.end>end)
                    end = interval.end;

            }
            else {
                mergedIntervals.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }


        }
        mergedIntervals.add(new Interval(start, end));

        return mergedIntervals;
    }
}
