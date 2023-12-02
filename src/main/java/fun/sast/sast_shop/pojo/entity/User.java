
package fun.sast.sast_shop.pojo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @JsonIgnore
    private long id;
    private String nickname;
    private String email;
    private String phoneNumber;
    private long account;
    @JsonIgnore
    private String password;
}
