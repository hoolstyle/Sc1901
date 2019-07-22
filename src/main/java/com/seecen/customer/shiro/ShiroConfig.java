package com.seecen.customer.shiro;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author 山泊树
 * @create 2019/7/12 19:38
 */
@Slf4j
@Configuration
public class ShiroConfig {

    //用于thymeleaf模板使用shiro标签
    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }

/**
 * 创建ShiroFilterFactoryBean
 */

    @Bean("getShiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //定义登陆的url
        shiroFilterFactoryBean.setLoginUrl("/toLogin");
        //定义登陆成功的url
        shiroFilterFactoryBean.setSuccessUrl("/index");
        //没有权限的时候跳转的url
        shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");

        //添加Shiro内置过滤器
/**
 * Shiro内置过滤器，可以实现权限相关的拦截器
 *  常用的过滤器:
 *      anon:无需认证（登陆）就可以访问
 *      authc:必须认证才可以访问
 *      user:如果使用rememberMe的功能可以直接访问--专门针对记住密码的一个
 *      perms:该资源必须得到资源权限才可以访问
 *      perms:该资源必须得到资源权限才可以访问
 *      role:该资源必须得到角色权限才可以访问
 */
        Map<String,String> filterMap = new LinkedHashMap<String,String>();
        filterMap.put("/css/**","anon");
        filterMap.put("/fonts/**","anon");
        filterMap.put("/images/**","anon");
        filterMap.put("/js/**","anon");
        filterMap.put("/li/layui/**","anon");
        filterMap.put("/css/**","anon");
        filterMap.put("/font/**","anon");
        filterMap.put("/images/face/**","anon");
        filterMap.put("/lay/modules/**","anon");
        filterMap.put("/wangEditor/**","anon");
        filterMap.put("/component/**","anon");
        filterMap.put("/users/login","anon");
        /*filterMap.put("")*/
        //具有admin角色才能访问/users接口
        filterMap.put("/users","roles[admin]");
        //具有user:add权限才能访问/user/add
        filterMap.put("/view/list","perms[user:add]");
        filterMap.put("/company/list","perms[user:add]");
        filterMap.put("backend/update.html/{id}","perms[user:add]");
        filterMap.put("/**","user");
        filterMap.put("/**","authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
        //当把所有路径都拦截后我们肯定要放行几个接口，可以这样写
       /* filterMap.put("/hello","anon");
        filterMap.put("/login","anon");
        filterMap.put("/*","authc");
        //授权过滤器，当授权拦截后，shiro会自动跳转到未授权页面

        //修改调整的登陆页面，未认证的都跳到login页面
        shiroFilterFactoryBean.setLoginUrl("/toLogin");
        //设置未授权提示页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");*/
        //如果一个文件加的所有文件都需要拦截我们可以使用这样
//        filterMap.put("/*","authc"); || filterMap.put("/user--文件夹名/*");

    }

/**
 * 创建DefaultWebSecurityManager
 */

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

/**
 * 创建Realm
 */

    @Bean(name = "userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }



    //让spring来代理
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("securityManager")DefaultWebSecurityManager defaultWebSecurityManager){
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(defaultWebSecurityManager);
        return advisor;
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }















}
