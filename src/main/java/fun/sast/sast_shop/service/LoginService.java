package fun.sast.sast_shop.service;

import fun.sast.sast_shop.pojo.entity.User;
import fun.sast.sast_shop.pojo.model.LoginModel;

public interface LoginService {
    User login(LoginModel loginModel);
}
