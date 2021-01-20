package io.terminus.trantor.demo.action;

import io.terminus.platform.sdk.transaction.DSTransaction;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.demo.dao.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户模型自定义 server action
 *
 * @author zhengdong.jzd@alibaba-inc.com
 * @date 2020/7/13
 */
@Slf4j
@Component
public class UserServerAction {
    @Autowired
    private UserRepository userRepository;


    /**
     * 保存用户
     */
    @TAction(modelClass = User.class)
    @DSTransaction
    public void save(User user) {
        userRepository.saveIgnoreRelationSkipNull(user);
    }


    /**
     * 更新用户
     */
    @TAction(modelClass = User.class)
    @DSTransaction
    public void update(User user) {
        userRepository.saveIgnoreRelationSkipNull(user);
    }


}