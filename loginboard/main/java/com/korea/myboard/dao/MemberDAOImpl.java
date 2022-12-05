package com.korea.myboard.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.korea.myboard.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	SqlSession sql;
	
	@Override
	public void register(MemberVO vo) throws Exception {
		
		sql.insert("memberMapper.register", vo);
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		
		return sql.selectOne("memberMapper.login",vo);
	}

	@Override
	public void memberUpdate(MemberVO vo) throws Exception {
		
		sql.update("memberMapper.memberUpdate",vo);
	}

	@Override
	public void memberDelete(MemberVO vo) throws Exception {
		
		sql.delete("memberMapper.memberDelete",vo);
	}

}
