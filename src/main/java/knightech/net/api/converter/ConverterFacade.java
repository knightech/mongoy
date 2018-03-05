package knightech.net.api.converter;

import knightech.net.api.converter.factory.ConverterFactory;
import knightech.net.api.dto.UserDTO;
import knightech.net.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ConverterFacade {

    @Autowired
    private ConverterFactory converterFactory;

    public User convert(final UserDTO dto) {
        return (User) converterFactory.getConverter(dto.getClass()).convert(dto);
    }
}
