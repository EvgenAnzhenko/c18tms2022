package by.clothing.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ClothingSize {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);
    @Getter
    private final int size;

    public String getDescription() {
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return "Size " + size;
    }
}
