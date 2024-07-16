public class shortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path value from (0,0) is: "+getPath(path));
    }
    public static float getPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'S' -> y--;
                case 'N' -> y++;
                case 'W' -> x--;
                default -> x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }
}
