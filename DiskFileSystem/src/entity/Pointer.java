package entity;

//ָ���࣬����ʵ�����ѷ����ļ����еĶ�ָ���дָ��
public class Pointer {
	private int BlockNum;          //���
	private int BlockAddress;	   //���ڵ�ַ��ָ�����̿��ڵĵڼ����ֽ�
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
