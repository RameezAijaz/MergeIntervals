package com.practice.merge.intervals;

import java.util.*;

public class IntersectionOfSortedListOfNonOverlappingIntervals {

    public static List<Interval> intersection(List<Interval> list1, List<Interval> list2){
       List<Interval> intersectionList = new LinkedList<>();
       int i=0, j=0;

       while(i<list1.size() && j<list2.size()){
           Interval next1 = list1.get(i);
           Interval next2 = list2.get(j);

           if((next1.start>=next2.start && next1.start<=next2.end)||
                   (next2.start>=next1.start && next2.start<=next1.end)){
               intersectionList.add(new Interval(Math.max(next1.start, next2.start), Math.min(next1.end, next2.end)));
           }

           if(next1.end<next2.end){
               i++;
           }
           else{
               j++;
           }

       }

       return intersectionList;

    }

  }
