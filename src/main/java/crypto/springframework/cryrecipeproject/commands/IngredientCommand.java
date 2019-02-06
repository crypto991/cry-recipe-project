package crypto.springframework.cryrecipeproject.commands;

import crypto.springframework.cryrecipeproject.domain.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {

    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure uom;
    private UnitOfMeasureCommand unitOfMeasure;



}