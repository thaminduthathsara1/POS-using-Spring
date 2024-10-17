package lk.ijse.gdse.aad.possystemusingspring.service;

import lk.ijse.gdse.aad.possystemusingspring.customObj.ItemResponse;
import lk.ijse.gdse.aad.possystemusingspring.dto.ItemDto;

import java.util.List;

public interface ItemService {
    public void saveItem(ItemDto itemDto);
    public void updateItem(String itemCode, ItemDto itemDto);
    public ItemResponse getItem(String itemCode);
    public List<ItemDto> getAllItems();
    public void deleteItem(String itemCode);
}
