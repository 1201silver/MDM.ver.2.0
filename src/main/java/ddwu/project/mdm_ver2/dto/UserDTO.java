package ddwu.project.mdm_ver2.dto;

import ddwu.project.mdm_ver2.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private long userCode;

    private String userNickname;

    private String kakaoEmail;

    private String kakaoProfileImg;

    private String userRole;

    public User toEntity() {
        return User.builder()
                .userCode(userCode)
                .userNickname(userNickname)
                .kakaoEmail(kakaoEmail)
                .kakaoProfileImg(kakaoProfileImg)
                .userRole(userRole)
                .build();
    }

    public long getUserCode() {
        return userCode;
    }

    public void setUserCode(long userCode) {
        this.userCode = userCode;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getKakaoEmail() {
        return kakaoEmail;
    }

    public void setKakaoEmail(String kakaoEmail) {
        this.kakaoEmail = kakaoEmail;
    }

    public String getKakaoProfileImg() {
        return kakaoProfileImg;
    }

    public void setKakaoProfileImg(String kakaoProfileImg) {
        this.kakaoProfileImg = kakaoProfileImg;
    }
}
