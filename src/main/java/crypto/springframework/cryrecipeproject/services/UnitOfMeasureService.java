package crypto.springframework.cryrecipeproject.services;

import crypto.springframework.cryrecipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();


}
