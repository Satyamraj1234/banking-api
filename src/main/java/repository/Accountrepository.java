package repository;

import org.springframework.data.jpa.repository.JpaRepository;


import entity.Account;


public interface Accountrepository extends JpaRepository<Account,Long> {

}
