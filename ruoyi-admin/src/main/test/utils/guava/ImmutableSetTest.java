package utils.guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.sun.jmx.remote.internal.ArrayQueue;
import org.apache.commons.collections4.multiset.HashMultiSet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.*;

public class ImmutableSetTest {
    public static void main(String[] args) {
        ImmutableSet<Integer> integerImmutableSet = ImmutableSet.of(1, 2, 3, 4, 5, 6);
        ImmutableList<Integer> integers = integerImmutableSet.asList();
        ArrayList<Object> newArrayListWithCapacity = Lists.newArrayListWithCapacity(10);

        LinkedBlockingDeque linkedBlockingDeque;
        ArrayBlockingQueue arrayBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue;
        PriorityBlockingQueue priorityBlockingQueue;
    }
}
