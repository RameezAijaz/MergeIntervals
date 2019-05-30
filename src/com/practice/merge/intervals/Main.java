package com.practice.merge.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*
        Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive intervals.

        Example 1:

        Intervals: [[1,4], [2,5], [7,9]]
        Output: [[1,5], [7,9]]
        Explanation: Since the first two intervals [1,4] and [2,5] overlap, we merged them into one [1,5].

        */

        List<Interval> intervalsList = new ArrayList<>();
        intervalsList.add(new Interval(1,4));
        intervalsList.add(new Interval(2,5));
        intervalsList.add(new Interval(7,9));

        List<Interval> mutuallyExclusiveList = MergeOverlappingIntervals.merge(intervalsList);
        System.out.println("MERGED LIST OF MUTUALLY EXCLUSIVE INTERVALS IN");
        for(Interval i:intervalsList)
         System.out.print("["+i.start+","+i.end+"] ");

        System.out.println();
        for(Interval i:mutuallyExclusiveList)
            System.out.print("["+i.start+","+i.end+"] ");
        System.out.println();

/*
        Given a list of non-overlapping intervals sorted by their start time, insert a given interval at the correct position and merge all necessary intervals to produce a list that has only mutually exclusive intervals.

        Example 1:

        Input: Intervals=[[1,3], [5,7], [8,12]], New Interval=[4,6]
        Output: [[1,3], [4,7], [8,12]]
        Explanation: After insertion, since [4,6] overlaps with [5,7], we merged them into one [4,7].
        Input: Intervals=[[1,3], [5,7], [8,12]], New Interval=[4,6]
        Output: [[1,3], [4,7], [8,12]]
        Explanation: After insertion, since [4,6] overlaps with [5,7], we merged them into one [4,7].


        */


        intervalsList = new ArrayList<>();
        intervalsList.add(new Interval(1,3));
        intervalsList.add(new Interval(5,7));
        intervalsList.add(new Interval(8,12));

        Interval intervalToInsert = new Interval(4,6);



        System.out.println("INSERT [4,6] INTO LIST OF NON-OVERLAPPING INTERVALS");
        mutuallyExclusiveList = InsertIntoNonOverlappingInterval.insertInterval(intervalsList, intervalToInsert);
        for(Interval i:intervalsList)
            System.out.print("["+i.start+","+i.end+"] ");
        System.out.println();
        for(Interval i:mutuallyExclusiveList)
            System.out.print("["+i.start+","+i.end+"] ");
        System.out.println();

/*
        Given two lists of intervals, find the intersection of these two lists. Each list consists of disjoint intervals sorted on their start time.

                Example 1:

        Input: arr1=[[1, 3], [5, 6], [7, 9]], arr2=[2, 3], [5, 7]
        Output: [2, 3], [5, 6], [7, 7]
        Explanation: The output list contains the common intervals between the two lists.
                Input: arr1=[[1, 3], [5, 6], [7, 9]], arr2=[2, 3], [5, 7]
        Output: [2, 3], [5, 6], [7, 7]
        Explanation: The output list contains the common intervals between the two lists.

        */

        List<Interval> intervalsList1 = new ArrayList<Interval>();
        intervalsList1.add(new Interval(1,3));
        intervalsList1.add(new Interval(5,6));
        intervalsList1.add(new Interval(7,9));

        List<Interval> intervalsList2 = new ArrayList<Interval>();
        intervalsList2.add(new Interval(2,3));
        intervalsList2.add(new Interval(5,7));

        List<Interval> intersectionList = IntersectionOfSortedListOfNonOverlappingIntervals.intersection(intervalsList1, intervalsList2);

        System.out.println("INTERSECTION OF ");
        for(Interval i:intervalsList1)
            System.out.print("["+i.start+","+i.end+"] ");
        System.out.println("and");
        for(Interval i:intervalsList2)
            System.out.print("["+i.start+","+i.end+"] ");
        System.out.println();
        for(Interval i:intersectionList)
            System.out.print("["+i.start+","+i.end+"] ");
        System.out.println();
    }
}
