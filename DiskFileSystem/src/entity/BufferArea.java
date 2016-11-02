package entity;

//import java.io.FileOutputStream;
//缓冲区类
public class BufferArea {
	public int BufferSize;
//	public char[] Buffer;
	public byte[] Buffer;
	public BufferArea(){
		this.BufferSize = 64;
//		this.Buffer = new char[BufferSize];
		this.Buffer = new byte[BufferSize];
	}
	public BufferArea(int size){
		this.BufferSize = size;
//		this.Buffer = new char[BufferSize];
		this.Buffer = new byte[BufferSize];
	}
//字节数组内容写到文件例子
//	byte[] bs;
//	FileOutputStream fos = new FileOutputStream(file);
//	fos.write(bs);
//	fos.flush();
//	fos.close();
}
