package com.ConverticStore.Convertic.domain.model.gateways;

import com.ConverticStore.Convertic.domain.model.Color;

public interface ColorRepository {

    Color saveColor(Color color);

    Color getColorById(Integer id);

    Color getColorByColor(String color);

    Color updateColor(Color color);

    void deleteColor(Integer id);


}
