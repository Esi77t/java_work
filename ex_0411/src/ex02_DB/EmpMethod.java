package ex02_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	public static List<Emp> find(String job) {
		List<Emp> list = new ArrayList<>();
		
		// EMP 테이블에서 사원번호, 이름, 직종, 급여를 조회해서 하나의 행을 EMP 객체에 넣은 후
		// 그 객체들을 ArrayList에 담아서 반환하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT empno, ename, job, sal FROM emp WHERE job = ?";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			// 첫번째 물음표 자리에 매개변수로 들어온 job값으로 채워라
			pstmt.setString(1, job);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Emp e = new Emp();
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSalary(rs.getInt("sal"));
				
				list.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
}
