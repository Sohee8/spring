package com.korea.myboard.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.korea.myboard.dao.BoardDAO;
import com.korea.myboard.vo.BoardVO;
import com.korea.myboard.vo.SearchCriteria;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject BoardDAO dao;
	
	@Override
	public void write(BoardVO boardVO) throws Exception {
		
		dao.write(boardVO);
	}

	@Override
	public List<BoardVO> list(SearchCriteria scri) throws Exception {
		
		return dao.list(scri);
	}

	@Override
	public int listCount(SearchCriteria scri) throws Exception {
		
		return dao.listCount(scri);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		
		return dao.read(bno);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		
		dao.update(boardVO);
	}

	@Override
	public void delete(int bno) throws Exception {
		
		dao.delete(bno);
	}

}
