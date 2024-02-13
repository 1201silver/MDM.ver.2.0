package ddwu.project.mdm_ver2.domain.secondhand.dto.shBid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SecondHandBidDto {

    private Long id;
    private Long shId;
    private Long bidUserId;
    private int price;

}