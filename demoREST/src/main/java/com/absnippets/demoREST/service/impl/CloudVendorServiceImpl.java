package com.absnippets.demoREST.service.impl;

import com.absnippets.demoREST.model.CloudVendor;
import com.absnippets.demoREST.repository.CloudVendorRepository;
import com.absnippets.demoREST.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorID) {
        cloudVendorRepository.deleteById(cloudVendorID);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorID) {

        return cloudVendorRepository.findById(cloudVendorID).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
