package ex02_DB;

import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		List<Person> list = PersonMethod.find();

		for (Person lists : list) {
			System.out.printf("ID : %d, 이름 : %s, 나이 : %d\n", lists.getIdx(), lists.getName(), lists.getAge());
		}

//		PersonMethod addPerson = new PersonMethod();
//		addPerson.add(8, "김길동", 32);
	}
}
