package entity;

public class FileTableFAT {
	public int FATSize;
	public int[] FAT;
	public FileTableFAT(){
		FATSize = 128;
		FAT = new int[FATSize];
	}
	public FileTableFAT(int size){
		FATSize = size;
		FAT = new int[FATSize];
	}
}
