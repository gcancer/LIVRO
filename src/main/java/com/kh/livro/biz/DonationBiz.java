package com.kh.livro.biz;

import java.util.HashMap;
import java.util.List;

import com.kh.livro.dto.DonationDto;

public interface DonationBiz {

	public List<DonationDto> selectList();
	public List<DonationDto> selectUser(String member_id);
	public List<HashMap<String, Object>> selectAmountById(String member_id);
	public List<HashMap<String, Object>> selectDaily(DonationDto dto);
	public int insert(DonationDto dto);
	public int delete(int dona_no);
	public DonationDto selectAmountByUser(String dona_nickname);
}
