package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DaoI;
import com.model.ModelC;

@Service
public class ServiceC implements ServiceI{

	@Autowired
	private DaoI daoI;
	
	public DaoI getDaoI() {
		return daoI;
	}

	public void setDaoI(DaoI daoI) {
		this.daoI = daoI;
	}

	@Transactional
	@Override
	public void SaveData(ModelC modelc) {
		// TODO Auto-generated method stub
		daoI.SaveData(modelc);
	}

	@Transactional
	@Override
	public void delData(ModelC modelc) {
		// TODO Auto-generated method stub
		daoI.delData(modelc);
	}

	@Transactional
	@Override
	public void upData(ModelC modelc) {
		// TODO Auto-generated method stub
		daoI.updata(modelc);
	}

}
