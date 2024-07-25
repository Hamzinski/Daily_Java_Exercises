package com.hamz.exercises;

import java.util.LinkedList;
import java.util.Queue;

public class MazeSolver {
    static class Point {
        int x, y, dist;

        public Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    // Hareket edilebilecek dört yön: yukarı, aşağı, sol, sağ
    private static final int[] rowDir = {-1, 1, 0, 0};
    private static final int[] colDir = {0, 0, -1, 1};

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 1, 0, 1, 1},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 1, 1}
        };

        int startX = 0, startY = 0; // Başlangıç noktası
        int endX = 4, endY = 4;     // Bitiş noktası

        int shortestPathLength = findShortestPath(maze, startX, startY, endX, endY);

        if (shortestPathLength != -1) {
            System.out.println("Shortest path length is " + shortestPathLength);
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    public static int findShortestPath(int[][] maze, int startX, int startY, int endX, int endY) {
        if (maze[startX][startY] == 0 || maze[endX][endY] == 0) {
            return -1;
        }

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            if (point.x == endX && point.y == endY) {
                return point.dist;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = point.x + rowDir[i];
                int newCol = point.y + colDir[i];

                if (isValid(newRow, newCol, maze, visited)) {
                    visited[newRow][newCol] = true;
                    queue.add(new Point(newRow, newCol, point.dist + 1));
                }
            }
        }

        return -1;
    }

    private static boolean isValid(int x, int y, int[][] maze, boolean[][] visited) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length &&
                maze[x][y] == 1 && !visited[x][y]);
    }
}
