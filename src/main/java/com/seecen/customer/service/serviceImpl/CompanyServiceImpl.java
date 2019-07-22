package com.seecen.customer.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.CompanyMapper;
import com.seecen.customer.entity.Company;
import com.seecen.customer.entity.CompanyExample;
import com.seecen.customer.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public PageInfo<Company> findCompanyByPage(PageInfo<Company> info,String comName) {
        CompanyExample companyExample=new CompanyExample();
        CompanyExample.Criteria criteria=companyExample.createCriteria();
        if (comName!=null){
            criteria.andComNameLike("%"+comName+"%");
        }
        PageHelper.startPage(info.getPageNum(),info.getPageSize());
        List<Company> list=companyMapper.selectByExample(companyExample);
        return PageInfo.of(list);
    }

    @Override
    public Company findCompanyById(Integer id) {
        return companyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean updateCompany(Company company) {
        return companyMapper.updateByPrimaryKey(company)>0;
    }

    @Override
    public Boolean addCompany(Company company) {
        return companyMapper.insert(company)>0;
    }

    @Override
    public Boolean delCompany(Integer id) {
        return companyMapper.deleteByPrimaryKey(id)>0;
    }
}
