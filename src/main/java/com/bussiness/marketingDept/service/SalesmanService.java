package com.bussiness.marketingDept.service;

import java.util.ArrayList;
import java.util.List;

import com.bussiness.marketingDept.DTO.SalesmanDTO;
import com.bussiness.marketingDept.model.SalesmanMaster;
import com.bussiness.marketingDept.repository.SalesmanMasterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesmanService {

    @Autowired
    private SalesmanMasterRepository salesmanMasterRepository;

    public void saveData(SalesmanDTO salesmanDTO){
        SalesmanMaster salesman_Master =new SalesmanMaster();

        salesman_Master.setSalesmanNo(salesmanDTO.getSalesmanNo());
        salesman_Master.setSalesmanName(salesmanDTO.getSalesmanName());
        salesman_Master.setAddress1(salesmanDTO.getAddress1());
        salesman_Master.setAddress2(salesmanDTO.getAddress2());
        salesman_Master.setCity(salesmanDTO.getCity());
        salesman_Master.setPincode(salesmanDTO.getPincode());
        salesman_Master.setState(salesmanDTO.getState());
        salesman_Master.setSaleAmount(salesmanDTO.getSaleAmount());
        salesman_Master.setTgtToGet(salesmanDTO.getTgtToGet());
        salesman_Master.setYtdSales(salesmanDTO.getYtdSales());
        salesman_Master.setRemarks(salesmanDTO.getRemarks());

        salesmanMasterRepository.save(salesman_Master);
    }

    public List<SalesmanDTO> getAllSalesman(){
        List<SalesmanDTO> salesmanDTOList=new ArrayList<>();
        List<SalesmanMaster> salesman_MasterList =new ArrayList<>();
        
        salesmanMasterRepository.findAll().forEach(salesman-> salesman_MasterList.add(salesman));
        for(SalesmanMaster salesman_Master : salesman_MasterList){
            SalesmanDTO salesmanDTO=new SalesmanDTO();
            salesmanDTO.setSalesmanNo(salesman_Master.getSalesmanNo());
            salesmanDTO.setSalesmanName(salesman_Master.getSalesmanName());
            salesmanDTO.setAddress1(salesman_Master.getAddress1());
            salesmanDTO.setAddress2(salesman_Master.getAddress2());
            salesmanDTO.setCity(salesman_Master.getCity());
            salesmanDTO.setPincode(salesman_Master.getPincode());
            salesmanDTO.setState(salesman_Master.getState());
            salesmanDTO.setSaleAmount(salesman_Master.getSaleAmount());
            salesmanDTO.setTgtToGet(salesman_Master.getTgtToGet());
            salesmanDTO.setYtdSales(salesman_Master.getYtdSales());
            salesmanDTO.setRemarks(salesman_Master.getRemarks());

            salesmanDTOList.add(salesmanDTO);
        }
        return salesmanDTOList;
    }

    public SalesmanDTO getSalesmanById(String id){
        SalesmanMaster salesman_Master =salesmanMasterRepository.findById(id).get();
        SalesmanDTO salesmanDTO=new SalesmanDTO();
            salesmanDTO.setSalesmanNo(salesman_Master.getSalesmanNo());
            salesmanDTO.setSalesmanName(salesman_Master.getSalesmanName());
            salesmanDTO.setAddress1(salesman_Master.getAddress1());
            salesmanDTO.setAddress2(salesman_Master.getAddress2());
            salesmanDTO.setCity(salesman_Master.getCity());
            salesmanDTO.setPincode(salesman_Master.getPincode());
            salesmanDTO.setState(salesman_Master.getState());
            salesmanDTO.setSaleAmount(salesman_Master.getSaleAmount());
            salesmanDTO.setTgtToGet(salesman_Master.getTgtToGet());
            salesmanDTO.setYtdSales(salesman_Master.getYtdSales());
            salesmanDTO.setRemarks(salesman_Master.getRemarks());

        return salesmanDTO;

    }

    public SalesmanDTO updateSalesmanById(SalesmanDTO salesmanDTO){

        SalesmanMaster salesman_Master =new SalesmanMaster();

        salesman_Master.setSalesmanNo(salesmanDTO.getSalesmanNo());
        salesman_Master.setSalesmanName(salesmanDTO.getSalesmanName());
        salesman_Master.setAddress1(salesmanDTO.getAddress1());
        salesman_Master.setAddress2(salesmanDTO.getAddress2());
        salesman_Master.setCity(salesmanDTO.getCity());
        salesman_Master.setPincode(salesmanDTO.getPincode());
        salesman_Master.setState(salesmanDTO.getState());
        salesman_Master.setSaleAmount(salesmanDTO.getSaleAmount());
        salesman_Master.setTgtToGet(salesmanDTO.getTgtToGet());
        salesman_Master.setYtdSales(salesmanDTO.getYtdSales());
        salesman_Master.setRemarks(salesmanDTO.getRemarks());

        salesmanMasterRepository.save(salesman_Master);

        return salesmanDTO;
    }    

    public void deleteSalesmanDataById(String id){
        salesmanMasterRepository.deleteById(id);
    }
    
}
