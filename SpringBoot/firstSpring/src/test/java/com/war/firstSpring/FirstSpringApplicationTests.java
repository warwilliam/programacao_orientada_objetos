package com.war.firstSpring;

import com.war.firstSpring.Dao.impl.AddressDao;
import com.war.firstSpring.Dao.impl.DentistDao;
import com.war.firstSpring.Dao.impl.PatientDao;
import com.war.firstSpring.model.Address;
import com.war.firstSpring.model.Dentist;
import com.war.firstSpring.model.Patient;
import com.war.firstSpring.service.AddressService;
import com.war.firstSpring.service.DentistService;
import com.war.firstSpring.service.PacientService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.Optional;



@SpringBootTest
class FirstSpringApplicationTests {



	private static DentistService dentistService = new DentistService(new DentistDao());

	private static AddressService addressService = new AddressService(new AddressDao());

	private static PacientService pacientService = new PacientService(
			new PatientDao(
					new AddressDao()));
	@Test
	void contextLoads() {
	}

	//Dentist CRUD

	@Test
	@Disabled
	public void insertDentist() throws Exception {
		Dentist dentist = new Dentist(
				"Carie", "happrytooth@gmmail.com", 14575, 1);
		Dentist dentist1 = new Dentist(
				"Blue Tooth", "happrytooth@gmmail.com", 54588, 1);
		Dentist dentist2 = new Dentist(
				"Coelho malucao", "tooth@gmmail.com", 6645, 0);
		dentistService.save(dentist);
		dentistService.save(dentist1);
		dentistService.save(dentist2);
	}

	@Test
	public void takeAllDentists() throws Exception {
		List<Dentist> dentistList = dentistService.searchAll();
		System.out.println(dentistList);
	}

	@Test
	public void DeleteDentist() throws Exception {
		dentistService.delete(2);
	}

	@Test
	public void searchDentistbyId() throws Exception {
		Optional<Dentist> d = dentistService.searchById(1);
		System.out.println(d);
	}

	@Test
	public void updateDentist() throws Exception {
		Dentist dentist = new Dentist(1,"Coelho","Obtura",166,0);
		Dentist dentistUpdated = dentistService.update(dentist);
		System.out.println(dentistUpdated);
	}

	//Address CRUD

	@Test
	@Disabled
	public void  insertAddress() throws Exception{
		Address address = new Address(
				"rua 8","88","Campinas","Jd das flores","SP");
		Address address1 = new Address(
				"rua 10","66","Amparo","Pq Italia","SP");

		addressService.save(address);
		addressService.save(address1);
	}

	@Test
	public void takeAllAddresses()throws Exception{
		List<Address> addressList = addressService.tekaAllAddress();
		System.out.println(addressList);
	}


	@Test
	public void searchAddressbyId() throws Exception {
		Optional<Address> a = addressService.searchById(1);
		System.out.println(a);
	}

	@Test
	@Disabled
	public void deleteById() throws Exception {
		addressService.deleteById(2);
	}

	@Test
	public void updateAddressById() throws Exception{
		Address address = new Address(1, "Rua 7 atualizada","78","Campinas updated","Nova vizinança","SP");
		addressService.update(address);
	}

	@Test
	public void postPatient() throws Exception {
		Address address = new Address("Av 1","75","São Caetano","Centro","SP");

		Patient pacient = new Patient("Coelho","Cizo","11122233344",new Date(), address);

		pacientService.save(pacient);
	}

	@Test
	public void searchPatientById() throws Exception {
		Optional<Patient> patient = pacientService.searchById(1);
		System.out.println(patient);
	}

	@Test
	public void deletePatient() throws Exception {
		pacientService.delete(2);
	}

	@Test
	public void searchAllPatients() throws Exception {
		pacientService.selectAll();
	}

	@Test
	public void updatePatient() throws Exception {
		Address address4 = new Address(16,"AV Paulista","1500","São Paulo","Centro","SP");
		Patient pacient = new Patient(1,"Kid","quebra dente","11122233344", address4);
		pacientService.update(pacient);
	}

}
