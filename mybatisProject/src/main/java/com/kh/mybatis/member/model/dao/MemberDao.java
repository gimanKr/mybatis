package com.kh.mybatis.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.common.template.Template;
import com.kh.mybatis.member.model.vo.Member;

public class MemberDao {
	public int insertMember(SqlSession sqlSession, Member m) {
		
	int result = sqlSession.insert("memberMapper.insertMember", m);
	
	return result;
	}
	
	public Member loginMember(SqlSession sqlSession, Member m) {
		
		return sqlSession.selectOne("memberMapper.loginMember", m);
	}
}
