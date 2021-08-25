package com.xworkz.dryfruit.dao;

import com.xworkz.dryfruit.dto.DryfruitDTO;

public interface DryfruitDAO {
	int save(DryfruitDTO dto);

	int read(DryfruitDTO dto);
	

	int update(DryfruitDTO dto);
	int delete(DryfruitDTO dto);

}
