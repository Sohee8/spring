package com.korea.myboard.dao;

import java.util.List;

import com.korea.myboard.vo.BoardVO;
import com.korea.myboard.vo.SearchCriteria;

public interface BoardDAO {

	public void write(BoardVO boardVO) throws Exception;

	public List<BoardVO> list(SearchCriteria scri) throws Exception;

	public int listCount(SearchCriteria scri) throws Exception;

	public BoardVO read(int bno) throws Exception;

	public void update(BoardVO boardVO) throws Exception;

	public void delete(int bno) throws Exception;
	

}
