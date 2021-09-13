class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double a = distance(points[i], points[j]);
                    double b = distance(points[i], points[k]);
                    double c = distance(points[j], points[k]);

                    double p = (a + b + c) / 2;
                    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    if (area > max) max = area;
                }
            }
        }
        return max;
    }

    public double distance(int[] a, int[] b) {
        double x = a[0] - b[0];
        double y = a[1] - b[1];
        return Math.sqrt(x * x + y * y);
    }
}