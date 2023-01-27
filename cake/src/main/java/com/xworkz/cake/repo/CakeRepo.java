package com.xworkz.cake.repo;
import java.util.List;

import com.xworkz.cake.dto.CakeDto;
public interface CakeRepo {
	public boolean save(CakeDto dto);

	public CakeDto findById(int id);

	public List<CakeDto> readall();

	public boolean updateByName(String name);

	public boolean deleteById(int id);
}
