package es.ies.puerto.api.dto;



public class BlockDto extends ItemDto {
    private boolean placeable;

    public BlockDto() {
    }

    public BlockDto(boolean placeable) {
        this.placeable = placeable;
    }

    public boolean isPlaceable() {
        return this.placeable;
    }

    public boolean getPlaceable() {
        return this.placeable;
    }

    public void setPlaceable(boolean placeable) {
        this.placeable = placeable;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "{" +
                " placeable='" + isPlaceable() + "'" +
                "}";
    }

}
