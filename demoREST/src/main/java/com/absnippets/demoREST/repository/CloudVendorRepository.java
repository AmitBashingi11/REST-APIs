package com.absnippets.demoREST.repository;

import com.absnippets.demoREST.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
