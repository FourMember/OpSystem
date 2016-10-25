package entity;

//指针类，用来实现已分配文件表中的读指针、写指针
public class Pointer {
	private int BlockNum;          //物理块号
	private int BlockAddress;	   //块内地址，指的是第几个字节
	public int getBlockNum() {
		return BlockNum;
	}
	public void setBlockNum(int blockNum) {
		BlockNum = blockNum;
	}
	public int getBlockAddress() {
		return BlockAddress;
	}
	public void setBlockAddress(int blockAddress) {
		BlockAddress = blockAddress;
	}
}
