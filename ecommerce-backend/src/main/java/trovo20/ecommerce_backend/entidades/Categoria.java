package trovo20.ecommerce_backend.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Categoria {
    private Short id;
    private String name;
    private String description;
    
}
