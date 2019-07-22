package com.seecen.customer.service;

import com.github.pagehelper.PageInfo;
import com.seecen.customer.entity.Company;

public interface CompanyService {
    PageInfo<Company> findCompanyByPage(PageInfo<Company> info,String comName);
    Company findCompanyById(Integer id);
    Boolean updateCompany(Company company);
    Boolean addCompany(Company company);
    Boolean delCompany(Integer id);
}
