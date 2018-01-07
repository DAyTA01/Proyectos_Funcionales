package com.mx.web.models.dao;
import java.util.List;

import com.mx.web.models.entity.Cliente;

public interface IClienteDao {
	
	public List<Cliente> findAll();
}
