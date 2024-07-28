package com.lingyi.system.listener.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.lingyi.system.pojo.dto.UserImportDTO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Yixiaoyi03
 * @date 2022/4/10 20:49
 */
@Component
@Scope("prototype")
public class UserImportListener extends AnalysisEventListener<UserImportDTO.UserItem> {

    @Override
    public void invoke(UserImportDTO.UserItem userItem, AnalysisContext analysisContext) {

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
