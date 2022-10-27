package java_Programs2;

public class WatsappDriverSpecilization {

	public static void main(String[] args) 
	{
		WatsappV4 wv4 = new WatsappV4();
		wv4.status();
		wv4.chat();
		wv4.audiocall();
		wv4.videocall();
		
		WatsappV3 wv3 = new WatsappV3();
		wv3.chat();
		wv3.audiocall();
		wv3.videocall();
		//wv3.status();
		
		WatsappV2 wv2 = new WatsappV2();
		wv2.chat();
		wv2.audiocall();
		//wv2.videocall();
		//wv2.status();
		
		WatsappV1 wv1 = new WatsappV1();
		wv1.chat();
		//wv1.audiocall();
		//wv1.videocall();
		//wv1.status();
	

	}

}
class WatsappV1
{
	public void chat()
	{
		System.out.println("He user u can start texting.....");
	}
}
class WatsappV2 extends WatsappV1
{
	public void audiocall()
	{
		System.out.println("Hey user u can start making audio callss....");
	}
	
}
class WatsappV3 extends WatsappV2
{
	public void videocall()
	{
		System.out.println("Hey user u cal start your face to face time");
	}
}
class WatsappV4 extends WatsappV3
{
	public void status()
	{
		System.out.println("Start uploading ur status......");
	}
}
