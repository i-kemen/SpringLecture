package mybatis;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {
	private SqlSession sqlSession;

	public BoardDAO() {

	}

	public BoardDAO(SqlSession session) {
		this.sqlSession = session;
	}

	public void work() {
		// db에 sql 호출
//		insertNewPost();
//		selectAllPost();
//		selectByName();
//		selectByName2();
//		selectByNo3();
//		updateByName();
//		deleteByName();
		selectDSQL();
		
	}
	
//	public void selectByNo() {
//		
//	
//		
//		List<BoardVO> boardList =
//		sqlSession.selectList("mybatis.BoardDAO.selectByNo2","2");
//		
//		for (BoardVO boardVO : boardList) {
//			System.out.println(boardVO);
//		}
//	}
	
	public void selectDSQL() {
		BoardVO inputboardVO = new BoardVO();
		inputboardVO.setTitle("히히");
//		inputboardVO.setWriter("헤응");
		List<BoardVO> boardList = 
		sqlSession.selectList("mybatis.BoardDAO.selectDSQL",inputboardVO);
		
		for(BoardVO resulutboardVO : boardList) {
			System.out.println(resulutboardVO);
		}
	}
	
	public void deleteByName() {
		BoardVO boardVO = new BoardVO();
		boardVO.setWriter("김길동");
		sqlSession.delete("mybatis.BoardDAO.deleteByName", boardVO);	
		sqlSession.commit();
}
	
	public void updateByName() {
		
		BoardVO boardVO = new BoardVO();
		boardVO.setWriter("홍길동");
		boardVO.setTitle("히히");
		boardVO.setContent("오줌발싸");
		
		sqlSession.update("mybatis.BoardDAO.updateByName",boardVO);
		sqlSession.commit();
	}
	
	public void selectByNo3() {
		//map을 resultType으로 준다.
	
		
		Map<String, Object> map=
		sqlSession.selectOne("mybatis.BoardDAO.selectByNo3",2);
		
		Set<String> keyset = map.keySet();
		
		for(String key: keyset) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
	}
	
	
	

	public void selectByNo() {
	
//		int no = Integer.parseInt("2"); // 문자열 "2"를 정수로 변환
		
		List<BoardVO> boardList =
		sqlSession.selectList("mybatis.BoardDAO.selectByNo","2");
		
		for (BoardVO boardVO : boardList) {
			System.out.println(boardVO);
		}
	}
	
	
	public void selectByName2() {

		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectByName2","홍길동");
		
		for (BoardVO boardVO : boardList) {
			System.out.println(boardVO);
		}
	}
	
	

	public void selectByName() {
		BoardVO boardVO1 = new BoardVO();
		boardVO1.setWriter("홍길동");

		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectByName", boardVO1);
		
		for (BoardVO boardVO : boardList) {
			System.out.println(boardVO);
		}
	}

	public void selectAllPost() {
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectAll");

		for (BoardVO boardVO : boardList) {
			System.out.println(boardVO);
		}
	}

	public void insertNewPost() {
//		sqlSession.insert("mybatis.BoardDAO.insertNewPost");

		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("두번째제목이요");
		boardVO.setWriter("김길동");
		boardVO.setContent("내용이요");
		sqlSession.insert("mybatis.BoardDAO.insertNewPost2", boardVO); // insert를 할때 object를 넘겨주는 것(boardVO)

		sqlSession.commit();
	}
}
