package fun.sast.sast_shop.controller;

import fun.sast.sast_shop.pojo.entity.Bill;
import fun.sast.sast_shop.pojo.entity.User;
import fun.sast.sast_shop.pojo.model.BillModel;
import fun.sast.sast_shop.pojo.model.LoginModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@ResponseBody
@RequestMapping("/user")
public interface UserController {
    /**
     * 请简单实现一个登录，即检查密码并返回用户信息，无需考虑鉴权问题
     * @param loginModel account & Password
     * @return User
     */
    @GetMapping("/login")
    User login(@RequestBody LoginModel loginModel);

    /**
     * 查看历史订单详情
     * @param userId 用户id
     * @return ok
     */
    @GetMapping("/login")
    List<BillModel> getHistory(Long userId);

    /**
     * 添加订单
     * @param bill 添加单笔订单
     * @return ok
     */
    @PostMapping("/login")
    String addBill(@RequestBody Bill bill);

    /**
     * 批量支付订单
     * @param BillIds 所有要支付订单的id
     * @return ok
     */
    @PostMapping("/login")
    String PayForBills(@RequestBody List<Integer> BillIds);

    /**
     * 批量取消订单
     * @param BillIds 所有要取消订单的id
     * @return ok
     */
    @PostMapping("/login")
    String cancelBills(@RequestBody List<Integer> BillIds);

}
