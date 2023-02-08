package groupassignment_2.question1.driver;

import groupassignment_2.question1.service.ConstructionService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        ConstructionService constructionService = new ConstructionService();

        System.out.println("Enter the total no of floors in the building ");
        int totalNoOfFloors = in.nextInt();

        for(int i = 0; i < totalNoOfFloors; i++) {
            System.out.println("Enter the floor size given on day: " + (i + 1));
            queue.add(in.nextInt());
        }
        System.out.println();

        constructionService.processOfSkyscraper(queue, totalNoOfFloors);

    }
}
