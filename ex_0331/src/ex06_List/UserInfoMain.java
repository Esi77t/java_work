package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

// Main클래스에서 유저의 정보를 ArrayList에 추가하여 출력
public class UserInfoMain {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        outer:while(true) {
            UserInfo ui = new UserInfo();
            System.out.print("아이디 생성 : ");
            ui.setUserID(sc.next());

            for(int i = 0; i < userInfo.size(); i++) {
                if(ui.getUserID().equals(userInfo.get(i).getUserID())) {
                    System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
                    continue outer;
                }
            }

            System.out.print("패스워드 입력 : ");
            ui.setPassword(sc.nextInt());

            userInfo.add(ui);

            for(int i = 0; i < userInfo.size(); i++) {
                System.out.println(userInfo.get(i).getUserID());
                System.out.println(userInfo.get(i).getPassword());
                System.out.println("-------------------------------");
            }
        }
    }
}
