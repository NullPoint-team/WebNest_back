package com.app.webnest.mapper.post;

import com.app.webnest.domain.dto.PostResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
    // 전체 조회
    public List<PostResponseDTO> selectAll();

    // 상세 조회
    public Optional<PostResponseDTO> select(Long id);

    // 마이페이지 - 조회
    public List<PostResponseDTO> selectAllByUserId(Long id);

    //수정

}
