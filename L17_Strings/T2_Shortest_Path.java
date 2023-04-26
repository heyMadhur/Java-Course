package L17_Strings;

public class T2_Shortest_Path {

    public static void findShortestPath(String str){
        str= str.toUpperCase();
        int x=0,y=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='N') y++;
            else if(str.charAt(i)=='S') y--;
            else if(str.charAt(i)=='E') x++;
            else if(str.charAt(i)=='W') x--;    
        }

        double shortestDistance=Math.sqrt(x*x+y*y);

        System.out.println("Shortest Distance= "+shortestDistance);

    }

    public static void main(String[] args) {

        // String path= "WNEENESENNN";
        String path= "NSEW";
        findShortestPath(path);
        
    }
}
