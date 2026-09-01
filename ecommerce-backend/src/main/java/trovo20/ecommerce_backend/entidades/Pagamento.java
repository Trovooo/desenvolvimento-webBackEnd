package trovo20.ecommerce_backend.entidades;

import java.lang.annotation.Inherited;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Integer id;
    private BigDecimal value;
    private LocalDateTime data;
    private String status;
    private String type;
    @OneToOne
    private Pedido pedido;
}
