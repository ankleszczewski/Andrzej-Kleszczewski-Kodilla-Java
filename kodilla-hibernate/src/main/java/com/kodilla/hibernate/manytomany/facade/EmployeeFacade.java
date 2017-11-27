package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanyByName(String name) throws NameFindingException {
        LOGGER.info("Trying to search company");
        List<Company> companyName = companyDao.findCompanyByName(name);
        if (!companyName.isEmpty()) {
            LOGGER.info("Company " + companyName + " found");
            return companyName;
        } else {
            LOGGER.error(NameFindingException.ERR_COMPANY_NOT_FOUND);
            throw new NameFindingException(NameFindingException.ERR_COMPANY_NOT_FOUND);
        }
    }

    public List<Employee> findByLastname(String lastname) throws NameFindingException {
        LOGGER.info("Trying to search for employee");
        List<Employee> employeeLastname = employeeDao.findByLastname("%" + lastname + "%");
        if (!employeeLastname.isEmpty()) {
            LOGGER.info("Employee " + employeeLastname + " found");
            return employeeLastname;
        } else {
            LOGGER.error(NameFindingException.ERR_EMPLOYYE_NOT_FOUND);
            throw new NameFindingException(NameFindingException.ERR_EMPLOYYE_NOT_FOUND);
        }
    }
}
