package org.enset.customerservice.repository;

import org.enset.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

/**
 * @author zinebMerzak
 **/
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
