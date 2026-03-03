package com.absnippets.demoREST.controller;

import com.absnippets.demoREST.model.CloudVendor;
import com.absnippets.demoREST.response.ResponseHandler;
import com.absnippets.demoREST.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("/cloudVendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    @GetMapping("{vendorID}")
    public ResponseEntity<Object> getVendorDetails(@PathVariable("vendorID") String vendorID){

         return ResponseHandler.responseBuilder("Requested Vendor Details are given below",
                HttpStatus.OK,cloudVendorService.getCloudVendor(vendorID));

    }

    @GetMapping()
    public List<CloudVendor> getVendorDetails(){

        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){

        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){

        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendor(@PathVariable("vendorID") String vendorID){
        cloudVendorService.deleteCloudVendor(vendorID);
        return "Deleted";
    }
}

