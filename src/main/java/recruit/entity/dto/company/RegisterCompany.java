package recruit.entity.dto.company;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RegisterCompany {
    private String companyName;
    private String corporation;
    private String phone;
    private String address;
    private String email;
    private String password;
}
