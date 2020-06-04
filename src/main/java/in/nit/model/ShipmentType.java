package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ShipmentType {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String shipmentMode;
	private String shipmentCode;
	private String shipmentEnable;
	private String shipmentGrade;
	private String shipmentDesc;
	
	
	
}
