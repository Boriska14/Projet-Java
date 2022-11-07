package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import contract.IMap;
import entity.Butterfly;
import entity.Diamond;
import entity.Element;
import entity.Ground;
import entity.Rock;
import entity.Wall;

public class Map implements IMap{
	
	private Element table[][];
	private int width = 40;
	private int height = 30;
	private  String levelFolder = "level/Level1.txt";
	public Map() throws IOException {
		this.getMap();
	}
	
	public Element[][] getTable() {
		return table;
	}

	public void setTable(Element[][] table) {
		this.table = table;
	}

	public Element getElement(int x,int y) {
		return table[x][y];
	} 
	
	public void setElement(int x,int y,Element element) {
		table[x][y] = element;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public void getMap() throws IOException {
	
		
		
		File file = new File(levelFolder);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		this.width = Integer.valueOf(br.readLine());
		this.height = Integer.valueOf(br.readLine());
		
		table = new Element[width][height];
		
		for (int i=0;i<height;i++) {
			for (int j=0; j<width; j++) {
				char ch = (char)br.read();
				
				switch(ch) {
				case 'B':
					table[j][i]= new Ground();
					break;
				case 'D':
					table[j][i]= new Diamond();
					break;
				case 'E':
					table[j][i]= new Butterfly();
					break;
				case 'U':
					table[j][i]= new Wall();
					break;
				case 'R':
					table[j][i]= new Rock();
					break;
				default:
					table[j][i]= new Ground();
					break;
				}
			}
		}
		
		
		
		
		/*String line1;
		while((line1 = buffRead1.readLine())!=null);
		Integer liner1 = Integer.valueOf(line1);
		this.height=liner1; 
		
		
		
		
		for (int i=0;i<width;i++) {
			for (int j=0;i<height;i++) {
				table = new Element[i][j];
			}
		}
		
		
			
		}*/
	}

	
	private FileReader FileReader() {
		// TODO Auto-generated method stub
		return null;
	}

	private BufferedReader BufferedReader(FileReader fr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}

