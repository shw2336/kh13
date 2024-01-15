package com.kh.spring06.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring06.dto.MenuDto;

@Service
public class MenuMapper implements RowMapper<MenuDto> {

	@Override
	public MenuDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		MenuDto dto = new MenuDto();
		dto.setMenuNo(rs.getInt("menu_no"));
		dto.setMenuNameKor(rs.getString("menu_kor"));
		dto.setMenuNameEng(rs.getString("menu_eng"));
		dto.setMenuType(rs.getString("menu_type"));
		dto.setMenuPrice(rs.getInt("menu_price"));
		
		return dto;
	}

}
