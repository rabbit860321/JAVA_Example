package cc.openhome;

class Mazemap {
	int[][] maze;
	Point end;
	
	Mazemap(int[][] maze,Point end){  
		this.maze = maze;
		this.end = end;
	}
	
	boolean isArrived() {           //檢測是否到終點
		return maze[end.x][end.y] == 1;
	}
	boolean isEmpty(Point p) {      //檢測是否是道路
		return maze[p.x][p.y] == 0;
	}
	void step(Point p) {            //走過的點
		maze[p.x][p.y] = 1;
	}
	void empty(Point p) {
		maze[p.x][p.y] = 0;
	}
	void print() {
		for(int i=0;i<maze.length;i++) {
			for(int j = 0;j<maze[0].length;j++) {
				if(maze[i][j] == 2) {
					System.out.print("█");
				}else if(maze[i][j] == 0) {
					System.out.print(" ");
				}else if(maze[i][j] == 1) {
					System.out.print("X");
				}
			}
			System.out.println();
		}
    }
}
class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}
class Mouse{
	void go(Mazemap maze,Point p) {
		maze.step(p);             //該點設為1
		test(maze,new Point(p.x,p.y +1));  
		test(maze,new Point(p.x+1,p.y));
		test(maze,new Point(p.x,p.y-1));
		test(maze,new Point(p.x-1,p.y));
		if(!maze.isArrived()) {
			maze.empty(p);
		}
	}
	void test(Mazemap maze,Point p) {
		if(!maze.isArrived() && maze.isEmpty(p)) {  //若還沒終點AND該點為0
			go(maze,p);
		}
	}
}

public class Maze {

	public static void main(String[] args) {
		int[][] map = {
			{2, 2, 2, 2, 2, 2, 2},
            {0, 0, 0, 0, 0, 0, 2},
            {2, 0, 2, 0, 2, 0, 2},
            {2, 0, 0, 2, 0, 2, 2},
            {2, 2, 0, 2, 0, 2, 2},
            {2, 0, 0, 0, 0, 0, 2},
            {2, 2, 2, 2, 2, 0, 2}};
		Mazemap mazeobj = new Mazemap(map,new Point(6,5));	
		Mouse mouseobj = new Mouse();
		mouseobj.go(mazeobj, new Point(1,0));
		if(!mazeobj.isArrived()) {
			System.out.println("沒找到出口");
		}
		mazeobj.print();
	}
}
