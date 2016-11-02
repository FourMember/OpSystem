package util;
//转换工具类
public class Transform {
	
	//字符转成字节数组
	public static byte[] StringToByte(String s){
		byte[] bytes = s.getBytes();
		return bytes;
	}
	
	//字节数组转成字符串
	public static String ByteToString(byte[] bytes){
		String s = new String(bytes);
		return s;
	}
//	//当然还有可以设定编码方式
//	String str = "hello";
//	byte[] srtbyte = null;
//	try {
//		srtbyte = str.getBytes("UTF-8");
//		String res = new String(srtbyte,"UTF-8");
//		System.out.println(res);
//	    } catch (UnsupportedEncodingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	    }
}
