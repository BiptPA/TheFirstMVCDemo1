package example.service;

import example.dto.CompanyDto;

public interface ICompanyService {

    /**
     * 获取当前登录HR的公司信息
     * @return
     */
    CompanyDto getCompany(String companyId);

//    String getAllpositions();
//
//    List<DeliverDetail> getAllinfor();
}
