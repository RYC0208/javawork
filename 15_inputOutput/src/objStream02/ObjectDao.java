package objStream02;

import java.io.*;
import java.io.FileOutputStream;


public class ObjectDao {
	//기반스트림 :FileOutputStream	사용 // 1byte
	//보조스트림 :ObjectOutputStream 사용 // 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림
	//ObjectWriter없음 
	public void filesave() {
		Phone ph1 = new Phone("아이폰15", 1400000);
		Phone ph2 = new Phone("갤럭시S23", 1300000);
		Phone ph3 = new Phone("롤리팝", 4300000);

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			
		} catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			//EOFException: 파일의 끝을 만나는 순간 예외 발생
			/*System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());*/
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(EOFException e ) {    //IOException 전에 처리해야 함.
			System.out.println("파일을 끝가지 다 읽었음");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
