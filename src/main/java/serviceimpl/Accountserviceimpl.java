package serviceimpl;

import org.springframework.stereotype.Service;

import Mapper.accountmapper;
import dto.Accountdto;
import entity.Account;
import repository.Accountrepository;
import service.Accountservice;
@Service 
public class Accountserviceimpl implements Accountservice {
	//adding dependencies
   private Accountrepository accountrepository;
   //constructor
   
	public Accountserviceimpl(Accountrepository accountrepository) {
		
		this.accountrepository = accountrepository;
	}
@Override
public Accountdto createAccount(Accountdto accountdto) {
	// TODO Auto-generated method stub
	 Account account= accountmapper.maptoAccount(accountdto);
	Account savedAccount = accountrepository.save(account);
	
	return accountmapper.maptoAccountdto(savedAccount);
}

	

}
