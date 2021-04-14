package recruit.entity.table;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_deliver")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeliverEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String username;
    private long jobId;
    private long companyId;
    private String jobName;
}
