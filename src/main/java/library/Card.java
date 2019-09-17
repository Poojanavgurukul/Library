package library;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private final List<CardItem>detail=new ArrayList<>();
    public void addDetail(CardItem cardItem){
        detail.add(cardItem);
    }

    public List<CardItem> getDetail() {
        return detail;
    }
}
