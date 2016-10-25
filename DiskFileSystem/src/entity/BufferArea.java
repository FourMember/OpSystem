package entity;

public class BufferArea {
	public int BufferSize;
	public char[] Buffer;
	public BufferArea(){
		this.BufferSize = 512;
		this.Buffer = new char[BufferSize];
	}
	public BufferArea(int size){
		this.BufferSize = size;
		this.Buffer = new char[BufferSize];
	}
}
