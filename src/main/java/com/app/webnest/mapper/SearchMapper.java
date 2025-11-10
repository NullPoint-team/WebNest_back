package com.app.webnest.mapper;

import com.app.webnest.domain.vo.UserInsertSocialVO;
import com.app.webnest.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface SearchMapper {


  // 회원 조회

//  승찬 기생중-------------------
  public List<UserVO> selectByQuery(String query);
}
