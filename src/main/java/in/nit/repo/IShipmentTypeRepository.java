package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.nit.model.ShipmentType;

public interface IShipmentTypeRepository extends JpaRepository<ShipmentType, Integer> {

}
