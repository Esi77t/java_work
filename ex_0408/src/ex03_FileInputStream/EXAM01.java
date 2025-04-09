package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class EXAM01 {
    public static void main(String[] args) {
        // file.txt를 만들고 문장을 입력하고 저장을 한다
        // FileInputStream으로 읽어온 뒤, 회문인지 아닌지 검증하세요
        String path = "D:\\full_stack_osh\\3. JAVA\\file.txt";

        File f = new File(path);

        byte[] b_read = new byte[(int)f.length()];

        FileInputStream fis = null;

        if(f.exists()) {
            try {
                fis = new FileInputStream(f);
                fis.read(b_read);

                String str1 = new String(b_read);
                StringBuilder str2 = new StringBuilder(str1);
                
                str2.reverse();

                if(str1.equals(str2.toString())) {
                    System.out.println("회문입니다.");
                } else {
                    System.out.println("회문이 아닙니다.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if(fis != null) {
                        fis.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
