package in.nit.service;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeService {

	Integer saveShipmentType(ShipmentType st);
	void update(ShipmentType st);
	void delete(Integer id);
	ShipmentType getOne(Integer id);
	List<ShipmentType> getAll();
	boolean isExist(Integer id);
	
}
