package com.seecen.customer.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.customer.dao.CenterMapper;
import com.seecen.customer.entity.Center;
import com.seecen.customer.entity.CenterExample;
import com.seecen.customer.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@Service
public class CenterServiceImpl implements CenterService {

    @Autowired
    private CenterMapper centerMapper;

    @Override
    public List<Center> centerList() {
        CenterExample centerExample = new CenterExample();
        CenterExample.Criteria criteria = centerExample.createCriteria();
        criteria.andCenterFlagEqualTo(1);

        return centerMapper.selectByExample(centerExample);
    }

    @Override
    public PageInfo<Center> pageCenter(PageInfo<Center> pageInfo, String centerName) {
        CenterExample centerExample = new CenterExample();
        CenterExample.Criteria criteria = centerExample.createCriteria();
        if (!StringUtils.isEmpty(centerName)){
            criteria.andCenterNameLike("%"+centerName+"%");
        }
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<Center> centerList = centerMapper.selectByExample(centerExample);
        return PageInfo.of(centerList);
    }

    @Override
    public Boolean addCenter(Center center) {
            if (centerMapper.insert(center)>0){
                return true;
            }else {
                return false;
            }

    }

    @Override
    public Boolean delCenter(Integer id) {
        if (centerMapper.deleteByPrimaryKey(id)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delAllCenter(List<Integer> ids) {
        if (ids.size()>0){
            CenterExample centerExample = new CenterExample();
            CenterExample.Criteria criteria = centerExample.createCriteria();
            criteria.andIdIn(ids);
            centerMapper.deleteByExample(centerExample);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Center selCenter(Integer id) {

        return centerMapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean updateCenter(Center center) {
        if (centerMapper.updateByPrimaryKey(center)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean updateFlag(Integer id) {
        Center center =centerMapper.selectByPrimaryKey(id);
        if (center!=null){
            if (center.getCenterFlag()==1){
                center.setCenterFlag(2);
                centerMapper.updateByPrimaryKey(center);
            }else {
                center.setCenterFlag(1);
                centerMapper.updateByPrimaryKey(center);
            }
            return true;
        }else {
            return false;
        }
    }

    @Override
    public PageInfo<Center> findList(PageInfo<Center> pageInfo, Integer id) {
//        CenterExample centerExample = new CenterExample();
//        CenterExample.Criteria criteria = centerExample.createCriteria();
//        if (!StringUtils.isEmpty(centerName)){
//            criteria.andCenterNameLike("%"+centerName+"%");
//        }
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<Center> centerList = centerMapper.findList(id);
        return PageInfo.of(centerList);
    }

    @Override
    public int accountCenter(String centerName) {
        return centerMapper.accountCenter(centerName);
    }

}
