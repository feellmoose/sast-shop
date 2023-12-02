package fun.sast.sast_shop.service;

import fun.sast.sast_shop.pojo.entity.Bill;
import fun.sast.sast_shop.pojo.entity.User;
import fun.sast.sast_shop.pojo.model.BillModel;
import fun.sast.sast_shop.pojo.model.LoginModel;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface UserService {
    List<BillModel> getHistory(Long userId);
    String addBill(Bill bill);
    String PayForBills(List<Integer> BillIds);
    String cancelBills(List<Integer> BillIds);
}
