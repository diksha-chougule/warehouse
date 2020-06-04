package in.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.model.ShipmentType;
import in.nit.repo.IShipmentTypeRepository;
import in.nit.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {
    @Autowired
	IShipmentTypeRepository repo;
	
    @Transactional
	public Integer saveShipmentType(ShipmentType st) {
		
		Integer  id=repo.save(st).getId();
		return id;
	}

    @Transactional
	public void update(ShipmentType st) {
		
		repo.save(st);
	}

    @Transactional
	public void delete(Integer id) {
		
		repo.deleteById(id);
	}

	@Transactional(readOnly = true)
	public ShipmentType getOne(Integer id) {
		Optional<ShipmentType> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Transactional(readOnly = true)
	public List<ShipmentType> getAll() {
		List<ShipmentType> list=repo.findAll();
		return list;
	}

	@Transactional(readOnly = true)
	public boolean isExist(Integer id) {
		boolean exist=repo.existsById(id);
		return exist;
	}

}
