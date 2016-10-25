package entity;

//指针类，用来实例化已分配文件表中的读指针和写指针
public class Pointer {
	private int BlockNum;          //块号
	private int BlockAddress;	   //块内地址，指的是盘块内的第几个字节
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
