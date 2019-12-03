package com.steven.search_sort.other;
import java.awt.*;
import java.util.HashMap;
/*
我们通过枚举法暴力枚举节点i，使得当前所有直线必须经过点i，然后在所有经过点i的直线上找到有最多点的直线，对于每一个直线我们
用hash存一下上面的点数，这样我们可以少一层循环。
 */


public class Maxpoint {

    static int[][] points= new int[][]{{0,65535},{1,1},{0,65535},{1,1}};
    static int  n, horisontal_lines;
    static HashMap<Double, Integer> lines = new HashMap<Double, Integer>();
    public static void main(String[] args){
        int result = maxPoints(points);
        System.out.println("The max point is:"+result);

    }
    public static int maxPoints(int[][] points) {
        n = points.length;
        if (n < 3) return n;

        int max_count = 1;
        /*This is compare time, n个点比较n-1次。
         */
        for (int i = 0; i < n - 1; i++)
            max_count = Math.max(max_online_point(i), max_count);

        return max_count;
    }

    private static int max_online_point(int i) {
        lines.clear();
        horisontal_lines = 1;//水平线

        int count = 1;//自己为1个点
        int duplicates = 0;//重合点

        for (int j = i + 1; j < n; j++) {
            Point p = add_line(i, j, count, duplicates);
            count = p.x;
            duplicates = p.y;
        }

        return count + duplicates;
    }

    private static Point add_line(int i, int j, int count, int duplicates) {
        int x1 = points[i][0];
        int y1 = points[i][1];
        int x2 = points[j][0];
        int y2 = points[j][1];

        if (x1 == x2 && y1 == y2)
            duplicates++;
        else if (y1 == y2) {
            horisontal_lines++;
            count = Math.max(count, horisontal_lines);
        } else {
            double slope = 1.0 * (x1 - x2) / (y1 - y2) + 0.0;
            lines.put(slope, lines.getOrDefault(slope, 1) + 1);
            count = Math.max(count, lines.get(slope));

        }

        return new Point(count, duplicates);
    }
}