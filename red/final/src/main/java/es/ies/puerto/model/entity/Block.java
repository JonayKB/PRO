package es.ies.puerto.model.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
@Entity
public class Block extends Item {
    private static final long serialVersionUID = 1223365051L;
    private boolean placeable;

    public Block() {
    }

    public Block(Integer id, String name,boolean placeable) {
        super(id, name);
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                " placeable='" + isPlaceable() + "'" +
                "}";
    }

}
