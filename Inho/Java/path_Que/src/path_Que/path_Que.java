package path_Que;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class path_Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int map[][] = { {0, 0, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {0, 1, 0, 0}};
		 */
		
		Scanner s = new Scanner(System.in);
		try {
			// 파일 읽는 방법
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File("src/path.txt"))));

			// y = 행, x = 열
			int y = 0, x = 0;
			String[] xy = br.readLine().split(" "); // 한 줄을 읽되, 공백으로 string을 자른다. ex) 8 8 일 경우 [0]=8 [1]=8
			y = Integer.parseInt(xy[0]);
			x = Integer.parseInt(xy[1]);

			String[][] map = new String[x][y];
			for (int i = 0; i < y; i++) {
				String line = br.readLine();
				String[] pixel = line.split(" ");
				for (int j = 0; j < x; j++) {
					map[i][j] = pixel[j];
				}
			}
			printMap(map);

		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

	public static void printMap(String[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean hasRoute(String[][] map, int y, int x) {
		
		
		return true;
	}
	
	

}
