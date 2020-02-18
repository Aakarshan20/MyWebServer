
public class MyWebServer{
	public static void main(String args[]){
		ServerSocket ss = new ServerSocket(9999);
		Socker s = ss.accept();
		//提示一句話
		System.out.println("在9999上等待連接")
		OutputStream os = s.getOutPutStream();
		BufferedReader bfr = new BufferedReader(new FileReader("D:"))
		
		
	}
}