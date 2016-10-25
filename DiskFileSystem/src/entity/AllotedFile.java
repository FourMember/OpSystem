package entity;

//该类的对象表示已分配文件，已分配文件表用List<AlloteFile>泛型来实现
public class AllotedFile {
	private String FilePath;      
	private char Attribute;
	private int firstBlock;
	private int FileLength;
	private int Flag;
	private Pointer ReadPointer;
	private Pointer WritePointer;
	public String getFilePath() {
		return FilePath;
	}
	public void setFilePath(String filePath) {
		FilePath = filePath;
	}
	public char getAttribute() {
		return Attribute;
	}
	public void setAttribute(char attribute) {
		Attribute = attribute;
	}
	public int getFirstBlock() {
		return firstBlock;
	}
	public void setFirstBlock(int firstBlock) {
		this.firstBlock = firstBlock;
	}
	public int getFileLength() {
		return FileLength;
	}
	public void setFileLength(int fileLength) {
		FileLength = fileLength;
	}
	public int getFlag() {
		return Flag;
	}
	public void setFlag(int flag) {
		Flag = flag;
	}
	public Pointer getReadPointer() {
		return ReadPointer;
	}
	public void setReadPointer(Pointer readPointer) {
		ReadPointer = readPointer;
	}
	public Pointer getWritePointer() {
		return WritePointer;
	}
	public void setWritePointer(Pointer writePointer) {
		WritePointer = writePointer;
	}
}
