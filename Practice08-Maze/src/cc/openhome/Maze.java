package cc.openhome;

class Mazemap {
	int[][] maze;
	Point end;
	
	Mazemap(int[][] maze,Point end){  
		this.maze = maze;
		this.end = end;
	}
	
	boolean isArrived() {           //�˴��O�_����I
		return maze[end.x][end.y] == 1;
	}
	boolean isEmpty(Point p) {      //�˴��O�_�O�D��
		return maze[p.x][p.y] == 0;
	}
	void step(Point p) {            //���L���I
		maze[p.x][p.y] = 1;
	}
	void empty(Point p) {
		maze[p.x][p.y] = 0;
	}
	void print() {
		for(int i=0;i<maze.length;i++) {
			for(int j = 0;j<maze[0].length;j++) {
				if(maze[i][j] == 2) {
					System.out.print("�i");
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
		maze.step(p);             //���I�]��1
		test(maze,new Point(p.x,p.y +1));  
		test(maze,new Point(p.x+1,p.y));
		test(maze,new Point(p.x,p.y-1));
		test(maze,new Point(p.x-1,p.y));
		if(!maze.isArrived()) {
			maze.empty(p);
		}
	}
	void test(Mazemap maze,Point p) {
		if(!maze.isArrived() && maze.isEmpty(p)) {  //�Y�٨S���IAND���I��0
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
			System.out.println("�S���X�f");
		}
		mazeobj.print();
	}
}
