package groupassignment_2.question1.service;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConstructionService {

    public void processOfSkyscraper(Queue<Integer> queue, int totalNoOfFloors) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());  // store the data in sorted manner (Descending)

        int max = totalNoOfFloors;

        System.out.println("The order of construction is as follows \n");

        for(int i = 0; i < totalNoOfFloors; i++) {
            System.out.println("Day: " + (i + 1));
            priorityQueue.add(queue.poll());

            while(priorityQueue.isEmpty() == false && priorityQueue.peek() == max) {   // here we check queue is empty or not and top of the element in PQ is equal to the max
                System.out.print(priorityQueue.poll() + " ");
                max = max - 1;
            }

            System.out.println();
        }
    }
}
