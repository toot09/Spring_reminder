package hello.itemservice.domain.item;

public enum ItemType {
    BOOK("도서"), FOOD("도서"), ETC("도서");
    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}
